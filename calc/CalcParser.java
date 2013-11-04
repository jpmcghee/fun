// $ANTLR 3.5.1 Calc.g 2013-11-03 23:37:12
 
    import java.util.TreeMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CalcParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSN", "DIVIDE", "EOL", "ID", 
		"LPAR", "MINUS", "NUM", "PLUS", "PUT", "RPAR", "SET", "SPACE", "TIMES"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CalcParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CalcParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return CalcParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Calc.g"; }


		private TreeMap<String,Integer> store = new TreeMap<String,Integer>();
		// ... storage for variables 'a', ..., 'z'



	// $ANTLR start "prog"
	// Calc.g:14:1: prog : ( com )* EOF ;
	public final void prog() throws RecognitionException {
		try {
			// Calc.g:15:2: ( ( com )* EOF )
			// Calc.g:15:4: ( com )* EOF
			{
			// Calc.g:15:4: ( com )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==PUT||LA1_0==SET) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Calc.g:15:4: com
					{
					pushFollow(FOLLOW_com_in_prog28);
					com();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_prog31); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"



	// $ANTLR start "com"
	// Calc.g:20:1: com : ( PUT v= expr EOL | SET ID ASSN v= expr EOL );
	public final void com() throws RecognitionException {
		Token ID1=null;
		int v =0;

		try {
			// Calc.g:21:2: ( PUT v= expr EOL | SET ID ASSN v= expr EOL )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==PUT) ) {
				alt2=1;
			}
			else if ( (LA2_0==SET) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// Calc.g:21:4: PUT v= expr EOL
					{
					match(input,PUT,FOLLOW_PUT_in_com44); 
					pushFollow(FOLLOW_expr_in_com48);
					v=expr();
					state._fsp--;

					match(input,EOL,FOLLOW_EOL_in_com50); 
					 System.out.println(v); 
					}
					break;
				case 2 :
					// Calc.g:22:4: SET ID ASSN v= expr EOL
					{
					match(input,SET,FOLLOW_SET_in_com63); 
					ID1=(Token)match(input,ID,FOLLOW_ID_in_com65); 
					match(input,ASSN,FOLLOW_ASSN_in_com67); 
					pushFollow(FOLLOW_expr_in_com75);
					v=expr();
					state._fsp--;

					match(input,EOL,FOLLOW_EOL_in_com77); 
					 store.put(new String((ID1!=null?ID1.getText():null)),new Integer(v)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "com"



	// $ANTLR start "expr"
	// Calc.g:28:1: expr returns [int value] : v1= term ( PLUS v2= term | MINUS v2= term | TIMES v2= term | DIVIDE v2= term )* ;
	public final int expr() throws RecognitionException {
		int value = 0;


		int v1 =0;
		int v2 =0;

		try {
			// Calc.g:29:2: (v1= term ( PLUS v2= term | MINUS v2= term | TIMES v2= term | DIVIDE v2= term )* )
			// Calc.g:29:4: v1= term ( PLUS v2= term | MINUS v2= term | TIMES v2= term | DIVIDE v2= term )*
			{
			pushFollow(FOLLOW_term_in_expr128);
			v1=term();
			state._fsp--;

			 value = v1; 
			// Calc.g:30:3: ( PLUS v2= term | MINUS v2= term | TIMES v2= term | DIVIDE v2= term )*
			loop3:
			while (true) {
				int alt3=5;
				switch ( input.LA(1) ) {
				case PLUS:
					{
					alt3=1;
					}
					break;
				case MINUS:
					{
					alt3=2;
					}
					break;
				case TIMES:
					{
					alt3=3;
					}
					break;
				case DIVIDE:
					{
					alt3=4;
					}
					break;
				}
				switch (alt3) {
				case 1 :
					// Calc.g:30:5: PLUS v2= term
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr149); 
					pushFollow(FOLLOW_term_in_expr153);
					v2=term();
					state._fsp--;

					 value += v2; 
					}
					break;
				case 2 :
					// Calc.g:31:5: MINUS v2= term
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr167); 
					pushFollow(FOLLOW_term_in_expr171);
					v2=term();
					state._fsp--;

					 value -= v2; 
					}
					break;
				case 3 :
					// Calc.g:32:5: TIMES v2= term
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr184); 
					pushFollow(FOLLOW_term_in_expr188);
					v2=term();
					state._fsp--;

					 value *= v2; 
					}
					break;
				case 4 :
					// Calc.g:33:5: DIVIDE v2= term
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_expr201); 
					pushFollow(FOLLOW_term_in_expr205);
					v2=term();
					state._fsp--;

					 value /= v2; 
					}
					break;

				default :
					break loop3;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "expr"



	// $ANTLR start "term"
	// Calc.g:37:1: term returns [int value] : ( NUM | ID | LPAR v= expr RPAR );
	public final int term() throws RecognitionException {
		int value = 0;


		Token NUM2=null;
		Token ID3=null;
		int v =0;

		try {
			// Calc.g:38:2: ( NUM | ID | LPAR v= expr RPAR )
			int alt4=3;
			switch ( input.LA(1) ) {
			case NUM:
				{
				alt4=1;
				}
				break;
			case ID:
				{
				alt4=2;
				}
				break;
			case LPAR:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// Calc.g:38:4: NUM
					{
					NUM2=(Token)match(input,NUM,FOLLOW_NUM_in_term253); 
					 value = Integer.parseInt(
							                         (NUM2!=null?NUM2.getText():null)); 
					}
					break;
				case 2 :
					// Calc.g:40:4: ID
					{
					ID3=(Token)match(input,ID,FOLLOW_ID_in_term277); 
					value = store.get(new String((ID3!=null?ID3.getText():null)));
					}
					break;
				case 3 :
					// Calc.g:42:4: LPAR v= expr RPAR
					{
					match(input,LPAR,FOLLOW_LPAR_in_term303); 
					pushFollow(FOLLOW_expr_in_term307);
					v=expr();
					state._fsp--;

					match(input,RPAR,FOLLOW_RPAR_in_term309); 
					 value = v; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "term"

	// Delegated rules



	public static final BitSet FOLLOW_com_in_prog28 = new BitSet(new long[]{0x0000000000005000L});
	public static final BitSet FOLLOW_EOF_in_prog31 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PUT_in_com44 = new BitSet(new long[]{0x0000000000000580L});
	public static final BitSet FOLLOW_expr_in_com48 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_EOL_in_com50 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_com63 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_com65 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ASSN_in_com67 = new BitSet(new long[]{0x0000000000000580L});
	public static final BitSet FOLLOW_expr_in_com75 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_EOL_in_com77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_expr128 = new BitSet(new long[]{0x0000000000010A22L});
	public static final BitSet FOLLOW_PLUS_in_expr149 = new BitSet(new long[]{0x0000000000000580L});
	public static final BitSet FOLLOW_term_in_expr153 = new BitSet(new long[]{0x0000000000010A22L});
	public static final BitSet FOLLOW_MINUS_in_expr167 = new BitSet(new long[]{0x0000000000000580L});
	public static final BitSet FOLLOW_term_in_expr171 = new BitSet(new long[]{0x0000000000010A22L});
	public static final BitSet FOLLOW_TIMES_in_expr184 = new BitSet(new long[]{0x0000000000000580L});
	public static final BitSet FOLLOW_term_in_expr188 = new BitSet(new long[]{0x0000000000010A22L});
	public static final BitSet FOLLOW_DIVIDE_in_expr201 = new BitSet(new long[]{0x0000000000000580L});
	public static final BitSet FOLLOW_term_in_expr205 = new BitSet(new long[]{0x0000000000010A22L});
	public static final BitSet FOLLOW_NUM_in_term253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_term277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_term303 = new BitSet(new long[]{0x0000000000000580L});
	public static final BitSet FOLLOW_expr_in_term307 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RPAR_in_term309 = new BitSet(new long[]{0x0000000000000002L});
}
