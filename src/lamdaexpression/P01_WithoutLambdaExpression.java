package lamdaexpression;

 public class P01_WithoutLambdaExpression {
    public static void main(String[] args) {
        int width = 10;

//without lambda, Drawable implementation using anonymous class
    Drawable d = new Drawable() {
        @Override
        public void draw() {
            System.out.println("Drawing when width is (using an anonymous inner class): "+width);
        }
    };
    d.draw();
    }
    //Note: This code can be very consise (one step) using lambda expression
}
