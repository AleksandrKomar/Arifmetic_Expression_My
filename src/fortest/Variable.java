package fortest;

public class Variable implements Expression{


    private String name;
    private int value;

    public Variable(String name, int value) {

        if (value < 0 && String.valueOf(value).equals(name)){
            this.name = "(" + name + ")";
        }else{
            this.name = name;
        }
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        //implement this method
        return value;
    }

    @Override
    public String toExpressionString() {
        //implement this method
        return this.name;
    }


}
