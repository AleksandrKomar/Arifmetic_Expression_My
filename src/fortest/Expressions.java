package fortest;

import java.util.StringJoiner;

public class Expressions {


    static Expression[] mExpressions;

    public static Variable var(String name, int value) {
        //implement this method
        return new Variable(name, value);
    }

    public static Expression val(int value) {
        //implement this method
        String m = String.valueOf(value);

        return var(m, value);


    }

    public static Expression sum(Expression... members) {
        //implement this method

//        members[0]

        int a = members[0].evaluate() + members[1].evaluate();

        String b1 = "(" + members[0].toExpressionString() + " + " + members[1].toExpressionString() + ")";

        return new Variable(b1, a);
//        return null;

    }

    public static Expression product(Expression... members) {
        //implement this method

        mExpressions = new Expression[members.length];



        String b1 = "(";

        int a = 1;

        for (int i = 0; i < members.length; i++) {

            mExpressions[i] = members[i];

             a *= members[i].evaluate();

             if (i == 0){
                 b1 = b1  + members[i].toExpressionString() ;
             }else {
                 b1 = b1 + " * " + members[i].toExpressionString() ;
             }

        }

        b1 += ")";

        return new Variable(b1, a);



//        return null;
    }

    public static Expression difference(Expression minuend, Expression subtrahend) {
        //implement this method

        int a = minuend.evaluate() - subtrahend.evaluate();

        String b1 = "(" + minuend.toExpressionString() + " - " + subtrahend.toExpressionString() + ")";

        return new Variable(b1, a);
    }

    public static Expression fraction(Expression dividend, Expression divisor) {
        //implement this method
        int a = dividend.evaluate() / divisor.evaluate();

        String b1 = "(" + dividend.toExpressionString() + " / " + divisor.toExpressionString() + ")";

        return new Variable(b1, a);

//        return null;
    }


}
