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

        // Inicia a página:
        saida.append("<html>\n");
        saida.append("<head>\n");
        saida.append("<title>");
        nome = ctx.nome().CADEIA().getText();
        nome = nome.substring(1, nome.length() - 1);
        saida.append("Montagem: " + nome);
        saida.append("</title>\n");

        // Estilos e Fontes:
        saida.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
        saida.append("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
        saida.append("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
        saida.append("<link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@400;700&display=swap\" rel=\"stylesheet\">\n");
        saida.append("<style>\n");
        saida.append("body { font-family: 'Inter', sans-serif; margin: 0; padding: 0; background-color: #f4f4f4; color: #333; }\n");
        saida.append("header { background-color: #ffffff; padding: 8px; box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1); }\n");
        saida.append("nav { display: flex; justify-content: space-between; align-items: center; max-width: 1200px; margin: 0 auto; }\n");
        saida.append("nav a { text-decoration: none; color: #333; padding: 10px 20px; font-weight: 700; }\n");
        saida.append("nav a:hover { color: #007BFF; }\n");
        saida.append("nav img { max-height: 40px; }\n");
        saida.append("p { font-size: 18px; line-height: 1.6;}\n");
        saida.append("section { max-width: 1000px; margin: 0 auto; padding: 40px; background-color: #fff; box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1); margin-bottom: 20px; margin-top: 20px; }\n");
        saida.append("h2 { margin: 0; margin-bottom: 10px; }\n");
        saida.append("ul { list-style: none; padding: 0; }\n");
        saida.append("li { font-size: 18px; margin-left: 5px; margin-bottom: 5px; }\n");
        saida.append("img { display: block; margin-left: auto; margin-right: auto; width: 50%; height: auto; }\n");
        saida.append("</style>\n");
        saida.append("</head>\n");

        // Corpo do HTML:
        saida.append("<body>\n");

        // Header com barra de navegação:
        saida.append("<header>\n");
        saida.append("<nav>\n");
        saida.append("<h3>BUILD</h3>\n");  // Coloque o caminho da imagem do logo aqui
        saida.append("<div>\n");
        saida.append("<a href=\"#\">Home</a>\n");
        saida.append("<a href=\"#componentes\">Componentes</a>\n");
        saida.append("<a href=\"#montagem\">Montagem</a>\n");
        saida.append("<a href=\"#contato\">Contato</a>\n");
        saida.append("</div>\n");
        saida.append("</nav>\n");
        saida.append("</header>\n");

        // Imagem:
        if (ctx.imagem() != null) {
            texto = ctx.imagem().CADEIA().getText();
            texto = texto.substring(1, texto.length() - 1);
            saida.append("<section>\n");
            saida.append("<img src=\"" + texto + "\" alt=\"" + nome + "\" style=\"width:400px;height:270px;\">\n");
            saida.append("</section>\n");
        }

        // Tempo de Montagem:
        saida.append("<section>\n");
        saida.append("<h2>Manual de Instruções: " + nome + "</h2>\n");
        saida.append("<p><strong>Tempo de Montagem:</strong> ");
        for (var tempo : ctx.tempo_mont().tempo()) {
            saida.append(tempo.NUMERO().getText() + " " + tempo.unidade_tempo().getText() + " ");
        }
        saida.append("</p>\n");

        // Parágrafos descritivos:
        for (var par : ctx.paragrafo()) {
            texto = par.CADEIA().getText();
            texto = texto.substring(1, texto.length() - 1);
            saida.append("<p>" + texto + "</p>\n");
        }
        saida.append("</section>\n");

        // Seção de Componentes:
        saida.append("<section id=\"componentes\">\n");
        saida.append("<h2>Componentes:</h2>\n");
        visitComponentes(ctx.componentes());
        saida.append("</section>\n");

        // Seção de Montagem:
        saida.append("<section id=\"montagem\">\n");
        saida.append("<h2>Montagem:</h2>\n");
        visitPasso(ctx.passo());
        saida.append("</section>\n");

        // Finaliza a página:
        saida.append("</body>\n");
        saida.append("</html>\n");

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
