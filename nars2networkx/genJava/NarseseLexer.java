// Generated from Narsese.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NarseseLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, SentenceType=27, NarsLogEntryPrefix=28, Believe=29, 
		Wonder=30, Variable=31, COPULA=32, FutureEvent=33, PresentEvent=34, PastEvent=35, 
		CYCLES=36, FLOAT=37, DIGIT=38, WORD=39, NewLine=40, WS=41, LineComment=42, 
		BlockComment=43;
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
			"T__25", "SentenceType", "NarsLogEntryPrefix", "Believe", "Wonder", "Variable", 
			"COPULA", "FutureEvent", "PresentEvent", "PastEvent", "CYCLES", "FLOAT", 
			"DIGIT", "WORD", "NewLine", "WS", "LineComment", "BlockComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'{'", "'}'", "'>'", "'('", "'*'", "','", "')'", "'ECHO'", 
			"':'", "'['", "']'", "'%'", "';'", "'_'", "'&&'", "'||'", "'&|'", "'&/'", 
			"'|'", "'&'", "'/'", "'--'", "'\\'", "'-'", "'~'", null, null, "'^believe'", 
			"'^wonder'", null, null, "':/:'", "':|:'", "':\\:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "SentenceType", "NarsLogEntryPrefix", "Believe", "Wonder", 
			"Variable", "COPULA", "FutureEvent", "PresentEvent", "PastEvent", "CYCLES", 
			"FLOAT", "DIGIT", "WORD", "NewLine", "WS", "LineComment", "BlockComment"
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


	public NarseseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Narsese.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0147\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00ae\n\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \5 \u00c4\n \3 \3 \3 \5 \u00c9\n \3 \3 \3 \5 \u00ce"+
		"\n \5 \u00d0\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u00f6\n!\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\5&\u0108\n&\3&\6&\u010b"+
		"\n&\r&\16&\u010c\3&\5&\u0110\n&\3&\6&\u0113\n&\r&\16&\u0114\3\'\6\'\u0118"+
		"\n\'\r\'\16\'\u0119\3(\3(\7(\u011e\n(\f(\16(\u0121\13(\3)\3)\3)\5)\u0126"+
		"\n)\3*\6*\u0129\n*\r*\16*\u012a\3*\3*\3+\3+\3+\3+\7+\u0133\n+\f+\16+\u0136"+
		"\13+\3+\3+\3,\3,\3,\3,\7,\u013e\n,\f,\16,\u0141\13,\3,\3,\3,\3,\3,\3\u013f"+
		"\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\7\5\2##\60\60AB\4\2C\\c|\7\2//"+
		"\62;C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17\2\u0163\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3"+
		"Y\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\t_\3\2\2\2\13a\3\2\2\2\rc\3\2\2\2\17e"+
		"\3\2\2\2\21g\3\2\2\2\23i\3\2\2\2\25n\3\2\2\2\27p\3\2\2\2\31r\3\2\2\2\33"+
		"t\3\2\2\2\35v\3\2\2\2\37x\3\2\2\2!z\3\2\2\2#}\3\2\2\2%\u0080\3\2\2\2\'"+
		"\u0083\3\2\2\2)\u0086\3\2\2\2+\u0088\3\2\2\2-\u008a\3\2\2\2/\u008c\3\2"+
		"\2\2\61\u008f\3\2\2\2\63\u0091\3\2\2\2\65\u0093\3\2\2\2\67\u0095\3\2\2"+
		"\29\u00ad\3\2\2\2;\u00af\3\2\2\2=\u00b8\3\2\2\2?\u00cf\3\2\2\2A\u00f5"+
		"\3\2\2\2C\u00f7\3\2\2\2E\u00fb\3\2\2\2G\u00ff\3\2\2\2I\u0103\3\2\2\2K"+
		"\u0107\3\2\2\2M\u0117\3\2\2\2O\u011b\3\2\2\2Q\u0125\3\2\2\2S\u0128\3\2"+
		"\2\2U\u012e\3\2\2\2W\u0139\3\2\2\2YZ\7>\2\2Z\4\3\2\2\2[\\\7}\2\2\\\6\3"+
		"\2\2\2]^\7\177\2\2^\b\3\2\2\2_`\7@\2\2`\n\3\2\2\2ab\7*\2\2b\f\3\2\2\2"+
		"cd\7,\2\2d\16\3\2\2\2ef\7.\2\2f\20\3\2\2\2gh\7+\2\2h\22\3\2\2\2ij\7G\2"+
		"\2jk\7E\2\2kl\7J\2\2lm\7Q\2\2m\24\3\2\2\2no\7<\2\2o\26\3\2\2\2pq\7]\2"+
		"\2q\30\3\2\2\2rs\7_\2\2s\32\3\2\2\2tu\7\'\2\2u\34\3\2\2\2vw\7=\2\2w\36"+
		"\3\2\2\2xy\7a\2\2y \3\2\2\2z{\7(\2\2{|\7(\2\2|\"\3\2\2\2}~\7~\2\2~\177"+
		"\7~\2\2\177$\3\2\2\2\u0080\u0081\7(\2\2\u0081\u0082\7~\2\2\u0082&\3\2"+
		"\2\2\u0083\u0084\7(\2\2\u0084\u0085\7\61\2\2\u0085(\3\2\2\2\u0086\u0087"+
		"\7~\2\2\u0087*\3\2\2\2\u0088\u0089\7(\2\2\u0089,\3\2\2\2\u008a\u008b\7"+
		"\61\2\2\u008b.\3\2\2\2\u008c\u008d\7/\2\2\u008d\u008e\7/\2\2\u008e\60"+
		"\3\2\2\2\u008f\u0090\7^\2\2\u0090\62\3\2\2\2\u0091\u0092\7/\2\2\u0092"+
		"\64\3\2\2\2\u0093\u0094\7\u0080\2\2\u0094\66\3\2\2\2\u0095\u0096\t\2\2"+
		"\2\u00968\3\2\2\2\u0097\u0098\7Q\2\2\u0098\u0099\7W\2\2\u0099\u009a\7"+
		"V\2\2\u009a\u009b\3\2\2\2\u009b\u00ae\7<\2\2\u009c\u009d\7G\2\2\u009d"+
		"\u009e\7Z\2\2\u009e\u009f\7G\2\2\u009f\u00a0\3\2\2\2\u00a0\u00ae\7<\2"+
		"\2\u00a1\u00a2\7K\2\2\u00a2\u00a3\7P\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00ae"+
		"\7<\2\2\u00a5\u00a6\7C\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7u\2\2\u00a8"+
		"\u00a9\7y\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\3\2\2"+
		"\2\u00ac\u00ae\7<\2\2\u00ad\u0097\3\2\2\2\u00ad\u009c\3\2\2\2\u00ad\u00a1"+
		"\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ae:\3\2\2\2\u00af\u00b0\7`\2\2\u00b0\u00b1"+
		"\7d\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7k\2\2\u00b4"+
		"\u00b5\7g\2\2\u00b5\u00b6\7x\2\2\u00b6\u00b7\7g\2\2\u00b7<\3\2\2\2\u00b8"+
		"\u00b9\7`\2\2\u00b9\u00ba\7y\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7p\2\2"+
		"\u00bc\u00bd\7f\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7t\2\2\u00bf>\3\2\2"+
		"\2\u00c0\u00c3\7&\2\2\u00c1\u00c4\5O(\2\u00c2\u00c4\5M\'\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00d0\3\2\2\2\u00c5\u00c8\7%\2\2\u00c6"+
		"\u00c9\5O(\2\u00c7\u00c9\5M\'\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2"+
		"\2\u00c9\u00d0\3\2\2\2\u00ca\u00cd\7A\2\2\u00cb\u00ce\5O(\2\u00cc\u00ce"+
		"\5M\'\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00c0\3\2\2\2\u00cf\u00c5\3\2\2\2\u00cf\u00ca\3\2\2\2\u00d0@\3\2\2\2"+
		"\u00d1\u00d2\7/\2\2\u00d2\u00d3\7/\2\2\u00d3\u00f6\7@\2\2\u00d4\u00d5"+
		"\7>\2\2\u00d5\u00d6\7/\2\2\u00d6\u00f6\7@\2\2\u00d7\u00d8\7}\2\2\u00d8"+
		"\u00d9\7/\2\2\u00d9\u00f6\7/\2\2\u00da\u00db\7/\2\2\u00db\u00dc\7/\2\2"+
		"\u00dc\u00f6\7_\2\2\u00dd\u00de\7}\2\2\u00de\u00df\7/\2\2\u00df\u00f6"+
		"\7_\2\2\u00e0\u00e1\7?\2\2\u00e1\u00e2\7?\2\2\u00e2\u00f6\7@\2\2\u00e3"+
		"\u00e4\7?\2\2\u00e4\u00e5\7\61\2\2\u00e5\u00f6\7@\2\2\u00e6\u00e7\7?\2"+
		"\2\u00e7\u00e8\7~\2\2\u00e8\u00f6\7@\2\2\u00e9\u00ea\7?\2\2\u00ea\u00eb"+
		"\7^\2\2\u00eb\u00f6\7@\2\2\u00ec\u00ed\7>\2\2\u00ed\u00ee\7?\2\2\u00ee"+
		"\u00f6\7@\2\2\u00ef\u00f0\7>\2\2\u00f0\u00f1\7\61\2\2\u00f1\u00f6\7@\2"+
		"\2\u00f2\u00f3\7>\2\2\u00f3\u00f4\7~\2\2\u00f4\u00f6\7@\2\2\u00f5\u00d1"+
		"\3\2\2\2\u00f5\u00d4\3\2\2\2\u00f5\u00d7\3\2\2\2\u00f5\u00da\3\2\2\2\u00f5"+
		"\u00dd\3\2\2\2\u00f5\u00e0\3\2\2\2\u00f5\u00e3\3\2\2\2\u00f5\u00e6\3\2"+
		"\2\2\u00f5\u00e9\3\2\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f5"+
		"\u00f2\3\2\2\2\u00f6B\3\2\2\2\u00f7\u00f8\7<\2\2\u00f8\u00f9\7\61\2\2"+
		"\u00f9\u00fa\7<\2\2\u00faD\3\2\2\2\u00fb\u00fc\7<\2\2\u00fc\u00fd\7~\2"+
		"\2\u00fd\u00fe\7<\2\2\u00feF\3\2\2\2\u00ff\u0100\7<\2\2\u0100\u0101\7"+
		"^\2\2\u0101\u0102\7<\2\2\u0102H\3\2\2\2\u0103\u0104\7-\2\2\u0104\u0105"+
		"\5M\'\2\u0105J\3\2\2\2\u0106\u0108\7\60\2\2\u0107\u0106\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u010b\5M\'\2\u010a\u0109\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u0110\7\60\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3"+
		"\2\2\2\u0110\u0112\3\2\2\2\u0111\u0113\5M\'\2\u0112\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115L\3\2\2\2"+
		"\u0116\u0118\4\62;\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011aN\3\2\2\2\u011b\u011f\t\3\2\2\u011c"+
		"\u011e\t\4\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120P\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123"+
		"\7\17\2\2\u0123\u0126\7\f\2\2\u0124\u0126\7\f\2\2\u0125\u0122\3\2\2\2"+
		"\u0125\u0124\3\2\2\2\u0126R\3\2\2\2\u0127\u0129\t\5\2\2\u0128\u0127\3"+
		"\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\b*\2\2\u012dT\3\2\2\2\u012e\u012f\7\61\2\2"+
		"\u012f\u0130\7\61\2\2\u0130\u0134\3\2\2\2\u0131\u0133\n\6\2\2\u0132\u0131"+
		"\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\b+\2\2\u0138V\3\2\2\2\u0139"+
		"\u013a\7\61\2\2\u013a\u013b\7,\2\2\u013b\u013f\3\2\2\2\u013c\u013e\13"+
		"\2\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u0140\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7,"+
		"\2\2\u0143\u0144\7\61\2\2\u0144\u0145\3\2\2\2\u0145\u0146\b,\2\2\u0146"+
		"X\3\2\2\2\23\2\u00ad\u00c3\u00c8\u00cd\u00cf\u00f5\u0107\u010c\u010f\u0114"+
		"\u0119\u011f\u0125\u012a\u0134\u013f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}