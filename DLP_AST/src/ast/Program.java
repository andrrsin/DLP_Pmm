package ast;

import java.util.List;

public class Program implements ASTNode{
    private int line;
    private int col;
    public List<Definition> defs;
    public Program (int line, int col, List<Definition> defs){
        this.line = line;
        this.col = col;
        this.defs = defs;
    }
    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }

    public List<Definition> getDefs(){
        return this.defs;
    }
}
