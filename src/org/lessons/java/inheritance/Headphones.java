package org.lessons.java.inheritance;

import java.math.BigDecimal;

public class Headphones extends Product {
    private String color;
    private boolean isWireless;

    public Headphones(String name, String brand, BigDecimal price, String color, boolean isWireless) {
        super(name, brand, price);
        this.color = color;
        this.isWireless = isWireless;
    }

    // getter
    public String getColor() {
        return color;
    }

    public boolean isWireless() {
        return isWireless;
    }

    // setter
    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }
}
