grammar FunctionTokenizer;
    
parse     : function* EOF;
function  : ID '(' expr_list? ')';
expr_list : expr (',' expr)*;
expr      : function | STRING | NUMBER | ID;
    
STRING    : '"' ~'"'* '"';
NUMBER    : [0-9]+ ('.' [0-9]+)?;
ID        : [a-zA-Z_] [a-zA-Z_0-9]*;
SPACES    : [ \t\r\n]+ -> skip;