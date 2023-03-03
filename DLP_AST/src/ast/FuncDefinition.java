package ast;

import ast.types.Type;

public class FuncDefinition implements Definition{
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
