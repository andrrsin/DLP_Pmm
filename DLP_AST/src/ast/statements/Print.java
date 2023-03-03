package ast.statements;

public class Print implements Statement{
    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
