// Generated from br\u005Cufscar\dc\compiladores\build\BUILD.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.build;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BUILDParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, NUMERO=41, PECA=42, TEMPERO=43, CADEIA=44, COMENTARIO=45, 
		WS=46;
	public static final int
		RULE_montagem = 0, RULE_imagem = 1, RULE_nome = 2, RULE_tempo_mont = 3, 
		RULE_unidade_tempo = 4, RULE_paragrafo = 5, RULE_componentes = 6, RULE_lista_pecas = 7, 
		RULE_medida_solido = 8, RULE_medida_liq = 9, RULE_lista_tempero = 10, 
		RULE_tipo_colher = 11, RULE_passo = 12, RULE_cmd = 13, RULE_cmdAparafuse = 14, 
		RULE_cmdAjuste = 15, RULE_cmdCole = 16, RULE_cmdTeste = 17, RULE_cmdEtapa = 18, 
		RULE_cmdArmario = 19, RULE_cmdCama = 20, RULE_cmdMesa = 21, RULE_cmdCadeira = 22, 
		RULE_tipo_ajuste = 23, RULE_tempo = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"montagem", "imagem", "nome", "tempo_mont", "unidade_tempo", "paragrafo", 
			"componentes", "lista_pecas", "medida_solido", "medida_liq", "lista_tempero", 
			"tipo_colher", "passo", "cmd", "cmdAparafuse", "cmdAjuste", "cmdCole", 
			"cmdTeste", "cmdEtapa", "cmdArmario", "cmdCama", "cmdMesa", "cmdCadeira", 
			"tipo_ajuste", "tempo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'montagem'", "'fim_montagem'", "'Imagem'", "':'", "'Nome'", "'Tempo'", 
			"'hora'", "'min'", "'seg'", "'Paragrafo'", "'Componentes'", "'fim_componentes'", 
			"'de'", "'g'", "'colher'", "'xicara'", "'ml'", "'l'", "'copo'", "'pitada'", 
			"'a_gosto'", "'cha'", "'sobremesa'", "'sopa'", "'Passo'", "'fim_passo'", 
			"'aparafuse'", "'('", "')'", "'ajuste'", "','", "'cole'", "'teste'", 
			"'etapa'", "'Armario'", "'cama'", "'mesa'", "'cadeira'", "'paralela'", 
			"'perpendicular'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "NUMERO", "PECA", "TEMPERO", "CADEIA", 
			"COMENTARIO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BUILD.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BUILDParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MontagemContext extends ParserRuleContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public Tempo_montContext tempo_mont() {
			return getRuleContext(Tempo_montContext.class,0);
		}
		public ComponentesContext componentes() {
			return getRuleContext(ComponentesContext.class,0);
		}
		public PassoContext passo() {
			return getRuleContext(PassoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BUILDParser.EOF, 0); }
		public ImagemContext imagem() {
			return getRuleContext(ImagemContext.class,0);
		}
		public List<ParagrafoContext> paragrafo() {
			return getRuleContexts(ParagrafoContext.class);
		}
		public ParagrafoContext paragrafo(int i) {
			return getRuleContext(ParagrafoContext.class,i);
		}
		public MontagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_montagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterMontagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitMontagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitMontagem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MontagemContext montagem() throws RecognitionException {
		MontagemContext _localctx = new MontagemContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_montagem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(51);
			nome();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(52);
				imagem();
				}
			}

			setState(55);
			tempo_mont();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(56);
				paragrafo();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			componentes();
			setState(63);
			passo();
			setState(64);
			match(T__1);
			setState(65);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImagemContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(BUILDParser.CADEIA, 0); }
		public ImagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterImagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitImagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitImagem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImagemContext imagem() throws RecognitionException {
		ImagemContext _localctx = new ImagemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__2);
			setState(68);
			match(T__3);
			setState(69);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomeContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(BUILDParser.CADEIA, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__4);
			setState(72);
			match(T__3);
			setState(73);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tempo_montContext extends ParserRuleContext {
		public List<TempoContext> tempo() {
			return getRuleContexts(TempoContext.class);
		}
		public TempoContext tempo(int i) {
			return getRuleContext(TempoContext.class,i);
		}
		public Tempo_montContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo_mont; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterTempo_mont(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitTempo_mont(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitTempo_mont(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tempo_montContext tempo_mont() throws RecognitionException {
		Tempo_montContext _localctx = new Tempo_montContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tempo_mont);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__5);
			setState(76);
			match(T__3);
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				tempo();
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMERO );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unidade_tempoContext extends ParserRuleContext {
		public Unidade_tempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unidade_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterUnidade_tempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitUnidade_tempo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitUnidade_tempo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unidade_tempoContext unidade_tempo() throws RecognitionException {
		Unidade_tempoContext _localctx = new Unidade_tempoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unidade_tempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParagrafoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(BUILDParser.CADEIA, 0); }
		public ParagrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragrafo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterParagrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitParagrafo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitParagrafo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParagrafoContext paragrafo() throws RecognitionException {
		ParagrafoContext _localctx = new ParagrafoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paragrafo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__9);
			setState(85);
			match(T__3);
			setState(86);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentesContext extends ParserRuleContext {
		public List<Lista_pecasContext> lista_pecas() {
			return getRuleContexts(Lista_pecasContext.class);
		}
		public Lista_pecasContext lista_pecas(int i) {
			return getRuleContext(Lista_pecasContext.class,i);
		}
		public List<Lista_temperoContext> lista_tempero() {
			return getRuleContexts(Lista_temperoContext.class);
		}
		public Lista_temperoContext lista_tempero(int i) {
			return getRuleContext(Lista_temperoContext.class,i);
		}
		public ComponentesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterComponentes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitComponentes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitComponentes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentesContext componentes() throws RecognitionException {
		ComponentesContext _localctx = new ComponentesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_componentes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__10);
			setState(89);
			match(T__3);
			setState(91); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(90);
					lista_pecas();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(93); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << NUMERO) | (1L << TEMPERO))) != 0)) {
				{
				{
				setState(95);
				lista_tempero();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_pecasContext extends ParserRuleContext {
		public TerminalNode PECA() { return getToken(BUILDParser.PECA, 0); }
		public Medida_solidoContext medida_solido() {
			return getRuleContext(Medida_solidoContext.class,0);
		}
		public Medida_liqContext medida_liq() {
			return getRuleContext(Medida_liqContext.class,0);
		}
		public Lista_pecasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_pecas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterLista_pecas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitLista_pecas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitLista_pecas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_pecasContext lista_pecas() throws RecognitionException {
		Lista_pecasContext _localctx = new Lista_pecasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lista_pecas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(103);
				medida_solido();
				}
				break;
			case 2:
				{
				setState(104);
				medida_liq();
				}
				break;
			}
			setState(107);
			match(T__12);
			setState(108);
			match(PECA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Medida_solidoContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(BUILDParser.NUMERO, 0); }
		public Tipo_colherContext tipo_colher() {
			return getRuleContext(Tipo_colherContext.class,0);
		}
		public Medida_solidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_medida_solido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterMedida_solido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitMedida_solido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitMedida_solido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Medida_solidoContext medida_solido() throws RecognitionException {
		Medida_solidoContext _localctx = new Medida_solidoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_medida_solido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(NUMERO);
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(111);
				match(T__13);
				}
				break;
			case T__14:
				{
				setState(112);
				match(T__14);
				setState(113);
				tipo_colher();
				}
				break;
			case T__15:
				{
				setState(114);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Medida_liqContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(BUILDParser.NUMERO, 0); }
		public Medida_liqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_medida_liq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterMedida_liq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitMedida_liq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitMedida_liq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Medida_liqContext medida_liq() throws RecognitionException {
		Medida_liqContext _localctx = new Medida_liqContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_medida_liq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(NUMERO);
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_temperoContext extends ParserRuleContext {
		public Token peso;
		public Token pitada;
		public Token a_gosto;
		public TerminalNode NUMERO() { return getToken(BUILDParser.NUMERO, 0); }
		public TerminalNode TEMPERO() { return getToken(BUILDParser.TEMPERO, 0); }
		public Tipo_colherContext tipo_colher() {
			return getRuleContext(Tipo_colherContext.class,0);
		}
		public Lista_temperoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_tempero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterLista_tempero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitLista_tempero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitLista_tempero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_temperoContext lista_tempero() throws RecognitionException {
		Lista_temperoContext _localctx = new Lista_temperoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lista_tempero);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(NUMERO);
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
					{
					setState(121);
					((Lista_temperoContext)_localctx).peso = match(T__13);
					}
					break;
				case T__14:
					{
					setState(122);
					match(T__14);
					setState(123);
					tipo_colher();
					}
					break;
				case T__15:
					{
					setState(124);
					match(T__15);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(127);
				match(T__12);
				setState(128);
				match(TEMPERO);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				((Lista_temperoContext)_localctx).pitada = match(T__19);
				setState(130);
				match(TEMPERO);
				}
				break;
			case TEMPERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(TEMPERO);
				setState(132);
				((Lista_temperoContext)_localctx).a_gosto = match(T__20);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_colherContext extends ParserRuleContext {
		public Tipo_colherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_colher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterTipo_colher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitTipo_colher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitTipo_colher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_colherContext tipo_colher() throws RecognitionException {
		Tipo_colherContext _localctx = new Tipo_colherContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo_colher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PassoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public PassoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterPasso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitPasso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitPasso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PassoContext passo() throws RecognitionException {
		PassoContext _localctx = new PassoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_passo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__24);
			setState(138);
			match(T__3);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) {
				{
				{
				setState(139);
				cmd();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdAparafuseContext cmdAparafuse() {
			return getRuleContext(CmdAparafuseContext.class,0);
		}
		public CmdAjusteContext cmdAjuste() {
			return getRuleContext(CmdAjusteContext.class,0);
		}
		public CmdColeContext cmdCole() {
			return getRuleContext(CmdColeContext.class,0);
		}
		public CmdTesteContext cmdTeste() {
			return getRuleContext(CmdTesteContext.class,0);
		}
		public CmdEtapaContext cmdEtapa() {
			return getRuleContext(CmdEtapaContext.class,0);
		}
		public CmdArmarioContext cmdArmario() {
			return getRuleContext(CmdArmarioContext.class,0);
		}
		public CmdCamaContext cmdCama() {
			return getRuleContext(CmdCamaContext.class,0);
		}
		public CmdMesaContext cmdMesa() {
			return getRuleContext(CmdMesaContext.class,0);
		}
		public CmdCadeiraContext cmdCadeira() {
			return getRuleContext(CmdCadeiraContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cmd);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				cmdAparafuse();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				cmdAjuste();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				cmdCole();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				cmdTeste();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				cmdEtapa();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				cmdArmario();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 7);
				{
				setState(153);
				cmdCama();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 8);
				{
				setState(154);
				cmdMesa();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 9);
				{
				setState(155);
				cmdCadeira();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdAparafuseContext extends ParserRuleContext {
		public TerminalNode PECA() { return getToken(BUILDParser.PECA, 0); }
		public CmdAparafuseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAparafuse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterCmdAparafuse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitCmdAparafuse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitCmdAparafuse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdAparafuseContext cmdAparafuse() throws RecognitionException {
		CmdAparafuseContext _localctx = new CmdAparafuseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cmdAparafuse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__26);
			setState(159);
			match(T__27);
			setState(160);
			match(PECA);
			setState(161);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdAjusteContext extends ParserRuleContext {
		public TerminalNode PECA() { return getToken(BUILDParser.PECA, 0); }
		public Tipo_ajusteContext tipo_ajuste() {
			return getRuleContext(Tipo_ajusteContext.class,0);
		}
		public CmdAjusteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAjuste; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterCmdAjuste(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitCmdAjuste(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitCmdAjuste(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdAjusteContext cmdAjuste() throws RecognitionException {
		CmdAjusteContext _localctx = new CmdAjusteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdAjuste);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__29);
			setState(164);
			match(T__27);
			setState(165);
			match(PECA);
			setState(166);
			match(T__30);
			setState(167);
			tipo_ajuste();
			setState(168);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdColeContext extends ParserRuleContext {
		public List<TerminalNode> PECA() { return getTokens(BUILDParser.PECA); }
		public TerminalNode PECA(int i) {
			return getToken(BUILDParser.PECA, i);
		}
		public CmdColeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterCmdCole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitCmdCole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitCmdCole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdColeContext cmdCole() throws RecognitionException {
		CmdColeContext _localctx = new CmdColeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cmdCole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__31);
			setState(171);
			match(T__27);
			setState(172);
			match(PECA);
			setState(175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173);
				match(T__30);
				setState(174);
				match(PECA);
				}
				}
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__30 );
			setState(179);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdTesteContext extends ParserRuleContext {
		public TempoContext tempo() {
			return getRuleContext(TempoContext.class,0);
		}
		public CmdTesteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdTeste; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterCmdTeste(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitCmdTeste(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitCmdTeste(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdTesteContext cmdTeste() throws RecognitionException {
		CmdTesteContext _localctx = new CmdTesteContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdTeste);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__32);
			setState(182);
			match(T__27);
			setState(183);
			tempo();
			setState(184);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdEtapaContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(BUILDParser.CADEIA, 0); }
		public CmdEtapaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEtapa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterCmdEtapa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitCmdEtapa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitCmdEtapa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdEtapaContext cmdEtapa() throws RecognitionException {
		CmdEtapaContext _localctx = new CmdEtapaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdEtapa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__33);
			setState(187);
			match(T__27);
			setState(188);
			match(CADEIA);
			setState(189);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdArmarioContext extends ParserRuleContext {
		public CmdArmarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdArmario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterCmdArmario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitCmdArmario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitCmdArmario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdArmarioContext cmdArmario() throws RecognitionException {
		CmdArmarioContext _localctx = new CmdArmarioContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdArmario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__34);
			setState(192);
			match(T__27);
			setState(193);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdCamaContext extends ParserRuleContext {
		public CmdCamaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCama; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterCmdCama(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitCmdCama(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitCmdCama(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdCamaContext cmdCama() throws RecognitionException {
		CmdCamaContext _localctx = new CmdCamaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdCama);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__35);
			setState(196);
			match(T__27);
			setState(197);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdMesaContext extends ParserRuleContext {
		public CmdMesaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdMesa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterCmdMesa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitCmdMesa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitCmdMesa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdMesaContext cmdMesa() throws RecognitionException {
		CmdMesaContext _localctx = new CmdMesaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdMesa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__36);
			setState(200);
			match(T__27);
			setState(201);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdCadeiraContext extends ParserRuleContext {
		public CmdCadeiraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCadeira; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterCmdCadeira(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitCmdCadeira(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitCmdCadeira(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdCadeiraContext cmdCadeira() throws RecognitionException {
		CmdCadeiraContext _localctx = new CmdCadeiraContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmdCadeira);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__37);
			setState(204);
			match(T__27);
			setState(205);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_ajusteContext extends ParserRuleContext {
		public Tipo_ajusteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_ajuste; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterTipo_ajuste(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitTipo_ajuste(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitTipo_ajuste(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_ajusteContext tipo_ajuste() throws RecognitionException {
		Tipo_ajusteContext _localctx = new Tipo_ajusteContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tipo_ajuste);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__39) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempoContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(BUILDParser.NUMERO, 0); }
		public Unidade_tempoContext unidade_tempo() {
			return getRuleContext(Unidade_tempoContext.class,0);
		}
		public TempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).enterTempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BUILDListener ) ((BUILDListener)listener).exitTempo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BUILDVisitor ) return ((BUILDVisitor<? extends T>)visitor).visitTempo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempoContext tempo() throws RecognitionException {
		TempoContext _localctx = new TempoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(NUMERO);
			setState(210);
			unidade_tempo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00d7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\5\28\n\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\6\5Q\n\5\r"+
		"\5\16\5R\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\6\b^\n\b\r\b\16\b_\3\b\7"+
		"\bc\n\b\f\b\16\bf\13\b\3\b\3\b\3\t\3\t\5\tl\n\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\5\nv\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u0080\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u0088\n\f\3\r\3\r\3\16\3\16\3\16\7\16\u008f"+
		"\n\16\f\16\16\16\u0092\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u009f\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\6\22\u00b2\n\22\r\22\16"+
		"\22\u00b3\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\2\6\3\2\t\13\3\2\22\25\3\2\30\32\3\2)*"+
		"\2\u00d3\2\64\3\2\2\2\4E\3\2\2\2\6I\3\2\2\2\bM\3\2\2\2\nT\3\2\2\2\fV\3"+
		"\2\2\2\16Z\3\2\2\2\20k\3\2\2\2\22p\3\2\2\2\24w\3\2\2\2\26\u0087\3\2\2"+
		"\2\30\u0089\3\2\2\2\32\u008b\3\2\2\2\34\u009e\3\2\2\2\36\u00a0\3\2\2\2"+
		" \u00a5\3\2\2\2\"\u00ac\3\2\2\2$\u00b7\3\2\2\2&\u00bc\3\2\2\2(\u00c1\3"+
		"\2\2\2*\u00c5\3\2\2\2,\u00c9\3\2\2\2.\u00cd\3\2\2\2\60\u00d1\3\2\2\2\62"+
		"\u00d3\3\2\2\2\64\65\7\3\2\2\65\67\5\6\4\2\668\5\4\3\2\67\66\3\2\2\2\67"+
		"8\3\2\2\289\3\2\2\29=\5\b\5\2:<\5\f\7\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2"+
		"=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\5\16\b\2AB\5\32\16\2BC\7\4\2\2CD\7\2"+
		"\2\3D\3\3\2\2\2EF\7\5\2\2FG\7\6\2\2GH\7.\2\2H\5\3\2\2\2IJ\7\7\2\2JK\7"+
		"\6\2\2KL\7.\2\2L\7\3\2\2\2MN\7\b\2\2NP\7\6\2\2OQ\5\62\32\2PO\3\2\2\2Q"+
		"R\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\t\3\2\2\2TU\t\2\2\2U\13\3\2\2\2VW\7\f\2"+
		"\2WX\7\6\2\2XY\7.\2\2Y\r\3\2\2\2Z[\7\r\2\2[]\7\6\2\2\\^\5\20\t\2]\\\3"+
		"\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`d\3\2\2\2ac\5\26\f\2ba\3\2\2\2cf"+
		"\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\16\2\2h\17\3\2\2"+
		"\2il\5\22\n\2jl\5\24\13\2ki\3\2\2\2kj\3\2\2\2lm\3\2\2\2mn\7\17\2\2no\7"+
		",\2\2o\21\3\2\2\2pu\7+\2\2qv\7\20\2\2rs\7\21\2\2sv\5\30\r\2tv\7\22\2\2"+
		"uq\3\2\2\2ur\3\2\2\2ut\3\2\2\2v\23\3\2\2\2wx\7+\2\2xy\t\3\2\2y\25\3\2"+
		"\2\2z\177\7+\2\2{\u0080\7\20\2\2|}\7\21\2\2}\u0080\5\30\r\2~\u0080\7\22"+
		"\2\2\177{\3\2\2\2\177|\3\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\7\17\2\2\u0082\u0088\7-\2\2\u0083\u0084\7\26\2\2\u0084\u0088\7"+
		"-\2\2\u0085\u0086\7-\2\2\u0086\u0088\7\27\2\2\u0087z\3\2\2\2\u0087\u0083"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0088\27\3\2\2\2\u0089\u008a\t\4\2\2\u008a"+
		"\31\3\2\2\2\u008b\u008c\7\33\2\2\u008c\u0090\7\6\2\2\u008d\u008f\5\34"+
		"\17\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\34"+
		"\2\2\u0094\33\3\2\2\2\u0095\u009f\5\36\20\2\u0096\u009f\5 \21\2\u0097"+
		"\u009f\5\"\22\2\u0098\u009f\5$\23\2\u0099\u009f\5&\24\2\u009a\u009f\5"+
		"(\25\2\u009b\u009f\5*\26\2\u009c\u009f\5,\27\2\u009d\u009f\5.\30\2\u009e"+
		"\u0095\3\2\2\2\u009e\u0096\3\2\2\2\u009e\u0097\3\2\2\2\u009e\u0098\3\2"+
		"\2\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\35\3\2\2\2\u00a0\u00a1\7\35\2"+
		"\2\u00a1\u00a2\7\36\2\2\u00a2\u00a3\7,\2\2\u00a3\u00a4\7\37\2\2\u00a4"+
		"\37\3\2\2\2\u00a5\u00a6\7 \2\2\u00a6\u00a7\7\36\2\2\u00a7\u00a8\7,\2\2"+
		"\u00a8\u00a9\7!\2\2\u00a9\u00aa\5\60\31\2\u00aa\u00ab\7\37\2\2\u00ab!"+
		"\3\2\2\2\u00ac\u00ad\7\"\2\2\u00ad\u00ae\7\36\2\2\u00ae\u00b1\7,\2\2\u00af"+
		"\u00b0\7!\2\2\u00b0\u00b2\7,\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\3\2\2"+
		"\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6"+
		"\7\37\2\2\u00b6#\3\2\2\2\u00b7\u00b8\7#\2\2\u00b8\u00b9\7\36\2\2\u00b9"+
		"\u00ba\5\62\32\2\u00ba\u00bb\7\37\2\2\u00bb%\3\2\2\2\u00bc\u00bd\7$\2"+
		"\2\u00bd\u00be\7\36\2\2\u00be\u00bf\7.\2\2\u00bf\u00c0\7\37\2\2\u00c0"+
		"\'\3\2\2\2\u00c1\u00c2\7%\2\2\u00c2\u00c3\7\36\2\2\u00c3\u00c4\7\37\2"+
		"\2\u00c4)\3\2\2\2\u00c5\u00c6\7&\2\2\u00c6\u00c7\7\36\2\2\u00c7\u00c8"+
		"\7\37\2\2\u00c8+\3\2\2\2\u00c9\u00ca\7\'\2\2\u00ca\u00cb\7\36\2\2\u00cb"+
		"\u00cc\7\37\2\2\u00cc-\3\2\2\2\u00cd\u00ce\7(\2\2\u00ce\u00cf\7\36\2\2"+
		"\u00cf\u00d0\7\37\2\2\u00d0/\3\2\2\2\u00d1\u00d2\t\5\2\2\u00d2\61\3\2"+
		"\2\2\u00d3\u00d4\7+\2\2\u00d4\u00d5\5\n\6\2\u00d5\63\3\2\2\2\16\67=R_"+
		"dku\177\u0087\u0090\u009e\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}