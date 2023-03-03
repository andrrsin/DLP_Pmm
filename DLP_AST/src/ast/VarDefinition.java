package ast;


import ast.types.Type;

public class VarDefinition implements Definition {
    private int offset;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }

    @Override
    public Type getType() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
