package org.lessons.java.inheritance;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Product[] productsList = new Product[1];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < productsList.length; i++) {
            System.out.println("Product name: ");
            String productName = scan.nextLine();

            System.out.println("Product brand: ");
            String productBrand = scan.nextLine();

            System.out.println("Product base price: ");
            int productPrice = Integer.parseInt(scan.nextLine());

            System.out.println("Insert product category: (tv, smartphone, headphones)");
            String productCategory = scan.nextLine();

            switch (productCategory.toLowerCase()) {
                case "tv":

                    System.out.println("Is a smart tv? (type: true/false ):");
                    boolean isSmartTv = Boolean.parseBoolean(scan.nextLine());

                    System.out.println("Inches: ");
                    int productInches = scan.nextInt();

                    Television tv = new Television(productName, productBrand, new BigDecimal(productPrice), isSmartTv,
                            productInches);
                    productsList[i] = tv;

                    break;

                case "headphones":
                    System.out.println("Color: ");
                    String productColor = scan.nextLine();

                    System.out.println("is wireless?: (type: true/false )");
                    Boolean isProductWireless = Boolean.parseBoolean(scan.nextLine());

                    Headphones headphones = new Headphones(productName, productBrand, new BigDecimal(productPrice),
                            productColor, isProductWireless);
                    productsList[i] = headphones;

                    break;

                case "smartphone":
                    System.out.println("memory in gb: ");
                    int memory = scan.nextInt();

                    System.out.println("imei code: ");
                    String imeiCode = scan.nextLine();

                    Smartphone smartphone = new Smartphone(productName, productBrand, new BigDecimal(productPrice),
                            imeiCode, memory);

                    productsList[i] = smartphone;

                    break;

                case "default":
                    System.out.println("Invalid category. Try again.");
                    i--;

                    break;
            }

            System.out.println("Your cart: ");
            for (int k = 0; k < productsList.length; k++) {
                System.out.println(productsList[k]);
            }

        }

        scan.close();

    }
}
