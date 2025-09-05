package compositestratery;

public class TestExpressions {
    public static void main(String[] args) {
        /* TODO */
        /* Viết code đề mô tính biểu thức (1 + 2) * 3 - 4 */
        Evaluable one = new Operand(1);
        Evaluable two = new Operand(2);
        Evaluable three = new Operand(3);
        Evaluable four = new Operand(4);

        Operator addition = new AdditionOperator();
        Operator multiplication = new MultiplicationOperator();
        Operator subtraction = new SubtractionOperator();

        Evaluable expression = new Expression(
                new Expression(one, two, addition),
                three,
                multiplication);
        expression = new Expression(expression, four, subtraction);

        double result = expression.evaluate();
        System.out.println("The result is: ");
        System.out.println("(1 + 2) * 3 - 4 = "  + result);
    }
}
