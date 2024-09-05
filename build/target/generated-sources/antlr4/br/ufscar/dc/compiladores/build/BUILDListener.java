// Generated from br\u005Cufscar\dc\compiladores\build\BUILD.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.build;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BUILDParser}.
 */
public interface BUILDListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BUILDParser#montagem}.
	 * @param ctx the parse tree
	 */
	void enterMontagem(BUILDParser.MontagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#montagem}.
	 * @param ctx the parse tree
	 */
	void exitMontagem(BUILDParser.MontagemContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#imagem}.
	 * @param ctx the parse tree
	 */
	void enterImagem(BUILDParser.ImagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#imagem}.
	 * @param ctx the parse tree
	 */
	void exitImagem(BUILDParser.ImagemContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(BUILDParser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(BUILDParser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#tempo_mont}.
	 * @param ctx the parse tree
	 */
	void enterTempo_mont(BUILDParser.Tempo_montContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#tempo_mont}.
	 * @param ctx the parse tree
	 */
	void exitTempo_mont(BUILDParser.Tempo_montContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#unidade_tempo}.
	 * @param ctx the parse tree
	 */
	void enterUnidade_tempo(BUILDParser.Unidade_tempoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#unidade_tempo}.
	 * @param ctx the parse tree
	 */
	void exitUnidade_tempo(BUILDParser.Unidade_tempoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#paragrafo}.
	 * @param ctx the parse tree
	 */
	void enterParagrafo(BUILDParser.ParagrafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#paragrafo}.
	 * @param ctx the parse tree
	 */
	void exitParagrafo(BUILDParser.ParagrafoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#componentes}.
	 * @param ctx the parse tree
	 */
	void enterComponentes(BUILDParser.ComponentesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#componentes}.
	 * @param ctx the parse tree
	 */
	void exitComponentes(BUILDParser.ComponentesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#lista_pecas}.
	 * @param ctx the parse tree
	 */
	void enterLista_pecas(BUILDParser.Lista_pecasContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#lista_pecas}.
	 * @param ctx the parse tree
	 */
	void exitLista_pecas(BUILDParser.Lista_pecasContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#medida_solido}.
	 * @param ctx the parse tree
	 */
	void enterMedida_solido(BUILDParser.Medida_solidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#medida_solido}.
	 * @param ctx the parse tree
	 */
	void exitMedida_solido(BUILDParser.Medida_solidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#medida_liq}.
	 * @param ctx the parse tree
	 */
	void enterMedida_liq(BUILDParser.Medida_liqContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#medida_liq}.
	 * @param ctx the parse tree
	 */
	void exitMedida_liq(BUILDParser.Medida_liqContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#lista_ferramentas}.
	 * @param ctx the parse tree
	 */
	void enterLista_ferramentas(BUILDParser.Lista_ferramentasContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#lista_ferramentas}.
	 * @param ctx the parse tree
	 */
	void exitLista_ferramentas(BUILDParser.Lista_ferramentasContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#tipo_colher}.
	 * @param ctx the parse tree
	 */
	void enterTipo_colher(BUILDParser.Tipo_colherContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#tipo_colher}.
	 * @param ctx the parse tree
	 */
	void exitTipo_colher(BUILDParser.Tipo_colherContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#passo}.
	 * @param ctx the parse tree
	 */
	void enterPasso(BUILDParser.PassoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#passo}.
	 * @param ctx the parse tree
	 */
	void exitPasso(BUILDParser.PassoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(BUILDParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(BUILDParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#cmdAparafuse}.
	 * @param ctx the parse tree
	 */
	void enterCmdAparafuse(BUILDParser.CmdAparafuseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdAparafuse}.
	 * @param ctx the parse tree
	 */
	void exitCmdAparafuse(BUILDParser.CmdAparafuseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#cmdAjuste}.
	 * @param ctx the parse tree
	 */
	void enterCmdAjuste(BUILDParser.CmdAjusteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdAjuste}.
	 * @param ctx the parse tree
	 */
	void exitCmdAjuste(BUILDParser.CmdAjusteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#cmdCole}.
	 * @param ctx the parse tree
	 */
	void enterCmdCole(BUILDParser.CmdColeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdCole}.
	 * @param ctx the parse tree
	 */
	void exitCmdCole(BUILDParser.CmdColeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#cmdTeste}.
	 * @param ctx the parse tree
	 */
	void enterCmdTeste(BUILDParser.CmdTesteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdTeste}.
	 * @param ctx the parse tree
	 */
	void exitCmdTeste(BUILDParser.CmdTesteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#cmdEtapa}.
	 * @param ctx the parse tree
	 */
	void enterCmdEtapa(BUILDParser.CmdEtapaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdEtapa}.
	 * @param ctx the parse tree
	 */
	void exitCmdEtapa(BUILDParser.CmdEtapaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#cmdArmario}.
	 * @param ctx the parse tree
	 */
	void enterCmdArmario(BUILDParser.CmdArmarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdArmario}.
	 * @param ctx the parse tree
	 */
	void exitCmdArmario(BUILDParser.CmdArmarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#cmdCama}.
	 * @param ctx the parse tree
	 */
	void enterCmdCama(BUILDParser.CmdCamaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdCama}.
	 * @param ctx the parse tree
	 */
	void exitCmdCama(BUILDParser.CmdCamaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#cmdMesa}.
	 * @param ctx the parse tree
	 */
	void enterCmdMesa(BUILDParser.CmdMesaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdMesa}.
	 * @param ctx the parse tree
	 */
	void exitCmdMesa(BUILDParser.CmdMesaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#cmdCadeira}.
	 * @param ctx the parse tree
	 */
	void enterCmdCadeira(BUILDParser.CmdCadeiraContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdCadeira}.
	 * @param ctx the parse tree
	 */
	void exitCmdCadeira(BUILDParser.CmdCadeiraContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#tipo_ajuste}.
	 * @param ctx the parse tree
	 */
	void enterTipo_ajuste(BUILDParser.Tipo_ajusteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#tipo_ajuste}.
	 * @param ctx the parse tree
	 */
	void exitTipo_ajuste(BUILDParser.Tipo_ajusteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#tempo}.
	 * @param ctx the parse tree
	 */
	void enterTempo(BUILDParser.TempoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#tempo}.
	 * @param ctx the parse tree
	 */
	void exitTempo(BUILDParser.TempoContext ctx);
}