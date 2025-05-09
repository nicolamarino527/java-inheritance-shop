import java.math.BigDecimal;

import org.lessons.java.inheritance.Headphones;
import org.lessons.java.inheritance.Product;
import org.lessons.java.inheritance.Smartphone;
import org.lessons.java.inheritance.Television;

public class App {
    public static void main(String[] args) throws Exception {
        // product
        Product product = new Product("prodotto", "marca", new BigDecimal(11), new BigDecimal(0.22));

        // System.out.println(product.toString());

        // headphones
        Headphones airpods = new Headphones("airpods", "apple", new BigDecimal(130), "white", true);
        System.out.println(airpods.toString());

        // System.out.println(airpods.getCode());
        // System.out.println(airpods.getBrand());
        // System.out.println(airpods.getName());
        // System.out.println(airpods.getColor());
        // System.out.println(airpods.getPrice());
        // System.out.println(airpods.getTax());

        // tv
        Television lumixLg = new Television("lumixlg", "lg", new BigDecimal(559), true, 50);
        System.out.println(lumixLg.toString());

        Smartphone iphone17 = new Smartphone("iphone17", "apple", new BigDecimal(998), "KSAI987675659", 500);
        System.out.println(iphone17.toString());
    }
}
