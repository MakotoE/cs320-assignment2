grammar kangaroo;

start : task+;
task : function;
function : IDENTIFIER '<-' 'function' '(' parameter ')' '{' action* '}';
parameter : IDENTIFIER (',' IDENTIFIER)*;
action : result | operate | call | loop | assignment;
call : IDENTIFIER '(' parameter ')';
loop : 'while' '(' compare ')' '{' action* '}';
result : 'return(' action ')';
operate : IDENTIFIER ('+'|'-'|'*'|'/') IDENTIFIER;
compare : IDENTIFIER ('=='|'!=') IDENTIFIER;
assignment: IDENTIFIER '<-' operate;

IDENTIFIER : ~[ \t\r\n(){},!=]+;
WS : [ \t\r\n]+ -> skip;