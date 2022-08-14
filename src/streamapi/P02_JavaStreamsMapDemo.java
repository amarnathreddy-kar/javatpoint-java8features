package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class P02_JavaStreamsMapDemo {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "bike", "flight", "train", "ship", "scooter");

        //(I.) convert all the strings to uppercase and store in another list

        //1. creating a new list
        List<String> vehiclesListUpperCase = new ArrayList<String>();
        //2 & 3  //using streams api - map
        vehiclesListUpperCase = vehicles.stream().map(e->e.toUpperCase()).toList();
        System.out.println(vehiclesListUpperCase);

        //printing directly to the console (without catching into another list)
        vehicles.stream().map(x->x.toUpperCase()).forEach(System.out::println);

        /*
        //without streams
        for(String name: vehicles){
            vehiclesListUpperCase.add(name.toUpperCase());
        }
        System.out.println(vehiclesListUpperCase);

         */

        //II. find length/size of each string element of 'vehicles' list

        //before java 8/ without streams api
        for(String names: vehicles){
            System.out.print(names.length()+" ");
        }
        System.out.println();
        System.out.println("Usings maps of Streams api: ");

        //with maps of streams api
        vehicles.stream().map(l -> l.length()).forEach(l -> System.out.print(l+" "));

        //III. Read each value and multiply it by 3
        List<Integer> numbersList = Arrays.asList(2,3,6,5,89,83,25,90);

        System.out.println();
        System.out.println("Read each value and multiply it by 3: ");
        numbersList.stream().mapToInt(m->m*3).forEach(System.out::println);

        /*
        List<Integer> resultList = new ArrayList<>();
        //without streams
        for(int num: numbersList){
            resultList.add(num*3);
            }
        System.out.println(resultList);
        */

        //IV. Using Filter and Map to the same stream
        //1. create an Employee Class

        List<Employee> empList = Arrays.asList(
                new Employee(101, "Alex", 10000),
                new Employee(102, "Bryan", 100000),
                new Employee(103, "Charles", 90000),
                new Employee(104, "Darwin", 8000),
                new Employee(105, "Edward", 77000),
                new Employee(106, "Finch", 1000)
        );
        //System.out.println(empList);

        //Collections -> Stream --> Filter (predicate: filter based of true/false) --> Map (appy operations for each element) --> Collect

        //to print salaries of all employees where salary > 20000. Combine filter and map
        List<Employee> filteredList = empList.stream().filter(e->e.getSalary()>20000).collect(Collectors.toList());
        System.out.println(filteredList);//without map this will print the employee object data

        //if only salaries are to be printed
        System.out.print("Printing only Salaries from Employee Stream: ");
        empList.stream().filter(e->e.getSalary()>20000).mapToInt(e->e.getSalary()).forEach(e-> System.out.print(+e+" "));
    }

}
