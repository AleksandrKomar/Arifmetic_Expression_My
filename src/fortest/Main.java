package fortest;

import static fortest.Expressions.*;

public class Main {

    public static void main(String[] args) {

        {

            Expression prod;

            prod = product(var("a", 7), val(9));

            System.out.println(prod.toExpressionString());//"(a * 9)"
            System.out.println(prod.evaluate());//63

            prod = product(var("a", -7), val(-2), var("alpha", 789));

            System.out.println(prod.toExpressionString());//(a * (-2) * alpha)
            System.out.println(prod.evaluate());//11046

            prod = product(val(1), val(2), val(3), val(4), val(5), val(6));

            System.out.println(prod.toExpressionString());//"(1 * 2 * 3 * 4 * 5 * 6)"
            System.out.println(prod.evaluate());//720

            Variable x1 = var("x1", 7);
            Variable x2 = var("x2", 7);
            Variable x3 = var("x3", 7);
            prod = product(x1, x2, x3);

            System.out.println(prod.toExpressionString());//(x1 * x2 * x3)
            System.out.println(prod.evaluate());//343

            x1.setValue(159);
            x2.setValue(753);
            x3.setValue(-1000);

            System.out.println(prod.toExpressionString());//(x1 * x2 * x3)
            System.out.println(prod.evaluate());//-119_727_000

        }




//        {
//            Expression expression =
//                    fraction(
//                            val(999_999),
//                            fraction(
//                                    val(81),
//                                    fraction(
//                                            val(27),
//                                            fraction(
//                                                    val(9),
//                                                    val(3)
//                                            )
//                                    )
//                            )
//                    );
//
//            System.out.println(expression.toExpressionString());//"(999999 / (81 / (27 / (9 / 3))))"
//            System.out.println(expression.evaluate());//111_111
//
//        }


//        {
//            Expression expression =
//                    product(
//                            val(1),
//                            product(
//                                    val(2),
//                                    product(
//                                            val(3),
//                                            product(
//                                                    val(4),
//                                                    val(5)
//                                            )
//                                    )
//                            )
//                    );
//
//            System.out.println(expression.toExpressionString());//"(1 * (2 * (3 * (4 * 5))))"
//            System.out.println(expression.evaluate());//120
//        }

//        {
//            Expression expression =
//                    sum(
//                            val(1),
//                            sum(
//                                    val(2),
//                                    sum(
//                                            val(3),
//                                            sum(
//                                                    val(4),
//                                                    val(5)
//                                            )
//                                    )
//                            )
//                    );
//
//            System.out.println(expression.toExpressionString());//(1 + (2 + (3 + (4 + 5))))
//            System.out.println(expression.evaluate());//15
//        }

//        {
//
//            Expression expression =
//                    difference(
//                            val(999_999),
//                            difference(
//                                    val(81),
//                                    difference(
//                                            val(27),
//                                            difference(
//                                                    val(9),
//                                                    val(3)
//                                            )
//                                    )
//                            )
//                    );
//
//            System.out.println(expression.toExpressionString());//(999999 - (81 - (27 - (9 - 3))))
//            System.out.println( expression.evaluate());//999_939
//
//        }

//        {
//
//            Expression val;
//
//            val = val(789);
//
//            System.out.println(val.evaluate());//789
//            System.out.println(val.toExpressionString());//789
//
//            val = val(-951);
//
//            System.out.println(val.evaluate());//-951
//            System.out.println(val.toExpressionString());//-951
//
//        }

    }

}
