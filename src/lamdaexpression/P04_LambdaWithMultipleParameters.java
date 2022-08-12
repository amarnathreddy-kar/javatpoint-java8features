package lamdaexpression;

interface Addable{
    public int add(int a, int b);
}

public class P04_LambdaWithMultipleParameters {
    public static void main(String[] args) {

        //Multiple parameters in lambda expression
        Addable ad1 = (x,y) ->(x+y);
        System.out.println(ad1.add(10,20));

        //Multiple parameters with data type in lambda expressions
        Addable ad2 = (int l, int m) ->  {return (l + m);};
        System.out.println(ad2.add(100,200));

    }
}
