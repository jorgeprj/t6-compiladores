// Generated from br\u005Cufscar\dc\compiladores\build\BUILD.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.build;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BUILDParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BUILDVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BUILDParser#montagem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMontagem(BUILDParser.MontagemContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#imagem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImagem(BUILDParser.ImagemContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(BUILDParser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#tempo_mont}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempo_mont(BUILDParser.Tempo_montContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#unidade_tempo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnidade_tempo(BUILDParser.Unidade_tempoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#paragrafo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagrafo(BUILDParser.ParagrafoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#componentes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentes(BUILDParser.ComponentesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#lista_componentes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_componentes(BUILDParser.Lista_componentesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#medida_solido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedida_solido(BUILDParser.Medida_solidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#medida_liq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedida_liq(BUILDParser.Medida_liqContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#lista_tempero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_tempero(BUILDParser.Lista_temperoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#tipo_colher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_colher(BUILDParser.Tipo_colherContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#passo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasso(BUILDParser.PassoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(BUILDParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#cmdAsse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAsse(BUILDParser.CmdAsseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#cmdCozinhe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCozinhe(BUILDParser.CmdCozinheContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#cmdMisture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdMisture(BUILDParser.CmdMistureContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#cmdCorte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCorte(BUILDParser.CmdCorteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#cmdBata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdBata(BUILDParser.CmdBataContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#cmdTeste}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdTeste(BUILDParser.CmdTesteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#cmdEtapa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEtapa(BUILDParser.CmdEtapaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#cmdPao_de_Lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPao_de_Lo(BUILDParser.CmdPao_de_LoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#cmdCobertura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCobertura(BUILDParser.CmdCoberturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#cmdArroz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdArroz(BUILDParser.CmdArrozContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#cmdCadeira}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCadeira(BUILDParser.CmdCadeiraContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#tipo_corte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_corte(BUILDParser.Tipo_corteContext ctx);
	/**
	 * Visit a parse tree produced by {@link BUILDParser#tempo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempo(BUILDParser.TempoContext ctx);
}