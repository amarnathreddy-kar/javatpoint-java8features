package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P03_JavaStreamsFlatMapDemo {
    public static void main(String[] args) {
        //map demo
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 56, 7);
        List<Integer> list2 = list1.stream().map(n -> n + 10).collect(Collectors.toList());
        System.out.println(list2); //[11, 12, 13, 14, 66, 17] //add +10 for each of the list
        //list1.stream().map(n->n+20).forEach(System.out::println);

        //flat map demo
        List<Integer> listOne = Arrays.asList(1, 2);
        List<Integer> listTwo = Arrays.asList(3, 4);
        List<Integer> listThree = Arrays.asList(5, 6);

        List<List<Integer>> finalList = Arrays.asList(listOne, listTwo, listThree);
        System.out.println(finalList);

        List<Integer> finalResults = finalList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(finalResults);

        System.out.println("Applying Flat Map to multiple List of Items: ");
        finalList.stream().flatMap(x -> x.stream().map(n -> n + 20)).forEach(o -> System.out.print(o + " "));
        System.out.println();

        //#Flat Map Demo 2
        System.out.println("---------------Flat Map Demo for String List of List------------");
        List<String> TeamA = Arrays.asList("Scott", "Darwin", "Jhonny");
        List<String> TeamB = Arrays.asList("Maria", "Luna", "Tommy");
        List<String> TeamC = Arrays.asList("Keeth", "Norton", "Jodie");

        List<List<String>> playersOfWorldCup = new ArrayList<>();
        playersOfWorldCup.add(TeamA);
        playersOfWorldCup.add(TeamB);
        playersOfWorldCup.add(TeamC);
        System.out.println(playersOfWorldCup);

        /*
        //before java 8
        for(List<String> team : playersOfWorldCup){
            for (String name: team){
                System.out.println(name);
            }
        }

         */

        //using streams flatMap()
        System.out.println("using streams flatMap(): ");
        List<String> names = playersOfWorldCup.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());
        System.out.println(names);

        //II. FlatMap Demo 2
        List<Student> studentList1 = new ArrayList<Student>();
        studentList1.add(new Student("Smith", 101, 'A'));
        studentList1.add(new Student("John", 102, 'C'));
        studentList1.add(new Student("Kennedy", 103, 'B'));

        List<Student> studentList2 = new ArrayList<Student>();
        studentList1.add(new Student("Scott", 106, 'A'));
        studentList1.add(new Student("Tiger", 104, 'B'));
        studentList1.add(new Student("Kitty", 105, 'C'));

//        List<List<Student>> studentsList = new ArrayList<>();
//        studentsList.add(studentList1);
//        studentsList.add(studentList2);
//        System.out.println(studentsList);

        List<List<Student>> studentsListAsArray = Arrays.asList(studentList1,studentList2);
        System.out.println(studentsListAsArray);

        //before java 8
//        for(List<Student> s: studentsListAsArray){
//            for(Student st:s){
//                System.out.println(st.getsName());
//            }
//        }

        //using streams of flatMap()
        List<String> finalNames = studentsListAsArray.stream().flatMap(s->s.stream()).map(s->s.getsName()).collect(Collectors.toList());
        System.out.println(finalNames);

    }

}
