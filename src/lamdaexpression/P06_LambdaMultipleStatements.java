package lamdaexpression;

interface SayableMsg{
    String say(String message);
}
public class P06_LambdaMultipleStatements {
    public static void main(String[] args) {

        //you can pass multiple statements in lambda expression
        SayableMsg person = (msg) -> {
            String str1 = "I would like to say, ";
            String str2 = str1 + msg;
            return str2;
        };

        System.out.println(person.say("time is precious. "));
    }
}
