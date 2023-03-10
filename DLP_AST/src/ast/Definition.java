package ast;

import ast.types.Type;

public interface Definition extends ASTNode{
    public Type getType();
    public String getName();
}
