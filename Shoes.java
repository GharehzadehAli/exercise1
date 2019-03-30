package com.company;

public abstract class Shoes extends Product {
    private String brand;


    Shoes(int id, String name, double price) {
        super(id,name,price);
    }

    public String getBrand() {
        return brand;
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }


}
