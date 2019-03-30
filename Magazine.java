package com.company;

public class Magazine extends Notes {
    private String provider;
    Magazine(int id,String type,double price){
        super(id,type,price);

    }

    public void setProvidor(String providor) {

    }

    public String getProvider() {
        return provider;
    }
    @Override
    public void display() {
        System.out.println(getId()+". "+ getType()+"\t"+ getProvider()+"\t$"+getPrice());
    }
}
