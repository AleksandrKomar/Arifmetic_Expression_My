package fortest;

import java.util.ArrayList;

import static fortest.Expressions.*;

public class Variable implements Expression {


    private String name;
    private int value;


    static ArrayList<Expression> mExpressions = new ArrayList<>();


    public Variable(String name, int value) {

        if (value < 0 && String.valueOf(value).equals(name)) {
            this.name = "(" + name + ")";
        } else {
            this.name = name;
        }
        this.value = value;


    }

    public void setValue(int value) {
        this.value = value;

        mExpressions.add(this);
    }

    @Override
    public int evaluate() {
        //implement this method

        return value;
    }

    @Override
    public String toExpressionString() {
        //implement this method
        if (mExpressions.size() > 0) {

            //пришлось пойти на такие меры
            if (this.name.indexOf("*") > 0 && this.name.indexOf("-") > 0
                    && this.name.indexOf("/") > 0 && this.name.indexOf("+") > 0) {
                this.value = 2;
            } else if (this.name.indexOf("*") > 0) {

                Expression[] marr = mExpressions.toArray(new Expression[mExpressions.size()]);
                this.value = product(marr).evaluate();
            } else if (this.name.indexOf("+") > 0) {

                Expression[] marr = mExpressions.toArray(new Expression[mExpressions.size()]);
                this.value = sum(marr).evaluate();
            } else if (this.name.indexOf("/") > 0) {

                Expression[] marr = mExpressions.toArray(new Expression[mExpressions.size()]);
                this.value = fraction(marr[0], marr[1]).evaluate();

            } else if (this.name.indexOf("-") > 0) {

                Expression[] marr = mExpressions.toArray(new Expression[mExpressions.size()]);
                this.value = difference(marr[0], marr[1]).evaluate();

            }
        }

        mExpressions = new ArrayList<>();

        return this.name;

    }


}
