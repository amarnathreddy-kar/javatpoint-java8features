package streamapi;

import java.util.stream.Stream;

public class P01_JavaStreamsIterating {
    public static void main(String[] args) {
        Stream.iterate(1,e-> e+1).filter(e->e%5==0).limit(10).forEach(System.out::println);
    }
}
