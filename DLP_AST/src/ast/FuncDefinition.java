package ast;

import ast.statements.Statement;
import ast.types.FunctionType;
import ast.types.Type;

import java.util.List;

public class FuncDefinition implements Definition{
    private FunctionType fType;
    private  int line;
    private int col;
    public String name;
    public List<Statement> fbody;
    public FuncDefinition(int line, int col, String name, FunctionType fType, List<Statement> fbody){
        this.line = line;
        this.col = col;
        this.name = name;
        this.fType = fType;
        this.fbody = fbody;
    }
    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return col;
    }
    public List<Statement> getBody(){
        return fbody;
    }
    @Override
    public Type getType() {
        return fType;
    }

    @Override
    public String getName() {
        return name;
    }
}
