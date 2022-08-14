package methodreferences;

public class P01_MethodReferenceExample {

    public static void saySomething(){
        System.out.println("Hello, this is a static method.");
    }
    public static void main(String[] args) {

        //referring static method
        Sayable sayable = P01_MethodReferenceExample::saySomething;

        //calling interface method
        sayable.say();
    }
}
