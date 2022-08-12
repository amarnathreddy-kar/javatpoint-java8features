package lamdaexpression;

import java.util.ArrayList;
import java.util.List;

public class P05_LambdaForEachLoop {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Amarnath");
        list.add("Mamatha");
        list.add("Keethan");
        list.add("Nuthan");

        list.forEach(n -> System.out.println(n));

    }
}
