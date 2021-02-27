grammar kangaroo;

start : task+;
task : function;
function : IDENTIFIER '<-' 'function' '(' parameter ')' '{' action* '}';
parameter : value (',' value)*;
value: IDENTIFIER | NUMBER;
action : result | operate | call | loop | assignment;
call : IDENTIFIER ('.' IDENTIFIER)? '(' parameter ')';
loop : 'while' '(' compare ')' '{' action* '}';
result : 'return(' action ')';
operate : (IDENTIFIER | NUMBER) ('+'|'-'|'*'|'/') (IDENTIFIER | NUMBER);
compare : value ('=='|'!=') value;
assignment: IDENTIFIER '<-' operate;

IDENTIFIER : [A-Za-z]+;
NUMBER: [0-9]+;
WS : [ \t\r\n]+ -> skip;