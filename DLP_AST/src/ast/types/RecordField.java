package ast.types;

public class RecordField implements Type{
    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
    private String name;
}
