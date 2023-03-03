package ast.expressions;

public class FieldVisitor implements Expression{
    private String fieldName;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
