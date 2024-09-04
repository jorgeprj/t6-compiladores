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
	 * Enter a parse tree produced by {@link BUILDParser#lista_componentes}.
	 * @param ctx the parse tree
	 */
	void enterLista_componentes(BUILDParser.Lista_componentesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#lista_componentes}.
	 * @param ctx the parse tree
	 */
	void exitLista_componentes(BUILDParser.Lista_componentesContext ctx);
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
	 * Enter a parse tree produced by {@link BUILDParser#lista_tempero}.
	 * @param ctx the parse tree
	 */
	void enterLista_tempero(BUILDParser.Lista_temperoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#lista_tempero}.
	 * @param ctx the parse tree
	 */
	void exitLista_tempero(BUILDParser.Lista_temperoContext ctx);
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
	 * Enter a parse tree produced by {@link BUILDParser#cmdAsse}.
	 * @param ctx the parse tree
	 */
	void enterCmdAsse(BUILDParser.CmdAsseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdAsse}.
	 * @param ctx the parse tree
	 */
	void exitCmdAsse(BUILDParser.CmdAsseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#cmdCozinhe}.
	 * @param ctx the parse tree
	 */
	void enterCmdCozinhe(BUILDParser.CmdCozinheContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdCozinhe}.
	 * @param ctx the parse tree
	 */
	void exitCmdCozinhe(BUILDParser.CmdCozinheContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#cmdMisture}.
	 * @param ctx the parse tree
	 */
	void enterCmdMisture(BUILDParser.CmdMistureContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdMisture}.
	 * @param ctx the parse tree
	 */
	void exitCmdMisture(BUILDParser.CmdMistureContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#cmdCorte}.
	 * @param ctx the parse tree
	 */
	void enterCmdCorte(BUILDParser.CmdCorteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdCorte}.
	 * @param ctx the parse tree
	 */
	void exitCmdCorte(BUILDParser.CmdCorteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#cmdBata}.
	 * @param ctx the parse tree
	 */
	void enterCmdBata(BUILDParser.CmdBataContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdBata}.
	 * @param ctx the parse tree
	 */
	void exitCmdBata(BUILDParser.CmdBataContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#cmdDescanse}.
	 * @param ctx the parse tree
	 */
	void enterCmdDescanse(BUILDParser.CmdDescanseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdDescanse}.
	 * @param ctx the parse tree
	 */
	void exitCmdDescanse(BUILDParser.CmdDescanseContext ctx);
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
	 * Enter a parse tree produced by {@link BUILDParser#cmdPao_de_Lo}.
	 * @param ctx the parse tree
	 */
	void enterCmdPao_de_Lo(BUILDParser.CmdPao_de_LoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdPao_de_Lo}.
	 * @param ctx the parse tree
	 */
	void exitCmdPao_de_Lo(BUILDParser.CmdPao_de_LoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#cmdCobertura}.
	 * @param ctx the parse tree
	 */
	void enterCmdCobertura(BUILDParser.CmdCoberturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdCobertura}.
	 * @param ctx the parse tree
	 */
	void exitCmdCobertura(BUILDParser.CmdCoberturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#cmdArroz}.
	 * @param ctx the parse tree
	 */
	void enterCmdArroz(BUILDParser.CmdArrozContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdArroz}.
	 * @param ctx the parse tree
	 */
	void exitCmdArroz(BUILDParser.CmdArrozContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#cmdBaseRisotto}.
	 * @param ctx the parse tree
	 */
	void enterCmdBaseRisotto(BUILDParser.CmdBaseRisottoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#cmdBaseRisotto}.
	 * @param ctx the parse tree
	 */
	void exitCmdBaseRisotto(BUILDParser.CmdBaseRisottoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BUILDParser#tipo_corte}.
	 * @param ctx the parse tree
	 */
	void enterTipo_corte(BUILDParser.Tipo_corteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BUILDParser#tipo_corte}.
	 * @param ctx the parse tree
	 */
	void exitTipo_corte(BUILDParser.Tipo_corteContext ctx);
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