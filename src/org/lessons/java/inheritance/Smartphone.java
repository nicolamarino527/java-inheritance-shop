package org.lessons.java.inheritance;

import java.math.BigDecimal;

public class Smartphone extends Product {
    private String imeiCode;
    private int memoryCapacity;

    public Smartphone(String name, String brand, BigDecimal price, String imeiCode, int memoryCapacity) {
        super(name, brand, price);
        this.imeiCode = imeiCode;
        this.memoryCapacity = memoryCapacity;
    }

    // getter
    public String getImei() {
        return this.imeiCode;
    }

    public int getMemory() {
        return this.memoryCapacity;
    }

    // setter
    public void setimei(String newImei) {
        this.imeiCode = newImei;
    }

    public void setMemory(int newMemory) {
        this.memoryCapacity = newMemory;
    }

}
