package lamdaexpression;

import java.util.ArrayList;
import java.util.List;

public class P09_LambdaFilterCollectionDataExample {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1,"Samsung A5",17000f));
        list.add(new Product(3,"Iphone 6S",65000f));
        list.add(new Product(2,"Sony Xperia",25000f));
        list.add(new Product(4,"Nokia Lumia",15000f));
        list.add(new Product(5,"Redmi4 ",26000f));
        list.add(new Product(6,"Lenevo Vibe",19000f));

        //to print a list of products
        System.out.println("Without data filtering: ");
        for(Product p : list){
            System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
        }

        //using lambda to filter data
        System.out.println("Condition filtering - to print when price >= 25000");
        list.stream().filter(p->p.getPrice()>=25000).forEach(a-> System.out.println(a.getId()+" "+a.getPrice()+" "+a.getName()));
    }


}
