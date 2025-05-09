package org.lessons.java.inheritance;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    private int code;
    private String name;
    private String brand;
    private BigDecimal price;
    private BigDecimal iva;

    // constructor

    public Product(String name, String brand, BigDecimal price) {
        Random randomNumber = new Random();
        this.code = randomNumber.nextInt(99999);
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = new BigDecimal(0.22);
    }

    public Product(String name, String brand, BigDecimal price, BigDecimal iva) {
        Random randomNumber = new Random();
        this.code = randomNumber.nextInt(99999);
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = new BigDecimal(0.22);
    }

    // getter
    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }

    public BigDecimal getPrice() {
        return this.price.setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal getTax() {
        return this.iva.setScale(2, RoundingMode.DOWN);
    }

    // setter
    public void setName(String newName) {
        this.name = newName;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setPrice(BigDecimal newPrice) {
        this.price = newPrice;
    }

    public void setTax(BigDecimal newIva) {
        this.iva = newIva;
    }

    @Override
    public String toString() {
        return String.format("-----product info----- \ncode: %d  \nname: %s \nbrand: %s \nprice: %s$  \ntax: %s", code,
                this.name, this.brand,
                this.price.setScale(2, RoundingMode.DOWN), this.iva.setScale(2, RoundingMode.DOWN));
    }

}
