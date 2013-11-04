grammar Calc;

@parser::header { 
    import java.util.TreeMap;
}

@members {
	private TreeMap<String,Integer> store = new TreeMap<String,Integer>();
	// ... storage for variables 'a', ..., 'z'
}

// Programs 

prog
	:	com* EOF
	;

// Commands

com
	:	PUT v=expr EOL       { System.out.println(v); }
	|	SET ID ASSN
		  v=expr EOL         { store.put(new String($ID.text),new Integer(v)); }
	;

// Expressions

expr		                     returns [int value]
	:	v1=term              { $value = v1; }
		( PLUS v2=term       { $value += v2; }
		| MINUS v2=term      { $value -= v2; }
		| TIMES v2=term      { $value *= v2; }
		| DIVIDE v2=term     { $value /= v2; }
		)*
	;

term		                     returns [int value]
	:	NUM                  { $value = Integer.parseInt(
		                         $NUM.text); }
	|	ID                   {$value = store.get(new String($ID.text));}

	|	LPAR v=expr RPAR     { $value = v; }
	;

// Lexicon

PUT	:	'put' ;
SET	:	'set' ;

ASSN	:	'=' ;
PLUS	:	'+' ;
DIVIDE  :	'/' ;
MINUS	:	'-' ;
TIMES	:	'*' ;
LPAR	:	'(' ;
RPAR	:	')' ;

ID	:	('a'..'z'|'A'..'Z')*;
NUM	:	'0'..'9'+ ;

EOL	:	'\r'? '\n' ;

SPACE	:	(' ' | '\t')+        { skip(); } ;
