package com.company;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Product[] basket = {null, null, null, null, null};
        Book book1 = new Book(1, "book", 2.99);
        book1.setWriter("Mr1");
        book1.setGenre("genre1");
        Book book2 = new Book(2, "book", 4.9);
        book2.setWriter("Mr2");
        book2.setGenre("genre2");
        Magazine magazine1 = new Magazine(3, "Magazine", 4);
        magazine1.setProvider("provider1");
        Magazine magazine2 = new Magazine(4, "Magazine", 3.5);
        magazine2.setProvider("provider2");
        TV tv1 = new TV(5, "TV", 400);
        tv1.setBrand("brand1");
        TV tv2 = new TV(6, "TV", 450);
        tv2.setBrand("brand2");
        Radio radio1 = new Radio(7, "Radio", 100);
        radio1.setBrand("brand1");
        Radio radio2 = new Radio(8, "Radio", 99);
        radio2.setBrand("brand2");
        Sneakers sneakers1 = new Sneakers(9, "Sneakers", 150);
        sneakers1.setBrand("Nike");
        Sneakers sneakers2 = new Sneakers(10, "Sneakers", 246);
        sneakers2.setBrand("Adidas");
        FormalShoe formalShoe1 = new FormalShoe(11, "Formalshoe", 40);
        formalShoe1.setBrand("Melli");
        FormalShoe formalShoe2 = new FormalShoe(12, "Formalshoe", 49);
        formalShoe2.setBrand("Tabriz");
        Product[] products = {book1, book2, magazine1, magazine2, tv1, tv2, radio1, radio2, sneakers1, sneakers2, formalShoe1, formalShoe2};
        enroll();
        int i = 0;


        while (i < 5) {
            System.out.println("choose what you intend to do");
            System.out.println("1.have a look in my purchase basket.");
            System.out.println("2.buy sth");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 1) {

                System.out.println("goods in your basket");
                double totalPrice=0;
                for (Product b : basket) {
                    if (b != null) {
                        b.display();
                        totalPrice+=b.getPrice();
                    }

                }
                System.out.println("total price $"+totalPrice);
                System.out.println("\n");
                System.out.println("1.I wanna delete");
                System.out.println("2.I dont wanna delete");

                if(scanner.nextInt()==1){
                    System.out.println("enter the number");
                   int j= scanner.nextInt();
                   outer:for (int k=0;k<12;k++){
                       if(products[k]==null){
                           products[k]=basket[j-1];
                           products[k].setId(k+1);
                          break outer;
                       }
                   }
                   basket[j-1]=null;
                }
            } else {
                for (Product product : products) {
                    if (product != null) {
                        product.display();
                    }
                }
                System.out.println("you can buy with entering a number");
                int id = scanner.nextInt();
                System.out.print("you sure you wanna buy ");
                products[id - 1].display();
                System.out.println("1.Yes\t2.No");
                if (scanner.nextInt() == 1) {

                    basket[i] = products[id - 1];
                    basket[i].setId(i+1);
                    i++;
                    products[id - 1] = null;
                }

            }
        }
    }

    public static void enroll() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.println("Please enter your username:");
        user.setUser(scanner.next());
        System.out.println("Please enter your password:");
        user.setPass(scanner.next());
        System.out.println("Please enter your firstName:");
        user.setFirsName(scanner.next());
        System.out.println("Please enter your lastName:");
        user.setLastName(scanner.next());
        System.out.println("Please enter your phoneNumber:");
        user.setPhoneNumber(scanner.next());
        System.out.println("Please enter your email:");
        user.setEmail(scanner.next());
        System.out.println("Please enter your address:");
        user.setAddress(scanner.next());

    }

}

