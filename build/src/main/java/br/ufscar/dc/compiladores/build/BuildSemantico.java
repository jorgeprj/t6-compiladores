package br.ufscar.dc.compiladores.build;

import br.ufscar.dc.compiladores.build.TabelaDeSimbolos.TipoBUILD;

public class BuildSemantico extends BUILDBaseVisitor<Void> {

    //Cria a tabela de simbolos:
    TabelaDeSimbolos tabela;

    //Visitante de Montagem:
    @Override
    public Void visitMontagem(BUILDParser.MontagemContext ctx) {
        tabela = new TabelaDeSimbolos();
        return super.visitMontagem(ctx);
    }

    //Visitante da lista de pecass: Verifica se a peca já está na tabela e o adiciona:
    @Override
    public Void visitLista_pecas(BUILDParser.Lista_pecasContext ctx) {
        String nomePec = ctx.PECA().getText();
        if (tabela.existe(nomePec)) {
            SemanticoUtils.adicionarErroSemantico(ctx.PECA().getSymbol(), "Peça " + nomePec + " já adicionado.");
        } else {
            tabela.adicionar(nomePec, TipoBUILD.PECA);
        }
        return super.visitLista_pecas(ctx);
    }

    //Visitante da lista de ferramentas: Verifica se a ferramenta já está na tabela e o adiciona:
    @Override
    public Void visitLista_ferramentas(BUILDParser.Lista_ferramentasContext ctx) {
        String nomeFer = ctx.FERRAMENTA().getText();
        if (tabela.existe(nomeFer)) {
            SemanticoUtils.adicionarErroSemantico(ctx.FERRAMENTA().getSymbol(), "Ferramenta " + nomeFer + " já adicionado.");
        } else {
            tabela.adicionar(nomeFer, TipoBUILD.FERRAMENTA);
        }

        return super.visitLista_ferramentas(ctx);
    }

    //Visitante do comando Aparafuse:
    @Override
    public Void visitCmdAparafuse(BUILDParser.CmdAparafuseContext ctx) {
        String Comp = ctx.PECA().getText();
        if (!tabela.existe(Comp)) {
            SemanticoUtils.adicionarErroSemantico(ctx.PECA().getSymbol(), "Componente " + Comp + " não declarado.");
        }
        return super.visitCmdAparafuse(ctx);
    }
    

    //Visitante do comando Ajuste:
    @Override
    public Void visitCmdAjuste(BUILDParser.CmdAjusteContext ctx) {
        String Pec = ctx.PECA().getText();
        if (!tabela.existe(Pec)) {
            SemanticoUtils.adicionarErroSemantico(ctx.PECA().getSymbol(), "Peça" + Pec + " não declarado.");
        }
        return super.visitCmdAjuste(ctx);
    }

    //Visitante do comando Cole:
    @Override
    public Void visitCmdCole(BUILDParser.CmdColeContext ctx) {
        for (var pec : ctx.PECA()) {
            String nome_pec = pec.getText();
            if (!tabela.existe(nome_pec)) {
                SemanticoUtils.adicionarErroSemantico(pec.getSymbol(), "Peça " + nome_pec + " não declarado.");
            }
        }
        return super.visitCmdCole(ctx);
    }
}
