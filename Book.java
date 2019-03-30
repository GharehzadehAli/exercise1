package com.company;

public class Book extends Notes{
    private String Writer;
    private String genre;
    Book(int id,String type,double price){
        super(id,type,price);

    }
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setWriter(String writer) {
        Writer = writer;
    }

    public String getWriter() {
        return Writer;
    }
    @Override
    public void display() {
        System.out.println(getId()+". "+ getType()+"\t"+getGenre()+"\t"+getWriter()+"\t$"+getPrice());
    }

}
