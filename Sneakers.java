package com.company;

public class Sneakers extends Shoes {
    Sneakers(int id, String name, double price){
        super(id,name,price);
    }

    @Override
    public void display() {
        System.out.println(getId()+". "+ getType()+"\t"+getBrand()+"\t$"+getPrice());
    }
}
