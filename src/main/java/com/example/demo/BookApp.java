package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {

        boolean stop = false;
        String answer = "";
        Book b = new Book();

        Scanner keyboard = new Scanner(System.in);

        ArrayList<Book> titles = new ArrayList<Book>();

        System.out.println("Enter in details about your book: ");

        do{

                System.out.println("Enter title of the Book: ");
                b.setTitle(keyboard.nextLine());
                System.out.println("Enter in author: ");
                b.setAuthor(keyboard.nextLine());
                System.out.println("Enter in description: ");
                b.setDescription(keyboard.nextLine());
                System.out.println("Enter in price of the book: ");
                b.setPrice(keyboard.nextLine());
                System.out.println("Is the item in stock?");

                if (keyboard.nextLine().equalsIgnoreCase("Y")) {
                    b.setInStock(true);
                }else {

                    b.setInStock(false);

                }

                titles.add(b);

                System.out.println("Would you like to to add more books to your cart?: ");
                answer = keyboard.nextLine();
                if (answer.equalsIgnoreCase("no"))
                    stop = true;
        }while(!stop);


        System.out.println("Congratulations the books you have entered are in stock!!: ");
        System.out.println("*****************************************************************");
        System.out.println("BOOK INFORMATION");
        System.out.println("*****************************************************************");

        for(Book eachTitle : titles)
        {
            System.out.println("Book title: " + eachTitle.getTitle());
            System.out.println("Author: "+ eachTitle.getAuthor());
            System.out.println("Description: "+eachTitle.getDescription());
            System.out.println("Price of the book: "+eachTitle.getPrice());
            System.out.println("Stock: " +eachTitle.isInStock());
        }


    }
}
