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

    //Visitante da lista de pecas: Verifica se a peca já está na tabela e o adiciona:
    @Override
    public Void visitLista_pecas(BUILDParser.Lista_pecasContext ctx) {
        String pec = ctx.PECA().getText();
        if (tabela.existe(pec)) {
            SemanticoUtils.adicionarErroSemantico(ctx.PECA().getSymbol(), "Peça " + pec + " já adicionada.");
        } else {
            tabela.adicionar(pec, TipoBUILD.PECA);
        }
        return super.visitLista_pecas(ctx);
    }

    //Visitante do comando Aparafuse:
    @Override
    public Void visitCmdAparafuse(BUILDParser.CmdAparafuseContext ctx) {
        // Obtém o nome da peça
        String pec = ctx.PECA().getText();

        // Verifica se a peça específico está declarado
        if (!tabela.existe(pec)) {
            SemanticoUtils.adicionarErroSemantico(ctx.PECA().getSymbol(), "Peça " + pec + " não declarada.");
        }

        // Verifica se a peça "Parafuso" está declarada
        if (!tabela.existe("Parafuso")) {
            SemanticoUtils.adicionarErroSemantico(ctx.getStart(), "Parafuso não declarada.");
        }

        return super.visitCmdAparafuse(ctx);
    }
    

    //Visitante do comando Ajuste:
    @Override
    public Void visitCmdAjuste(BUILDParser.CmdAjusteContext ctx) {
        String pec = ctx.PECA().getText();
        if (!tabela.existe(pec)) {
            SemanticoUtils.adicionarErroSemantico(ctx.PECA().getSymbol(), "Peça " + pec + " não declarada.");
        }
        return super.visitCmdAjuste(ctx);
    }

    //Visitante do comando Cole:
    @Override
    public Void visitCmdCole(BUILDParser.CmdColeContext ctx) {
        // Verifica se "Cola" está declarada
        if (!tabela.existe("Cola")) {
            // Adiciona um erro semântico se "Cola" não estiver declarada
            SemanticoUtils.adicionarErroSemantico(ctx.getStart(), "Cola não declarada.");
            tabela.adicionar("Cola", TipoBUILD.PECA);
        }

        for (var pec : ctx.PECA()) {
            String nome_pec = pec.getText();
            if (!tabela.existe(nome_pec)) {
                SemanticoUtils.adicionarErroSemantico(pec.getSymbol(), "Peça " + nome_pec + " não declarada.");
            }
        }

        return super.visitCmdCole(ctx);
    }
}
