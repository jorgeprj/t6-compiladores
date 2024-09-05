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
        String nomeIng = ctx.PECA().getText();
        if (tabela.existe(nomeIng)) {
            SemanticoUtils.adicionarErroSemantico(ctx.PECA().getSymbol(), "Peça " + nomeIng + " já adicionado.");
        } else {
            tabela.adicionar(nomeIng, TipoBUILD.PECA);
        }
        return super.visitLista_pecas(ctx);
    }

    //Visitante da lista de temperos: Verifica se o tempero já está na tabela e o adiciona:
    @Override
    public Void visitLista_tempero(BUILDParser.Lista_temperoContext ctx) {
        String nomeTemp = ctx.TEMPERO().getText();
        if (tabela.existe(nomeTemp)) {
            SemanticoUtils.adicionarErroSemantico(ctx.TEMPERO().getSymbol(), "Tempero " + nomeTemp + " já adicionado.");
        } else {
            tabela.adicionar(nomeTemp, TipoBUILD.TEMPERO);
        }

        return super.visitLista_tempero(ctx);
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
    
    //Visitante do comando Cozinhe:
    @Override
    public Void visitCmdCozinhe(BUILDParser.CmdCozinheContext ctx) {
        String Ing = ctx.PECA().getText();
        if (!tabela.existe(Ing)) {
            SemanticoUtils.adicionarErroSemantico(ctx.PECA().getSymbol(), "Componente " + Ing + " não declarado.");
        }
        return super.visitCmdCozinhe(ctx);
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

    //Visitante do comando Misture:
    @Override
    public Void visitCmdMisture(BUILDParser.CmdMistureContext ctx) {
        for (var ing : ctx.PECA()) {
            String nome_ing = ing.getText();
            if (!tabela.existe(nome_ing)) {
                SemanticoUtils.adicionarErroSemantico(ing.getSymbol(), "Componente " + nome_ing + " não declarado.");
            }
        }
        return super.visitCmdMisture(ctx);
    }

    //Visitante do comando Bata:
    @Override
    public Void visitCmdBata(BUILDParser.CmdBataContext ctx) {
        for (var ing : ctx.PECA()) {
            String nome_ing = ing.getText();
            if (!tabela.existe(nome_ing)) {
                SemanticoUtils.adicionarErroSemantico(ing.getSymbol(), "Componente " + nome_ing + " não declarado.");
            }
        }
        return super.visitCmdBata(ctx);
    }
}
