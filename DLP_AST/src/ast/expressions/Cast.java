package ast.expressions;

import ast.types.Type;

public class Cast implements Expression {

    private Type cast;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
