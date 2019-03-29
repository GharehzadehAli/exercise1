package com.company;

public abstract class Notes {
    private String name;
    private double price;
    Notes (String name,double price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
