// Generated from br\u005Cufscar\dc\compiladores\build\BUILD.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.build;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BUILDLexer extends Lexer {
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
		T__38=39, T__39=40, NUMERO=41, PECA=42, FERRAMENTA=43, CADEIA=44, COMENTARIO=45, 
		WS=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "NUMERO", 
			"PECA", "FERRAMENTA", "CADEIA", "ESC_SEQ", "COMENTARIO", "WS"
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
			"'etapa'", "'armario'", "'cama'", "'mesa'", "'cadeira'", "'paralela'", 
			"'perpendicular'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "NUMERO", "PECA", "FERRAMENTA", "CADEIA", 
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


	public BUILDLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BUILD.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0199\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3*\6*\u0168\n*\r*\16*\u0169\3+\3+\7+\u016e\n+\f+\16"+
		"+\u0171\13+\3,\6,\u0174\n,\r,\16,\u0175\3-\3-\3-\7-\u017b\n-\f-\16-\u017e"+
		"\13-\3-\3-\3.\3.\3.\3/\3/\7/\u0187\n/\f/\16/\u018a\13/\3/\5/\u018d\n/"+
		"\3/\3/\3/\3/\3\60\6\60\u0194\n\60\r\60\16\60\u0195\3\60\3\60\2\2\61\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[\2]/_\60\3\2\6\4\2C\\c|\3\2$$\4\2\f\f"+
		"\17\17\5\2\13\f\17\17\"\"\2\u019f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5j\3\2\2\2\7w\3\2\2\2\t~\3\2\2\2\13\u0080"+
		"\3\2\2\2\r\u0085\3\2\2\2\17\u008b\3\2\2\2\21\u0090\3\2\2\2\23\u0094\3"+
		"\2\2\2\25\u0098\3\2\2\2\27\u00a2\3\2\2\2\31\u00ae\3\2\2\2\33\u00be\3\2"+
		"\2\2\35\u00c1\3\2\2\2\37\u00c3\3\2\2\2!\u00ca\3\2\2\2#\u00d1\3\2\2\2%"+
		"\u00d4\3\2\2\2\'\u00d6\3\2\2\2)\u00db\3\2\2\2+\u00e2\3\2\2\2-\u00ea\3"+
		"\2\2\2/\u00ee\3\2\2\2\61\u00f8\3\2\2\2\63\u00fd\3\2\2\2\65\u0103\3\2\2"+
		"\2\67\u010d\3\2\2\29\u0117\3\2\2\2;\u0119\3\2\2\2=\u011b\3\2\2\2?\u0122"+
		"\3\2\2\2A\u0124\3\2\2\2C\u0129\3\2\2\2E\u012f\3\2\2\2G\u0135\3\2\2\2I"+
		"\u013d\3\2\2\2K\u0142\3\2\2\2M\u0147\3\2\2\2O\u014f\3\2\2\2Q\u0158\3\2"+
		"\2\2S\u0167\3\2\2\2U\u016b\3\2\2\2W\u0173\3\2\2\2Y\u0177\3\2\2\2[\u0181"+
		"\3\2\2\2]\u0184\3\2\2\2_\u0193\3\2\2\2ab\7o\2\2bc\7q\2\2cd\7p\2\2de\7"+
		"v\2\2ef\7c\2\2fg\7i\2\2gh\7g\2\2hi\7o\2\2i\4\3\2\2\2jk\7h\2\2kl\7k\2\2"+
		"lm\7o\2\2mn\7a\2\2no\7o\2\2op\7q\2\2pq\7p\2\2qr\7v\2\2rs\7c\2\2st\7i\2"+
		"\2tu\7g\2\2uv\7o\2\2v\6\3\2\2\2wx\7K\2\2xy\7o\2\2yz\7c\2\2z{\7i\2\2{|"+
		"\7g\2\2|}\7o\2\2}\b\3\2\2\2~\177\7<\2\2\177\n\3\2\2\2\u0080\u0081\7P\2"+
		"\2\u0081\u0082\7q\2\2\u0082\u0083\7o\2\2\u0083\u0084\7g\2\2\u0084\f\3"+
		"\2\2\2\u0085\u0086\7V\2\2\u0086\u0087\7g\2\2\u0087\u0088\7o\2\2\u0088"+
		"\u0089\7r\2\2\u0089\u008a\7q\2\2\u008a\16\3\2\2\2\u008b\u008c\7j\2\2\u008c"+
		"\u008d\7q\2\2\u008d\u008e\7t\2\2\u008e\u008f\7c\2\2\u008f\20\3\2\2\2\u0090"+
		"\u0091\7o\2\2\u0091\u0092\7k\2\2\u0092\u0093\7p\2\2\u0093\22\3\2\2\2\u0094"+
		"\u0095\7u\2\2\u0095\u0096\7g\2\2\u0096\u0097\7i\2\2\u0097\24\3\2\2\2\u0098"+
		"\u0099\7R\2\2\u0099\u009a\7c\2\2\u009a\u009b\7t\2\2\u009b\u009c\7c\2\2"+
		"\u009c\u009d\7i\2\2\u009d\u009e\7t\2\2\u009e\u009f\7c\2\2\u009f\u00a0"+
		"\7h\2\2\u00a0\u00a1\7q\2\2\u00a1\26\3\2\2\2\u00a2\u00a3\7E\2\2\u00a3\u00a4"+
		"\7q\2\2\u00a4\u00a5\7o\2\2\u00a5\u00a6\7r\2\2\u00a6\u00a7\7q\2\2\u00a7"+
		"\u00a8\7p\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7v\2\2"+
		"\u00ab\u00ac\7g\2\2\u00ac\u00ad\7u\2\2\u00ad\30\3\2\2\2\u00ae\u00af\7"+
		"h\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7o\2\2\u00b1\u00b2\7a\2\2\u00b2\u00b3"+
		"\7e\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7o\2\2\u00b5\u00b6\7r\2\2\u00b6"+
		"\u00b7\7q\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7p\2\2"+
		"\u00ba\u00bb\7v\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7u\2\2\u00bd\32\3\2"+
		"\2\2\u00be\u00bf\7f\2\2\u00bf\u00c0\7g\2\2\u00c0\34\3\2\2\2\u00c1\u00c2"+
		"\7i\2\2\u00c2\36\3\2\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6"+
		"\7n\2\2\u00c6\u00c7\7j\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7t\2\2\u00c9"+
		" \3\2\2\2\u00ca\u00cb\7z\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7e\2\2\u00cd"+
		"\u00ce\7c\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7c\2\2\u00d0\"\3\2\2\2\u00d1"+
		"\u00d2\7o\2\2\u00d2\u00d3\7n\2\2\u00d3$\3\2\2\2\u00d4\u00d5\7n\2\2\u00d5"+
		"&\3\2\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7r\2\2\u00d9"+
		"\u00da\7q\2\2\u00da(\3\2\2\2\u00db\u00dc\7r\2\2\u00dc\u00dd\7k\2\2\u00dd"+
		"\u00de\7v\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7f\2\2\u00e0\u00e1\7c\2\2"+
		"\u00e1*\3\2\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7a\2\2\u00e4\u00e5\7i\2"+
		"\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9"+
		"\7q\2\2\u00e9,\3\2\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7j\2\2\u00ec\u00ed"+
		"\7c\2\2\u00ed.\3\2\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1"+
		"\7d\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7o\2\2\u00f4"+
		"\u00f5\7g\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7c\2\2\u00f7\60\3\2\2\2\u00f8"+
		"\u00f9\7u\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc\7c\2\2"+
		"\u00fc\62\3\2\2\2\u00fd\u00fe\7R\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7"+
		"u\2\2\u0100\u0101\7u\2\2\u0101\u0102\7q\2\2\u0102\64\3\2\2\2\u0103\u0104"+
		"\7h\2\2\u0104\u0105\7k\2\2\u0105\u0106\7o\2\2\u0106\u0107\7a\2\2\u0107"+
		"\u0108\7r\2\2\u0108\u0109\7c\2\2\u0109\u010a\7u\2\2\u010a\u010b\7u\2\2"+
		"\u010b\u010c\7q\2\2\u010c\66\3\2\2\2\u010d\u010e\7c\2\2\u010e\u010f\7"+
		"r\2\2\u010f\u0110\7c\2\2\u0110\u0111\7t\2\2\u0111\u0112\7c\2\2\u0112\u0113"+
		"\7h\2\2\u0113\u0114\7w\2\2\u0114\u0115\7u\2\2\u0115\u0116\7g\2\2\u0116"+
		"8\3\2\2\2\u0117\u0118\7*\2\2\u0118:\3\2\2\2\u0119\u011a\7+\2\2\u011a<"+
		"\3\2\2\2\u011b\u011c\7c\2\2\u011c\u011d\7l\2\2\u011d\u011e\7w\2\2\u011e"+
		"\u011f\7u\2\2\u011f\u0120\7v\2\2\u0120\u0121\7g\2\2\u0121>\3\2\2\2\u0122"+
		"\u0123\7.\2\2\u0123@\3\2\2\2\u0124\u0125\7e\2\2\u0125\u0126\7q\2\2\u0126"+
		"\u0127\7n\2\2\u0127\u0128\7g\2\2\u0128B\3\2\2\2\u0129\u012a\7v\2\2\u012a"+
		"\u012b\7g\2\2\u012b\u012c\7u\2\2\u012c\u012d\7v\2\2\u012d\u012e\7g\2\2"+
		"\u012eD\3\2\2\2\u012f\u0130\7g\2\2\u0130\u0131\7v\2\2\u0131\u0132\7c\2"+
		"\2\u0132\u0133\7r\2\2\u0133\u0134\7c\2\2\u0134F\3\2\2\2\u0135\u0136\7"+
		"c\2\2\u0136\u0137\7t\2\2\u0137\u0138\7o\2\2\u0138\u0139\7c\2\2\u0139\u013a"+
		"\7t\2\2\u013a\u013b\7k\2\2\u013b\u013c\7q\2\2\u013cH\3\2\2\2\u013d\u013e"+
		"\7e\2\2\u013e\u013f\7c\2\2\u013f\u0140\7o\2\2\u0140\u0141\7c\2\2\u0141"+
		"J\3\2\2\2\u0142\u0143\7o\2\2\u0143\u0144\7g\2\2\u0144\u0145\7u\2\2\u0145"+
		"\u0146\7c\2\2\u0146L\3\2\2\2\u0147\u0148\7e\2\2\u0148\u0149\7c\2\2\u0149"+
		"\u014a\7f\2\2\u014a\u014b\7g\2\2\u014b\u014c\7k\2\2\u014c\u014d\7t\2\2"+
		"\u014d\u014e\7c\2\2\u014eN\3\2\2\2\u014f\u0150\7r\2\2\u0150\u0151\7c\2"+
		"\2\u0151\u0152\7t\2\2\u0152\u0153\7c\2\2\u0153\u0154\7n\2\2\u0154\u0155"+
		"\7g\2\2\u0155\u0156\7n\2\2\u0156\u0157\7c\2\2\u0157P\3\2\2\2\u0158\u0159"+
		"\7r\2\2\u0159\u015a\7g\2\2\u015a\u015b\7t\2\2\u015b\u015c\7r\2\2\u015c"+
		"\u015d\7g\2\2\u015d\u015e\7p\2\2\u015e\u015f\7f\2\2\u015f\u0160\7k\2\2"+
		"\u0160\u0161\7e\2\2\u0161\u0162\7w\2\2\u0162\u0163\7n\2\2\u0163\u0164"+
		"\7c\2\2\u0164\u0165\7t\2\2\u0165R\3\2\2\2\u0166\u0168\4\62;\2\u0167\u0166"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"T\3\2\2\2\u016b\u016f\4C\\\2\u016c\u016e\t\2\2\2\u016d\u016c\3\2\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170V\3\2\2\2"+
		"\u0171\u016f\3\2\2\2\u0172\u0174\4c|\2\u0173\u0172\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176X\3\2\2\2\u0177"+
		"\u017c\7$\2\2\u0178\u017b\5[.\2\u0179\u017b\n\3\2\2\u017a\u0178\3\2\2"+
		"\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d"+
		"\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7$\2\2\u0180"+
		"Z\3\2\2\2\u0181\u0182\7^\2\2\u0182\u0183\7$\2\2\u0183\\\3\2\2\2\u0184"+
		"\u0188\7&\2\2\u0185\u0187\n\4\2\2\u0186\u0185\3\2\2\2\u0187\u018a\3\2"+
		"\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018c\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018b\u018d\7\17\2\2\u018c\u018b\3\2\2\2\u018c\u018d\3"+
		"\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\7\f\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0191\b/\2\2\u0191^\3\2\2\2\u0192\u0194\t\5\2\2\u0193\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0198\b\60\2\2\u0198`\3\2\2\2\f\2\u0169\u016d\u016f\u0175\u017a"+
		"\u017c\u0188\u018c\u0195\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}