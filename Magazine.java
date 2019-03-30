package com.company;

public class Magazine extends Notes {
    private String provider;

    Magazine(int id, String type, double price) {
        super(id, type, price);

    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProvider() {
        return provider;
    }

    @Override
    public void display() {
        System.out.println(getId() + ". " + getType() + "\t" + getProvider() + "\t$" + getPrice());
    }
}
