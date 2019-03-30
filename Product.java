package com.company;

public abstract class Product {
    private int id;
    private double price;
    private String type;
    Product(int id,String type, double price){
        this.id=id;
        this.type = type;
        this.price = price;
    }
    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    abstract public void display();
}
