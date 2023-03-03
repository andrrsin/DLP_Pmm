// Generated from java-escape by ANTLR 4.11.1
package parser;

    import ast.*;
    import ast.literals.*;
    import ast.expressions.*;
    import ast.statements.*;
    import ast.types.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, TRASH=41, INT_CONSTANT=42, CHAR_CONSTANT=43, REAL_CONSTANT=44, 
		ID=45, COMMENT=46;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_definition = 2, RULE_parameters = 3, 
		RULE_f_body = 4, RULE_statement = 5, RULE_block = 6, RULE_expression = 7, 
		RULE_type = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "definition", "parameters", "f_body", "statement", 
			"block", "expression", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def main('", "'):'", "'{'", "'}'", "'def'", "'('", "','", "':'", 
			"';'", "'print'", "'f'", "');'", "'return'", "'input('", "'while'", "'if'", 
			"'else:'", "'='", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'<='", "'>'", 
			"'>='", "'!='", "'=='", "'&&'", "'||'", "'!'", "'.'", "'['", "']'", "')'", 
			"'int'", "'char'", "'double'", "'struct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "TRASH", "INT_CONSTANT", "CHAR_CONSTANT", 
			"REAL_CONSTANT", "ID", "COMMENT"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==ID) {
				{
				{
				setState(18);
				definition();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			main();
			setState(25);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public F_bodyContext f_body() {
			return getRuleContext(F_bodyContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__0);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(28);
				parameters();
				}
			}

			setState(31);
			match(T__1);
			setState(32);
			match(T__2);
			setState(33);
			f_body();
			setState(34);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public F_bodyContext f_body() {
			return getRuleContext(F_bodyContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(T__4);
				setState(37);
				match(ID);
				setState(38);
				match(T__5);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(39);
					parameters();
					}
				}

				setState(42);
				match(T__1);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 2078764171264L) != 0) {
					{
					setState(43);
					type();
					}
				}

				setState(46);
				match(T__2);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 65975001146464L) != 0) {
					{
					setState(47);
					f_body();
					}
				}

				setState(50);
				match(T__3);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(ID);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(52);
					match(T__6);
					setState(53);
					match(ID);
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(T__7);
				setState(60);
				type();
				setState(61);
				match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ID);
			setState(66);
			match(T__7);
			setState(67);
			type();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(68);
				match(T__6);
				setState(69);
				match(ID);
				setState(70);
				match(T__7);
				setState(71);
				type();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class F_bodyContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public F_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitF_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final F_bodyContext f_body() throws RecognitionException {
		F_bodyContext _localctx = new F_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_f_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77);
					definition();
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				statement();
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 65975001146432L) != 0 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__9);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(89);
					match(T__10);
					}
				}

				setState(92);
				match(T__5);
				setState(93);
				expression(0);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(94);
					match(T__6);
					setState(95);
					expression(0);
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__9);
				setState(104);
				expression(0);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(105);
					match(T__6);
					setState(106);
					expression(0);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(T__12);
				setState(115);
				expression(0);
				setState(116);
				match(T__8);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(T__13);
				setState(119);
				expression(0);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(120);
					match(T__6);
					setState(121);
					expression(0);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(T__11);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				match(T__14);
				setState(130);
				expression(0);
				setState(131);
				match(T__7);
				setState(132);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
				match(T__15);
				setState(135);
				expression(0);
				setState(136);
				match(T__7);
				setState(137);
				block();
				setState(140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(138);
					match(T__16);
					setState(139);
					block();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				expression(0);
				setState(143);
				match(T__17);
				setState(144);
				expression(0);
				setState(145);
				match(T__8);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(147);
				match(ID);
				setState(148);
				match(T__5);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 65975001022528L) != 0) {
					{
					setState(149);
					expression(0);
					}
				}

				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(152);
					match(T__6);
					setState(153);
					expression(0);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(T__11);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__9:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__22:
			case T__31:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case REAL_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				statement();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__2);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 65975001146432L) != 0) {
					{
					{
					setState(164);
					statement();
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(170);
				match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Token OP;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(174);
				match(T__31);
				setState(175);
				expression(10);
				}
				break;
			case 2:
				{
				setState(176);
				match(T__22);
				setState(177);
				expression(8);
				}
				break;
			case 3:
				{
				setState(178);
				match(T__5);
				setState(179);
				expression(0);
				setState(180);
				match(T__35);
				}
				break;
			case 4:
				{
				setState(182);
				match(T__5);
				setState(183);
				type();
				setState(184);
				match(T__35);
				setState(185);
				expression(5);
				}
				break;
			case 5:
				{
				setState(187);
				match(INT_CONSTANT);
				}
				break;
			case 6:
				{
				setState(188);
				match(REAL_CONSTANT);
				}
				break;
			case 7:
				{
				setState(189);
				match(CHAR_CONSTANT);
				}
				break;
			case 8:
				{
				setState(190);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(194);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 16252928L) != 0) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(195);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(197);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(198);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(200);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(203);
						match(T__32);
						setState(204);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(206);
						match(T__33);
						setState(207);
						expression(0);
						setState(208);
						match(T__34);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(PmmParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(PmmParser.INT_CONSTANT, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			int _alt;
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(T__39);
				setState(219);
				match(T__2);
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(220);
					match(ID);
					setState(221);
					match(T__7);
					setState(222);
					type();
					setState(223);
					match(T__8);
					}
					}
					setState(227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(229);
				match(T__3);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 5);
				{
				setState(234); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(231);
						match(T__33);
						setState(232);
						match(INT_CONSTANT);
						setState(233);
						match(T__34);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(236); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(238);
				type();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u00f2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u001e\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002)\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002-\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u00021\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u00027\b\u0002\n\u0002\f\u0002:\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002@\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003I\b\u0003\n\u0003\f\u0003L\t\u0003\u0001\u0004\u0005\u0004O\b\u0004"+
		"\n\u0004\f\u0004R\t\u0004\u0001\u0004\u0004\u0004U\b\u0004\u000b\u0004"+
		"\f\u0004V\u0001\u0005\u0001\u0005\u0003\u0005[\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005a\b\u0005\n\u0005\f\u0005d\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005l\b\u0005\n\u0005\f\u0005o\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005{\b\u0005\n\u0005\f\u0005~\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u008d\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0097\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u009b\b\u0005"+
		"\n\u0005\f\u0005\u009e\t\u0005\u0001\u0005\u0003\u0005\u00a1\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00a6\b\u0006\n\u0006\f\u0006"+
		"\u00a9\t\u0006\u0001\u0006\u0003\u0006\u00ac\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c0"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00d3\b\u0007\n\u0007\f\u0007\u00d6\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00e2"+
		"\b\b\u000b\b\f\b\u00e3\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b"+
		"\u00eb\b\b\u000b\b\f\b\u00ec\u0001\b\u0003\b\u00f0\b\b\u0001\b\u0000\u0001"+
		"\u000e\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0003\u0001\u0000"+
		"\u0013\u0017\u0001\u0000\u0018\u001d\u0001\u0000\u001e\u001f\u0114\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000\u0000\u0004"+
		"?\u0001\u0000\u0000\u0000\u0006A\u0001\u0000\u0000\u0000\bP\u0001\u0000"+
		"\u0000\u0000\n\u00a0\u0001\u0000\u0000\u0000\f\u00ab\u0001\u0000\u0000"+
		"\u0000\u000e\u00bf\u0001\u0000\u0000\u0000\u0010\u00ef\u0001\u0000\u0000"+
		"\u0000\u0012\u0014\u0003\u0004\u0002\u0000\u0013\u0012\u0001\u0000\u0000"+
		"\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0018\u0001\u0000\u0000"+
		"\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0002\u0001"+
		"\u0000\u0019\u001a\u0005\u0000\u0000\u0001\u001a\u0001\u0001\u0000\u0000"+
		"\u0000\u001b\u001d\u0005\u0001\u0000\u0000\u001c\u001e\u0003\u0006\u0003"+
		"\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0005\u0002\u0000\u0000"+
		" !\u0005\u0003\u0000\u0000!\"\u0003\b\u0004\u0000\"#\u0005\u0004\u0000"+
		"\u0000#\u0003\u0001\u0000\u0000\u0000$%\u0005\u0005\u0000\u0000%&\u0005"+
		"-\u0000\u0000&(\u0005\u0006\u0000\u0000\')\u0003\u0006\u0003\u0000(\'"+
		"\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000"+
		"\u0000*,\u0005\u0002\u0000\u0000+-\u0003\u0010\b\u0000,+\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0005\u0003"+
		"\u0000\u0000/1\u0003\b\u0004\u00000/\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u00002@\u0005\u0004\u0000\u000038\u0005"+
		"-\u0000\u000045\u0005\u0007\u0000\u000057\u0005-\u0000\u000064\u0001\u0000"+
		"\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		";<\u0005\b\u0000\u0000<=\u0003\u0010\b\u0000=>\u0005\t\u0000\u0000>@\u0001"+
		"\u0000\u0000\u0000?$\u0001\u0000\u0000\u0000?3\u0001\u0000\u0000\u0000"+
		"@\u0005\u0001\u0000\u0000\u0000AB\u0005-\u0000\u0000BC\u0005\b\u0000\u0000"+
		"CJ\u0003\u0010\b\u0000DE\u0005\u0007\u0000\u0000EF\u0005-\u0000\u0000"+
		"FG\u0005\b\u0000\u0000GI\u0003\u0010\b\u0000HD\u0001\u0000\u0000\u0000"+
		"IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000K\u0007\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MO\u0003"+
		"\u0004\u0002\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000SU\u0003\n\u0005\u0000TS\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000W\t\u0001\u0000\u0000\u0000XZ\u0005\n\u0000\u0000Y[\u0005"+
		"\u000b\u0000\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\]\u0005\u0006\u0000\u0000]b\u0003\u000e\u0007"+
		"\u0000^_\u0005\u0007\u0000\u0000_a\u0003\u000e\u0007\u0000`^\u0001\u0000"+
		"\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"ef\u0005\f\u0000\u0000f\u00a1\u0001\u0000\u0000\u0000gh\u0005\n\u0000"+
		"\u0000hm\u0003\u000e\u0007\u0000ij\u0005\u0007\u0000\u0000jl\u0003\u000e"+
		"\u0007\u0000ki\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000pq\u0005\t\u0000\u0000q\u00a1\u0001\u0000\u0000"+
		"\u0000rs\u0005\r\u0000\u0000st\u0003\u000e\u0007\u0000tu\u0005\t\u0000"+
		"\u0000u\u00a1\u0001\u0000\u0000\u0000vw\u0005\u000e\u0000\u0000w|\u0003"+
		"\u000e\u0007\u0000xy\u0005\u0007\u0000\u0000y{\u0003\u000e\u0007\u0000"+
		"zx\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005\f\u0000\u0000\u0080\u00a1\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005\u000f\u0000\u0000\u0082\u0083\u0003\u000e"+
		"\u0007\u0000\u0083\u0084\u0005\b\u0000\u0000\u0084\u0085\u0003\f\u0006"+
		"\u0000\u0085\u00a1\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0010\u0000"+
		"\u0000\u0087\u0088\u0003\u000e\u0007\u0000\u0088\u0089\u0005\b\u0000\u0000"+
		"\u0089\u008c\u0003\f\u0006\u0000\u008a\u008b\u0005\u0011\u0000\u0000\u008b"+
		"\u008d\u0003\f\u0006\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u00a1\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0003\u000e\u0007\u0000\u008f\u0090\u0005\u0012\u0000\u0000\u0090\u0091"+
		"\u0003\u000e\u0007\u0000\u0091\u0092\u0005\t\u0000\u0000\u0092\u00a1\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0005-\u0000\u0000\u0094\u0096\u0005\u0006"+
		"\u0000\u0000\u0095\u0097\u0003\u000e\u0007\u0000\u0096\u0095\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u009c\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0005\u0007\u0000\u0000\u0099\u009b\u0003\u000e"+
		"\u0007\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000"+
		"\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000"+
		"\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000"+
		"\u0000\u0000\u009f\u00a1\u0005\f\u0000\u0000\u00a0X\u0001\u0000\u0000"+
		"\u0000\u00a0g\u0001\u0000\u0000\u0000\u00a0r\u0001\u0000\u0000\u0000\u00a0"+
		"v\u0001\u0000\u0000\u0000\u00a0\u0081\u0001\u0000\u0000\u0000\u00a0\u0086"+
		"\u0001\u0000\u0000\u0000\u00a0\u008e\u0001\u0000\u0000\u0000\u00a0\u0093"+
		"\u0001\u0000\u0000\u0000\u00a1\u000b\u0001\u0000\u0000\u0000\u00a2\u00ac"+
		"\u0003\n\u0005\u0000\u00a3\u00a7\u0005\u0003\u0000\u0000\u00a4\u00a6\u0003"+
		"\n\u0005\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ac\u0005\u0004\u0000\u0000\u00ab\u00a2\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a3\u0001\u0000\u0000\u0000\u00ac\r\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0006\u0007\uffff\uffff\u0000\u00ae\u00af\u0005 \u0000"+
		"\u0000\u00af\u00c0\u0003\u000e\u0007\n\u00b0\u00b1\u0005\u0017\u0000\u0000"+
		"\u00b1\u00c0\u0003\u000e\u0007\b\u00b2\u00b3\u0005\u0006\u0000\u0000\u00b3"+
		"\u00b4\u0003\u000e\u0007\u0000\u00b4\u00b5\u0005$\u0000\u0000\u00b5\u00c0"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0006\u0000\u0000\u00b7\u00b8"+
		"\u0003\u0010\b\u0000\u00b8\u00b9\u0005$\u0000\u0000\u00b9\u00ba\u0003"+
		"\u000e\u0007\u0005\u00ba\u00c0\u0001\u0000\u0000\u0000\u00bb\u00c0\u0005"+
		"*\u0000\u0000\u00bc\u00c0\u0005,\u0000\u0000\u00bd\u00c0\u0005+\u0000"+
		"\u0000\u00be\u00c0\u0005-\u0000\u0000\u00bf\u00ad\u0001\u0000\u0000\u0000"+
		"\u00bf\u00b0\u0001\u0000\u0000\u0000\u00bf\u00b2\u0001\u0000\u0000\u0000"+
		"\u00bf\u00b6\u0001\u0000\u0000\u0000\u00bf\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bf\u00bc\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00d4\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\n\r\u0000\u0000\u00c2\u00c3\u0007\u0000\u0000\u0000\u00c3"+
		"\u00d3\u0003\u000e\u0007\u000e\u00c4\u00c5\n\f\u0000\u0000\u00c5\u00c6"+
		"\u0007\u0001\u0000\u0000\u00c6\u00d3\u0003\u000e\u0007\r\u00c7\u00c8\n"+
		"\u000b\u0000\u0000\u00c8\u00c9\u0007\u0002\u0000\u0000\u00c9\u00d3\u0003"+
		"\u000e\u0007\f\u00ca\u00cb\n\t\u0000\u0000\u00cb\u00cc\u0005!\u0000\u0000"+
		"\u00cc\u00d3\u0003\u000e\u0007\n\u00cd\u00ce\n\u0007\u0000\u0000\u00ce"+
		"\u00cf\u0005\"\u0000\u0000\u00cf\u00d0\u0003\u000e\u0007\u0000\u00d0\u00d1"+
		"\u0005#\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00c1\u0001"+
		"\u0000\u0000\u0000\u00d2\u00c4\u0001\u0000\u0000\u0000\u00d2\u00c7\u0001"+
		"\u0000\u0000\u0000\u00d2\u00ca\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u000f\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00f0\u0005"+
		"%\u0000\u0000\u00d8\u00f0\u0005&\u0000\u0000\u00d9\u00f0\u0005\'\u0000"+
		"\u0000\u00da\u00db\u0005(\u0000\u0000\u00db\u00e1\u0005\u0003\u0000\u0000"+
		"\u00dc\u00dd\u0005-\u0000\u0000\u00dd\u00de\u0005\b\u0000\u0000\u00de"+
		"\u00df\u0003\u0010\b\u0000\u00df\u00e0\u0005\t\u0000\u0000\u00e0\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e1\u00dc\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0005\u0004\u0000\u0000\u00e6\u00f0\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0005\"\u0000\u0000\u00e8\u00e9\u0005*\u0000\u0000\u00e9\u00eb\u0005"+
		"#\u0000\u0000\u00ea\u00e7\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0\u0003\u0010"+
		"\b\u0000\u00ef\u00d7\u0001\u0000\u0000\u0000\u00ef\u00d8\u0001\u0000\u0000"+
		"\u0000\u00ef\u00d9\u0001\u0000\u0000\u0000\u00ef\u00da\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ea\u0001\u0000\u0000\u0000\u00f0\u0011\u0001\u0000\u0000"+
		"\u0000\u001a\u0015\u001d(,08?JPVZbm|\u008c\u0096\u009c\u00a0\u00a7\u00ab"+
		"\u00bf\u00d2\u00d4\u00e3\u00ec\u00ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}