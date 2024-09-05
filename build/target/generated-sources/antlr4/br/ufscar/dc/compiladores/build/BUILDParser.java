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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, NUMERO=30, PECA=31, 
		CADEIA=32, COMENTARIO=33, WS=34;
	public static final int
		RULE_montagem = 0, RULE_imagem = 1, RULE_nome = 2, RULE_tempo_mont = 3, 
		RULE_unidade_tempo = 4, RULE_paragrafo = 5, RULE_componentes = 6, RULE_lista_pecas = 7, 
		RULE_passo = 8, RULE_cmd = 9, RULE_cmdAparafuse = 10, RULE_cmdAjuste = 11, 
		RULE_cmdCole = 12, RULE_cmdTeste = 13, RULE_cmdEtapa = 14, RULE_cmdArmario = 15, 
		RULE_cmdCama = 16, RULE_cmdMesa = 17, RULE_cmdCadeira = 18, RULE_tipo_ajuste = 19, 
		RULE_tempo = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"montagem", "imagem", "nome", "tempo_mont", "unidade_tempo", "paragrafo", 
			"componentes", "lista_pecas", "passo", "cmd", "cmdAparafuse", "cmdAjuste", 
			"cmdCole", "cmdTeste", "cmdEtapa", "cmdArmario", "cmdCama", "cmdMesa", 
			"cmdCadeira", "tipo_ajuste", "tempo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'montagem'", "'fim_montagem'", "'Imagem'", "':'", "'Nome'", "'Tempo'", 
			"'hora'", "'min'", "'seg'", "'Paragrafo'", "'Componentes'", "'fim_componentes'", 
			"'x'", "'Passo'", "'fim_passo'", "'aparafuse'", "'('", "')'", "'ajuste'", 
			"','", "'cole'", "'teste'", "'etapa'", "'armario'", "'cama'", "'mesa'", 
			"'cadeira'", "'paralela'", "'perpendicular'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "NUMERO", "PECA", "CADEIA", "COMENTARIO", 
			"WS"
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
			setState(42);
			match(T__0);
			setState(43);
			nome();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(44);
				imagem();
				}
			}

			setState(47);
			tempo_mont();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(48);
				paragrafo();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			componentes();
			setState(55);
			passo();
			setState(56);
			match(T__1);
			setState(57);
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
			setState(59);
			match(T__2);
			setState(60);
			match(T__3);
			setState(61);
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
			setState(63);
			match(T__4);
			setState(64);
			match(T__3);
			setState(65);
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
			setState(67);
			match(T__5);
			setState(68);
			match(T__3);
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				tempo();
				}
				}
				setState(72); 
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
			setState(74);
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
			setState(76);
			match(T__9);
			setState(77);
			match(T__3);
			setState(78);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__10);
			setState(81);
			match(T__3);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERO) {
				{
				{
				setState(82);
				lista_pecas();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
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
		public TerminalNode NUMERO() { return getToken(BUILDParser.NUMERO, 0); }
		public TerminalNode PECA() { return getToken(BUILDParser.PECA, 0); }
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
			setState(90);
			match(NUMERO);
			setState(91);
			match(T__12);
			setState(92);
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
		enterRule(_localctx, 16, RULE_passo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__13);
			setState(95);
			match(T__3);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) {
				{
				{
				setState(96);
				cmd();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(T__14);
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
		enterRule(_localctx, 18, RULE_cmd);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				cmdAparafuse();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				cmdAjuste();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				cmdCole();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				cmdTeste();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				cmdEtapa();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				cmdArmario();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				cmdCama();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 8);
				{
				setState(111);
				cmdMesa();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 9);
				{
				setState(112);
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
		enterRule(_localctx, 20, RULE_cmdAparafuse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__15);
			setState(116);
			match(T__16);
			setState(117);
			match(PECA);
			setState(118);
			match(T__17);
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
		enterRule(_localctx, 22, RULE_cmdAjuste);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__18);
			setState(121);
			match(T__16);
			setState(122);
			match(PECA);
			setState(123);
			match(T__19);
			setState(124);
			tipo_ajuste();
			setState(125);
			match(T__17);
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
		enterRule(_localctx, 24, RULE_cmdCole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__20);
			setState(128);
			match(T__16);
			setState(129);
			match(PECA);
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				match(T__19);
				setState(131);
				match(PECA);
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__19 );
			setState(136);
			match(T__17);
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
		enterRule(_localctx, 26, RULE_cmdTeste);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__21);
			setState(139);
			match(T__16);
			setState(140);
			tempo();
			setState(141);
			match(T__17);
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
		enterRule(_localctx, 28, RULE_cmdEtapa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__22);
			setState(144);
			match(T__16);
			setState(145);
			match(CADEIA);
			setState(146);
			match(T__17);
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
		enterRule(_localctx, 30, RULE_cmdArmario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__23);
			setState(149);
			match(T__16);
			setState(150);
			match(T__17);
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
		enterRule(_localctx, 32, RULE_cmdCama);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__24);
			setState(153);
			match(T__16);
			setState(154);
			match(T__17);
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
		enterRule(_localctx, 34, RULE_cmdMesa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__25);
			setState(157);
			match(T__16);
			setState(158);
			match(T__17);
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
		enterRule(_localctx, 36, RULE_cmdCadeira);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__26);
			setState(161);
			match(T__16);
			setState(162);
			match(T__17);
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
		enterRule(_localctx, 38, RULE_tipo_ajuste);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
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
		enterRule(_localctx, 40, RULE_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(NUMERO);
			setState(167);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\5\2\60\n\2\3\2\3"+
		"\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\6\5I\n\5\r\5\16\5J\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\7\bV\n\b\f\b\16\bY\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\7\nd\n\n\f\n\16\ng\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13t\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\6\16\u0087\n\16\r\16\16\16\u0088\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2"+
		"\4\3\2\t\13\3\2\36\37\2\u00a4\2,\3\2\2\2\4=\3\2\2\2\6A\3\2\2\2\bE\3\2"+
		"\2\2\nL\3\2\2\2\fN\3\2\2\2\16R\3\2\2\2\20\\\3\2\2\2\22`\3\2\2\2\24s\3"+
		"\2\2\2\26u\3\2\2\2\30z\3\2\2\2\32\u0081\3\2\2\2\34\u008c\3\2\2\2\36\u0091"+
		"\3\2\2\2 \u0096\3\2\2\2\"\u009a\3\2\2\2$\u009e\3\2\2\2&\u00a2\3\2\2\2"+
		"(\u00a6\3\2\2\2*\u00a8\3\2\2\2,-\7\3\2\2-/\5\6\4\2.\60\5\4\3\2/.\3\2\2"+
		"\2/\60\3\2\2\2\60\61\3\2\2\2\61\65\5\b\5\2\62\64\5\f\7\2\63\62\3\2\2\2"+
		"\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\28"+
		"9\5\16\b\29:\5\22\n\2:;\7\4\2\2;<\7\2\2\3<\3\3\2\2\2=>\7\5\2\2>?\7\6\2"+
		"\2?@\7\"\2\2@\5\3\2\2\2AB\7\7\2\2BC\7\6\2\2CD\7\"\2\2D\7\3\2\2\2EF\7\b"+
		"\2\2FH\7\6\2\2GI\5*\26\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\t\3"+
		"\2\2\2LM\t\2\2\2M\13\3\2\2\2NO\7\f\2\2OP\7\6\2\2PQ\7\"\2\2Q\r\3\2\2\2"+
		"RS\7\r\2\2SW\7\6\2\2TV\5\20\t\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2"+
		"\2XZ\3\2\2\2YW\3\2\2\2Z[\7\16\2\2[\17\3\2\2\2\\]\7 \2\2]^\7\17\2\2^_\7"+
		"!\2\2_\21\3\2\2\2`a\7\20\2\2ae\7\6\2\2bd\5\24\13\2cb\3\2\2\2dg\3\2\2\2"+
		"ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\21\2\2i\23\3\2\2\2jt\5\26"+
		"\f\2kt\5\30\r\2lt\5\32\16\2mt\5\34\17\2nt\5\36\20\2ot\5 \21\2pt\5\"\22"+
		"\2qt\5$\23\2rt\5&\24\2sj\3\2\2\2sk\3\2\2\2sl\3\2\2\2sm\3\2\2\2sn\3\2\2"+
		"\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\25\3\2\2\2uv\7\22\2\2vw\7"+
		"\23\2\2wx\7!\2\2xy\7\24\2\2y\27\3\2\2\2z{\7\25\2\2{|\7\23\2\2|}\7!\2\2"+
		"}~\7\26\2\2~\177\5(\25\2\177\u0080\7\24\2\2\u0080\31\3\2\2\2\u0081\u0082"+
		"\7\27\2\2\u0082\u0083\7\23\2\2\u0083\u0086\7!\2\2\u0084\u0085\7\26\2\2"+
		"\u0085\u0087\7!\2\2\u0086\u0084\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\24\2\2"+
		"\u008b\33\3\2\2\2\u008c\u008d\7\30\2\2\u008d\u008e\7\23\2\2\u008e\u008f"+
		"\5*\26\2\u008f\u0090\7\24\2\2\u0090\35\3\2\2\2\u0091\u0092\7\31\2\2\u0092"+
		"\u0093\7\23\2\2\u0093\u0094\7\"\2\2\u0094\u0095\7\24\2\2\u0095\37\3\2"+
		"\2\2\u0096\u0097\7\32\2\2\u0097\u0098\7\23\2\2\u0098\u0099\7\24\2\2\u0099"+
		"!\3\2\2\2\u009a\u009b\7\33\2\2\u009b\u009c\7\23\2\2\u009c\u009d\7\24\2"+
		"\2\u009d#\3\2\2\2\u009e\u009f\7\34\2\2\u009f\u00a0\7\23\2\2\u00a0\u00a1"+
		"\7\24\2\2\u00a1%\3\2\2\2\u00a2\u00a3\7\35\2\2\u00a3\u00a4\7\23\2\2\u00a4"+
		"\u00a5\7\24\2\2\u00a5\'\3\2\2\2\u00a6\u00a7\t\3\2\2\u00a7)\3\2\2\2\u00a8"+
		"\u00a9\7 \2\2\u00a9\u00aa\5\n\6\2\u00aa+\3\2\2\2\t/\65JWes\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}