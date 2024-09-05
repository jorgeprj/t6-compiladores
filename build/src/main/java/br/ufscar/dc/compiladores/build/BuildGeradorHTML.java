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
        saida.append("<h1> Manual de Instruções: " + nome + "</h1>\n");
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
        
        //Seção de montagem:
        saida.append("<section id=\"montagem\" >\n");
        saida.append("<h2>Montagem:</h2>\n");
        visitPasso(ctx.passo());
        saida.append("</section>\n");
        
        //Termina a página:
        saida.append("</body>\n");
        saida.append("</html>");
        return null;
    }


    @Override
    public Void visitLista_pecas(BUILDParser.Lista_pecasContext ctx) {
        if (ctx.PECA() != null) {
            String nomePec = ctx.PECA().getText();
            tabela.adicionar(nomePec, TipoBUILD.PECA);
            saida.append("<li>" + ctx.NUMERO().getText() + " x " + ctx.PECA().getText() + "</li>\n");
        }
        return null;
    }

    @Override
    public Void visitPasso(BUILDParser.PassoContext ctx) {
        ctx.cmd().forEach(cmd -> visitCmd(cmd));
        return null;
    }

    @Override
    public Void visitCmdAparafuse(BUILDParser.CmdAparafuseContext ctx) {
        saida.append("<li>");
        saida.append("Aparafuse a peça " + ctx.PECA().getText());
        saida.append("</li>\n");
        return null;
    }

    @Override
    public Void visitCmdAjuste(BUILDParser.CmdAjusteContext ctx) {
        saida.append("<li>");
        saida.append("Ajuste a peça " + ctx.PECA().getText() + " de forma " + ctx.tipo_ajuste().getText());
        saida.append("</li>\n");
        return null;
    }

    @Override
    public Void visitCmdCole(BUILDParser.CmdColeContext ctx) {
        saida.append("<li>");
        saida.append("Cole a peça " + ctx.PECA(0) + " na peça ");
        for (int i = 1; i < ctx.PECA().size(); i++) {
            saida.append(ctx.PECA(i));
            if (i != ctx.PECA().size() - 1) {
                saida.append(" e na peça ");
            }
        }
        saida.append("</li>\n");
        return null;
    }

    //Visitante do comando Teste:
    @Override
    public Void visitCmdTeste(BUILDParser.CmdTesteContext ctx) {
        saida.append("<li>");
        saida.append("Teste por " + ctx.tempo().getText());
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

    //Função Armario:
    @Override
    public Void visitCmdArmario(BUILDParser.CmdArmarioContext ctx) {
        saida.append("<li>Monte a base do armário, fixando as laterais e a parte inferior.</li>\n");
        saida.append("<li>Coloque as prateleiras e ajuste as distâncias conforme necessário.</li>\n");
        saida.append("<li>Instale as portas do armário e ajuste as dobradiças.</li>\n");
        saida.append("<li>Verifique se todos os parafusos estão bem apertados e se o armário está nivelado.</li>\n");
        saida.append("<li>Limpe o local e faça os ajustes finais.</li>\n");
        return null;
    }

    //Função Cama:
    @Override
    public Void visitCmdCama(BUILDParser.CmdCamaContext ctx) {
        saida.append("<li>Monte a estrutura da cama, fixando os pés e as laterais ao cabeceira e à base.</li>\n");
        saida.append("<li>Coloque o colchão sobre a estrutura da cama.</li>\n");
        saida.append("<li>Ajuste a cama para garantir que está nivelada e estável.</li>\n");
        saida.append("<li>Arrume os lençóis e travesseiros para finalizar.</li>\n");
        return null;
    }

    //Função Mesa:
    @Override
    public Void visitCmdMesa(BUILDParser.CmdMesaContext ctx) {
        saida.append("<li>Monte as pernas da mesa, fixando-as ao tampo usando os parafusos.</li>\n");
        saida.append("<li>Ajuste a mesa para garantir que está nivelada e estável.</li>\n");
        saida.append("<li>Verifique se todos os parafusos estão bem apertados.</li>\n");
        saida.append("<li>Limpe a mesa e o local ao redor para finalizar a montagem.</li>\n");
        return null;
    }

    //Função Cadeira:
    @Override
    public Void visitCmdCadeira(BUILDParser.CmdCadeiraContext ctx) {
            saida.append("<li>Conecte o encosto ao assento utilizando os parafusos fornecidos.</li>\n");
            saida.append("<li>Fixe as pernas da cadeira nas posições apropriadas sob o assento.</li>\n");
            saida.append("<li>Certifique-se de que todos os parafusos estejam bem apertados.</li>\n");
            saida.append("<li>Verifique a estabilidade da cadeira em uma superfície plana.</li>\n");
            saida.append("<li>Ajuste os parafusos, se necessário, para garantir estabilidade.</li>\n");
            saida.append("<li>Finalize a montagem verificando novamente todos os parafusos.</li>\n");
            saida.append("<li>Cuidado: Não exceda o peso máximo recomendado de 120 kg.</li>\n");
        return null;
    }

}
