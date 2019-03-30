package com.company;

public abstract class Electronics extends Product {

    private String brand;

    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
