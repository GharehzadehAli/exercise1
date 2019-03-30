package com.company;

public class Radio extends Electronics {
    Radio(int id,String type, double price){
        super(id,type,price);
    }
    @Override
    public void display() {
        System.out.println(getId()+". "+ getType()+"\t"+getBrand()+"\t$"+getPrice());
    }
}
