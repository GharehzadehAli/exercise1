package com.company;

public class Sneakers extends Shoes {
    Sneakers(int id, String type, double price){
        super(id,type,price);
    }

    @Override
    public void display() {
        System.out.println(getId()+". "+ getType()+"\t"+getBrand()+"\t$"+getPrice());
    }
}
