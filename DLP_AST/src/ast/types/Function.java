package ast.types;

import ast.ASTNode;

public class Function implements ASTNode {
    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
