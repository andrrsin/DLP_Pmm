package ast.expressions;

public class UnaryMinus implements Expression{
    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
