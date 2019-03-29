package com.company;

public class Magazine extends Notes {
    private String providor;
    Magazine(String name,double price,String providor){
        super(name,price);
        this.providor=providor;
    }

    public String getProvidor() {
        return providor;
    }
}
