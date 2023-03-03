package ast.expressions;

public class Arithmetic implements Expression{
    public Arithmetic (Expression exp1,Expression exp2,int line, int col){

    }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
