package com.company;

public class TV extends Electronics {
    TV(int id,String type, double price){
        super(id,type,price);
    }
    @Override
    public void display() {
        System.out.println(getId()+". "+ getType()+"\t"+getBrand()+"\t"+"\t$"+getPrice());
    }
}
