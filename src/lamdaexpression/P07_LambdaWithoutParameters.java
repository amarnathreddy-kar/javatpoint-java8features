package lamdaexpression;

interface Sayable {
    public String say();
}

public class P07_LambdaWithoutParameters {

    public static void main(String[] args) {
        //use of lambda in place of anonymous class
        Sayable s = () -> {
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }
}
