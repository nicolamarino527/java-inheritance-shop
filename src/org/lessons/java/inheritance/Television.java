package org.lessons.java.inheritance;

import java.math.BigDecimal;

public class Television extends Product {
    private boolean isSmart;
    private int inches;

    public Television(String name, String brand, BigDecimal price, boolean isSmart, int inches) {
        super(name, brand, price);
        this.isSmart = isSmart;
        this.inches = inches;
    }

    // getter
    public boolean isSmart() {
        return this.isSmart;
    }

    public int getInches() {
        return this.inches;
    }

    // setter
    public void setNotSmart(boolean notSmart) {
        this.isSmart = notSmart;
    }

    public void setInches(int newInches) {
        this.inches = newInches;
    }
}
