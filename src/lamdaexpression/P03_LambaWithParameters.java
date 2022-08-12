package lamdaexpression;

import javax.crypto.spec.PSource;
import javax.xml.namespace.QName;

interface SayableWithParameter{
    public String say(String name);
}
public class P03_LambaWithParameters {
    public static void main(String[] args) {
        //Lambda expression with single parameter
        SayableWithParameter s1 = (name) -> {return "Hello, "+name+"! ";};
        System.out.println(s1.say("Amarnath"));

        //above experssion can be further simplified like:
        SayableWithParameter s2 = n -> {return "Hello! "+n;};
        System.out.println(s2.say("Keethan."));
    }


}
