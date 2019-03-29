package com.company;

public class Book extends Notes{
    private String Wtiter;
    Book(String name,double price,String wtiter){
        super(name,price);
        this.Wtiter=wtiter;
    }

    public String getWtiter() {
        return Wtiter;
    }
}
