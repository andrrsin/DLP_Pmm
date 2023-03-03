package ast.expressions;

public class ArrayIndexer implements Expression{
    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
