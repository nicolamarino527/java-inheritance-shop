import java.math.BigDecimal;

import org.lessons.java.inheritance.Headphones;
import org.lessons.java.inheritance.Product;

public class App {
    public static void main(String[] args) throws Exception {
        // product
        Product product = new Product("prodotto", "marca", new BigDecimal(11), new BigDecimal(0.22));

        System.out.println(product.getName());

        // headphones
        Headphones airpods = new Headphones("airpods", "apple", new BigDecimal(130), "white", true);

        System.out.println(airpods.getCode());
        System.out.println(airpods.getBrand());
        System.out.println(airpods.getName());
        System.out.println(airpods.getColor());
        System.out.println(airpods.getPrice());
        System.out.println(airpods.getTax());

    }
}
