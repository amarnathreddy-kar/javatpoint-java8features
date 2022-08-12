package lamdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class P08_LambdaComparatorExample {

    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<Product>();

        //adding new products to the list
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(3, "Logitech Keyboard", 300f));
        productsList.add(new Product(2, "Dell Mouse", 150f));

        System.out.println("Before Sorting: ");
        Iterator itr = productsList.listIterator();
        while(itr.hasNext()){
            Product product = (Product) itr.next();
            System.out.println(product.getId()+" "+product.getPrice()+" "+product.getName());
        }

        //with streams
        System.out.println("With Streams: ");
        productsList.stream().forEach(a -> System.out.println(a.getId()+" "+a.getName()+" "+a.getPrice()));

        System.out.println("Sorting on the basis of product name (Java Comparator as Lambda Expression): ");
        Collections.sort(productsList,(p1, p2) -> {
            return p1.getName().compareTo(p2.getName());
        } );

        for(Product p: productsList){
            System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
        }
    }
}
