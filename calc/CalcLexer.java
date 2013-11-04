// $ANTLR 3.5.1 Calc.g 2013-11-03 23:37:14

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CalcLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ASSN=4;
	public static final int DIVIDE=5;
	public static final int EOL=6;
	public static final int ID=7;
	public static final int LPAR=8;
	public static final int MINUS=9;
	public static final int NUM=10;
	public static final int PLUS=11;
	public static final int PUT=12;
	public static final int RPAR=13;
	public static final int SET=14;
	public static final int SPACE=15;
	public static final int TIMES=16;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CalcLexer() {} 
	public CalcLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CalcLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Calc.g"; }

	// $ANTLR start "PUT"
	public final void mPUT() throws RecognitionException {
		try {
			int _type = PUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:47:5: ( 'put' )
			// Calc.g:47:7: 'put'
			{
			match("put"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUT"

	// $ANTLR start "SET"
	public final void mSET() throws RecognitionException {
		try {
			int _type = SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:48:5: ( 'set' )
			// Calc.g:48:7: 'set'
			{
			match("set"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SET"

	// $ANTLR start "ASSN"
	public final void mASSN() throws RecognitionException {
		try {
			int _type = ASSN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:50:6: ( '=' )
			// Calc.g:50:8: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSN"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:51:6: ( '+' )
			// Calc.g:51:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:52:9: ( '/' )
			// Calc.g:52:11: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:53:7: ( '-' )
			// Calc.g:53:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "TIMES"
	public final void mTIMES() throws RecognitionException {
		try {
			int _type = TIMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:54:7: ( '*' )
			// Calc.g:54:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMES"

	// $ANTLR start "LPAR"
	public final void mLPAR() throws RecognitionException {
		try {
			int _type = LPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:55:6: ( '(' )
			// Calc.g:55:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAR"

	// $ANTLR start "RPAR"
	public final void mRPAR() throws RecognitionException {
		try {
			int _type = RPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:56:6: ( ')' )
			// Calc.g:56:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAR"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:58:4: ( ( 'a' .. 'z' | 'A' .. 'Z' )* )
			// Calc.g:58:6: ( 'a' .. 'z' | 'A' .. 'Z' )*
			{
			// Calc.g:58:6: ( 'a' .. 'z' | 'A' .. 'Z' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Calc.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:59:5: ( ( '0' .. '9' )+ )
			// Calc.g:59:7: ( '0' .. '9' )+
			{
			// Calc.g:59:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Calc.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "EOL"
	public final void mEOL() throws RecognitionException {
		try {
			int _type = EOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:61:5: ( ( '\\r' )? '\\n' )
			// Calc.g:61:7: ( '\\r' )? '\\n'
			{
			// Calc.g:61:7: ( '\\r' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\r') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Calc.g:61:7: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EOL"

	// $ANTLR start "SPACE"
	public final void mSPACE() throws RecognitionException {
		try {
			int _type = SPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calc.g:63:7: ( ( ' ' | '\\t' )+ )
			// Calc.g:63:9: ( ' ' | '\\t' )+
			{
			// Calc.g:63:9: ( ' ' | '\\t' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\t'||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Calc.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPACE"

	@Override
	public void mTokens() throws RecognitionException {
		// Calc.g:1:8: ( PUT | SET | ASSN | PLUS | DIVIDE | MINUS | TIMES | LPAR | RPAR | ID | NUM | EOL | SPACE )
		int alt5=13;
		switch ( input.LA(1) ) {
		case 'p':
			{
			int LA5_1 = input.LA(2);
			if ( (LA5_1=='u') ) {
				int LA5_14 = input.LA(3);
				if ( (LA5_14=='t') ) {
					int LA5_16 = input.LA(4);
					if ( ((LA5_16 >= 'A' && LA5_16 <= 'Z')||(LA5_16 >= 'a' && LA5_16 <= 'z')) ) {
						alt5=10;
					}

					else {
						alt5=1;
					}

				}

				else {
					alt5=10;
				}

			}

			else {
				alt5=10;
			}

			}
			break;
		case 's':
			{
			int LA5_2 = input.LA(2);
			if ( (LA5_2=='e') ) {
				int LA5_15 = input.LA(3);
				if ( (LA5_15=='t') ) {
					int LA5_17 = input.LA(4);
					if ( ((LA5_17 >= 'A' && LA5_17 <= 'Z')||(LA5_17 >= 'a' && LA5_17 <= 'z')) ) {
						alt5=10;
					}

					else {
						alt5=2;
					}

				}

				else {
					alt5=10;
				}

			}

			else {
				alt5=10;
			}

			}
			break;
		case '=':
			{
			alt5=3;
			}
			break;
		case '+':
			{
			alt5=4;
			}
			break;
		case '/':
			{
			alt5=5;
			}
			break;
		case '-':
			{
			alt5=6;
			}
			break;
		case '*':
			{
			alt5=7;
			}
			break;
		case '(':
			{
			alt5=8;
			}
			break;
		case ')':
			{
			alt5=9;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt5=11;
			}
			break;
		case '\n':
		case '\r':
			{
			alt5=12;
			}
			break;
		case '\t':
		case ' ':
			{
			alt5=13;
			}
			break;
		default:
			alt5=10;
		}
		switch (alt5) {
			case 1 :
				// Calc.g:1:10: PUT
				{
				mPUT(); 

				}
				break;
			case 2 :
				// Calc.g:1:14: SET
				{
				mSET(); 

				}
				break;
			case 3 :
				// Calc.g:1:18: ASSN
				{
				mASSN(); 

				}
				break;
			case 4 :
				// Calc.g:1:23: PLUS
				{
				mPLUS(); 

				}
				break;
			case 5 :
				// Calc.g:1:28: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 6 :
				// Calc.g:1:35: MINUS
				{
				mMINUS(); 

				}
				break;
			case 7 :
				// Calc.g:1:41: TIMES
				{
				mTIMES(); 

				}
				break;
			case 8 :
				// Calc.g:1:47: LPAR
				{
				mLPAR(); 

				}
				break;
			case 9 :
				// Calc.g:1:52: RPAR
				{
				mRPAR(); 

				}
				break;
			case 10 :
				// Calc.g:1:57: ID
				{
				mID(); 

				}
				break;
			case 11 :
				// Calc.g:1:60: NUM
				{
				mNUM(); 

				}
				break;
			case 12 :
				// Calc.g:1:64: EOL
				{
				mEOL(); 

				}
				break;
			case 13 :
				// Calc.g:1:68: SPACE
				{
				mSPACE(); 

				}
				break;

		}
	}



}
