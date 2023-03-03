grammar Pmm;	
@header{
    import ast.*;
    import ast.literals.*;
    import ast.expressions.*;
    import ast.statements.*;
    import ast.types.*;
}
program: //returns [Program ast;]:
definition* main EOF
       ;
main: 'def main('parameters?'):' '{'f_body'}'
;



definition: 'def' ID '(' parameters? '):' type? '{' f_body?'}' //no admite id de uno de longitud wtff
          | ID(',' ID)* ':' type ';'
          ;

parameters: ID ':' type (',' ID ':' type)*
          ;


f_body: definition* statement+
      ;

statement: 'print' 'f'?'('expression (','expression)*');'
         | 'print'  expression (','expression)* ';'
         | 'return' expression';'
         | 'input(' expression (','expression)*');'
         | 'while' expression ':' block
         | 'if'expression':'block ('else:'block)?
         | expression '=' expression ';'
         | ID '('expression? (','expression)*');'
         ;
block: statement
        | '{' statement* '}'
        ;

expression:// returns [Expression ast;]:
            expression OP=('*'|'/'|'%'|'+'|'-') expression
            //{new Arithmetic($exp1.ast.getLine(),$exp1.ast.getColumn(),$exp1.ast,$OP.text,$exp2.ast);}
          | expression ('<'|'<='|'>'|'>='|'!='|'==') expression
          | expression('&&'|'||')expression
          | '!' expression
          | expression'.'expression
          | '-' expression
          | expression '[' expression ']'
          //{$ast = new ArrayAccess()}
          | '('expression')'
          | '('type')' expression
          | INT_CONSTANT
          //{$ast = new IntLiteral($INT_CONSTANT.getLine(),$INT_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToInt($INT_CONSTANT.getText());}
          | REAL_CONSTANT
          //{$ast = new DoubleLiteral($REAL_CONSTANT.getLine(),$REAL_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToReal($REAL_CONSTANT.getText());}
          | CHAR_CONSTANT
          //{$ast = new CharLiteral($CHAR_CONSTANT.getLine(),$CHAR_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToChar($CHAR_CONSTANT.getText());}
          | ID //{$ast = new Variable($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text);}
          ;

type: 'int'
    | 'char'
    | 'double'
    | 'struct' '{' (ID':'type';')+ '}'
    | ('['INT_CONSTANT']')+type
    ;

fragment
DIGIT: [0-9]
     ;
fragment
SPECIAL_CHARACTER: [ \n\r\t]
      ;
fragment
LETTER: [A-Za-z]
;
TRASH: SPECIAL_CHARACTER -> skip
     ;

INT_CONSTANT: [1-9] DIGIT*
            | '0'
            ;


CHAR_CONSTANT: '\''.'\''
             | '\'' '\\' INT_CONSTANT'\''
             | '\'' '\\' [nt] '\''
             ;

REAL_CONSTANT: INT_CONSTANT? '.' INT_CONSTANT?
               | INT_CONSTANT? '.' INT_CONSTANT? [eE] ('-'|'+')?  INT_CONSTANT
               | INT_CONSTANT [eE] '-'?  INT_CONSTANT
               ;
fragment
ID_CHAR:LETTER|DIGIT|'_';
ID: (LETTER|'_') (ID_CHAR)*
  ;

COMMENT: ('#'.*?'\n'
       | '#'.*?EOF
       | '"""' .*? '"""'
       )-> skip;


