package lamdaexpression;

public class P02_LambdaExpression {
    public static void main(String[] args) {
        int width = 10;
       Drawable d2 = () -> System.out.println("Drawing for a width of "+width);
       d2.draw();

    }
}
