package com.company;

public class FormalShoe extends Shoes {
    FormalShoe(int id, String type, double price){
        super(id,type,price);
    }
    @Override
    public void display() {
        System.out.println(getId()+". "+ getType()+"\t"+getBrand()+"\t$"+getPrice());
    }
}
