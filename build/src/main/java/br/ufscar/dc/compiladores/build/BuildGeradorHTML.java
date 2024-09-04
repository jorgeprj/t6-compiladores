package br.ufscar.dc.compiladores.build;

import br.ufscar.dc.compiladores.build.TabelaDeSimbolos.TipoBUILD;

public class BuildGeradorHTML extends BUILDBaseVisitor {

    StringBuilder saida;
    TabelaDeSimbolos tabela;

    public BuildGeradorHTML() {
        saida = new StringBuilder();
        this.tabela = new TabelaDeSimbolos();
    }

    @Override
    public Void visitMontagem(BUILDParser.MontagemContext ctx) {
        String texto;
        String nome;
        
        //inicia a página:
        saida.append("<html>\n");
        saida.append("<head>\n");
        saida.append("<title>");
        nome = ctx.nome().CADEIA().getText();
        nome = nome.substring(1, nome.length() - 1);
        saida.append("Montagem: " + nome);
        saida.append("</title> \n");
        
        //Para centralizar a imagem:
        saida.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
        saida.append("<style>\n");
        saida.append("img {\n");
        saida.append("display: block;\n");
        saida.append("margin-left: auto;\n");
        saida.append("margin-right: auto;\n");
        saida.append("}\n");
        saida.append("</style>\n");
        saida.append("</head> \n");
        saida.append("<body> \n");
        saida.append("<header> \n");
        saida.append("<section> \n");
        saida.append("<center>\n");
        
        //Nome da Montagem:
        saida.append("<h1>" + nome + "</h1>\n");
        saida.append("</center>\n");
        
        //Adiciona a imagem:
        if (ctx.imagem() != null) {
            texto = ctx.imagem().CADEIA().getText();
            texto = texto.substring(1, texto.length() - 1);
            saida.append("<img src= " + texto + " alt=" + nome + " style=\"width:400px;height:270px;\" style=\"width:50%;\">\n");
        }
        saida.append("<p>Tempo de Montagem: ");
        for (var tempo : ctx.tempo_mont().tempo()) {
            saida.append(tempo.NUMERO().getText() + " " + tempo.unidade_tempo().getText() + " ");
        }
        saida.append("</p>\n");
        for (var par : ctx.paragrafo()) {
            texto = par.CADEIA().getText();
            texto = texto.substring(1, texto.length() - 1);
            saida.append("<p>" + texto + "</p>\n");
        }
        saida.append("</section>\n");
        saida.append("</header>\n");
        
        //Seção de componentes:
        saida.append("<section id=\"componentes\" >\n");
        saida.append("<h2>Componentes:</h2>\n");
        visitComponentes(ctx.componentes());
        saida.append("</section>\n");
        
        //Seção de preparo:
        saida.append("<section id=\"preparo\" >\n");
        saida.append("<h2>Modo de Preparo:</h2>\n");
        visitPasso(ctx.passo());
        saida.append("</section>\n");
        
        //Termina a página:
        saida.append("</body>\n");
        saida.append("</html>");
        return null;
    }

    //Visitante para os Componentes:
    @Override
    public Void visitComponentes(BUILDParser.ComponentesContext ctx) {
        ctx.lista_componentes().forEach(ing -> visitLista_componentes(ing));
        if (ctx.lista_tempero() != null) {
            ctx.lista_tempero().forEach(temp -> visitLista_tempero(temp));
        }
        return null;
    }

    @Override
    public Void visitLista_componentes(BUILDParser.Lista_componentesContext ctx) {
        if (ctx.COMPONENTE() != null) {
            String nomeIng = ctx.COMPONENTE().getText();
            tabela.adicionar(nomeIng, TipoBUILD.COMPONENTE);
            saida.append("<li>");
            if (ctx.medida_liq() != null) {
                saida.append(ctx.medida_liq().getText() + " de ");
            } else if (ctx.medida_solido() != null) {
                if (ctx.medida_solido().tipo_colher() != null) {
                    saida.append(ctx.medida_solido().NUMERO().getText() + " colheres de " + ctx.medida_solido().tipo_colher().getText() + " de ");
                } else {
                    saida.append(ctx.medida_solido().getText() + " de ");
                }
            }
            saida.append(ctx.COMPONENTE().getText() + "</li>\n");
        }
        return null;
    }

    @Override
    public Void visitLista_tempero(BUILDParser.Lista_temperoContext ctx) {
        String nomeTemp = ctx.TEMPERO().getText();
        tabela.adicionar(nomeTemp, TipoBUILD.TEMPERO);
        saida.append("<li>");
        if (ctx.NUMERO() != null) {
            saida.append(ctx.NUMERO().getText());
            if (ctx.peso != null) {
                saida.append("g de ");
            } else if (ctx.tipo_colher() != null) {
                saida.append(" colheres de " + ctx.tipo_colher().getText() + " de ");
            } else {
                saida.append(" xícaras de ");
            }
            saida.append(ctx.TEMPERO().getText());
        } else if (ctx.pitada != null) {
            saida.append("Uma pitada de ");
            saida.append(ctx.TEMPERO().getText());
        } else if (ctx.a_gosto != null) {
            saida.append(ctx.TEMPERO().getText());
            saida.append(" a gosto");
        }
        saida.append("</li>\n");
        return null;
    }

    @Override
    public Void visitPasso(BUILDParser.PassoContext ctx) {
        ctx.cmd().forEach(cmd -> visitCmd(cmd));
        return null;
    }

    @Override
    public Void visitCmdAsse(BUILDParser.CmdAsseContext ctx) {
        saida.append("<li>");
        saida.append("Asse o componente " + ctx.COMPONENTE().getText() + " por " + ctx.tempo().getText() + " a " + ctx.NUMERO().getText() + " graus Celsius.");
        saida.append("</li>\n");
        return null;
    }

    @Override
    public Void visitCmdCozinhe(BUILDParser.CmdCozinheContext ctx) {
        saida.append("<li>");
        saida.append("Cozinhe " + ctx.COMPONENTE().getText() + " por " + ctx.tempo().getText());
        saida.append("</li>\n");
        return null;
    }

    @Override
    public Void visitCmdMisture(BUILDParser.CmdMistureContext ctx) {
        saida.append("<li>");
        saida.append("Misture " + ctx.COMPONENTE(0) + " com ");
        for (int i = 1; i < ctx.COMPONENTE().size(); i++) {
            saida.append(ctx.COMPONENTE(i));
            if (i != ctx.COMPONENTE().size() - 1) {
                saida.append(" e ");
            }
        }
        saida.append("</li>\n");
        return null;
    }

    @Override
    public Void visitCmdCorte(BUILDParser.CmdCorteContext ctx) {
        saida.append("<li>");
        saida.append(ctx.tipo_corte().getText() + " o componente " + ctx.COMPONENTE().getText());
        saida.append("</li>\n");
        return null;
    }

    @Override
    public Void visitCmdBata(BUILDParser.CmdBataContext ctx) {
        saida.append("<li>");
        saida.append("Bata " + ctx.COMPONENTE(0) + " com ");
        for (int i = 1; i < ctx.COMPONENTE().size(); i++) {
            saida.append(ctx.COMPONENTE(i));
            if (i != ctx.COMPONENTE().size() - 1) {
                saida.append(" e ");
            }
        }
        saida.append("</li>\n");
        return null;
    }

    //Visitante do comando Descanse:
    @Override
    public Void visitCmdDescanse(BUILDParser.CmdDescanseContext ctx) {
        saida.append("<li>");
        saida.append("Deixe descansar por " + ctx.tempo().getText());
        saida.append("</li>\n");
        return null;
    }

    //Visitante do comando Etapa:
    @Override
    public Void visitCmdEtapa(BUILDParser.CmdEtapaContext ctx) {
        String texto = ctx.CADEIA().getText();
        texto = texto.substring(1, texto.length() - 1);
        saida.append("<li>");
        saida.append(texto);
        saida.append("</li>\n");
        return null;
    }

    //Função Pao_de_Lo:
    @Override
    public Void visitCmdPao_de_Lo(BUILDParser.CmdPao_de_LoContext ctx) {
        saida.append("<li>Quebre 4 ovos, separe as claras das gemas</li>\n");
        saida.append("<li>Bata as claras em neve. Reserve.</li>\n");
        saida.append("<li>Adicione as gemas com uma xícara de água morna. Bata até espumar.</li>\n");
        saida.append("<li>Acrescente 2 xícaras de chá de açúcar e bata até misturar.</li>\n");
        saida.append("<li>Adicione 2 xícaras de chá de farinha de trigo, 1 colher de sopa de fermento em pó e misture com um fouet.</li>\n");
        saida.append("<li>Misture as claras em neve.</li>\n");
        saida.append("<li>Despeje em uma forma untada.</li>\n");
        saida.append("<li>Asse por 30min a 180 graus Celsius</li>\n");
        return null;
    }

    //Função Cobertura:
    @Override
    public Void visitCmdCobertura(BUILDParser.CmdCoberturaContext ctx) {
        saida.append("<li>Em uma panela, misture o leite, o chocolate em pó e a margarina.</li>\n");
        saida.append("<li>Leve ao fogo médio até ferver.</li>\n");
        saida.append("<li>Quando começar a ferver acrescente o leite condensado.</li>\n");
        saida.append("<li>Mexa até ferver e ficar um pouco consistente.</li>\n");
        saida.append("<li>Retire do fogo e a cobertura está pronta.</li>\n");
        return null;
    }

    //Função Arroz:
    @Override
    public Void visitCmdArroz(BUILDParser.CmdArrozContext ctx) {
        saida.append("<li>Refogue a cebola e o alho.</li>\n");
        saida.append("<li>Adicione o arroz. Refogue até ficar semi-transparente</li>\n");
        saida.append("<li>Adicione a água e o tempero.</li>\n");
        saida.append("<li>Deixe até secar.</li>\n");
        saida.append("<li>Se ainda não estiver pronto, adicione mais água.</li>\n");
        return null;
    }

    //Função Risotto:
    @Override
    public Void visitCmdBaseRisotto(BUILDParser.CmdBaseRisottoContext ctx) {
        saida.append("<li>Refogue a cebola e o alho.</li>\n");
        saida.append("<li>Adicione o arroz. Refogue até ficar semi-transparente</li>\n");
        saida.append("<li>Adicione o sal e os temperos</li>\n");
        saida.append("<li>Adicione o vinho. Misture até secar</li>\n");
        saida.append("<li>Adicione 2 conchas do caldo. Misture até secar.</li>\n");
        saida.append("<li>Repita o último etapa até o arroz ficar al dente.</li>\n");
        saida.append("<li>Adicione a manteiga e deixe derreter</li>\n");
        saida.append("<li>Misture o parmesão</li>\n");
        return null;
    }

}
