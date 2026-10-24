package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking The name for the order
        System.out.println("May I have a name for the order?");
        String name = scanner.nextLine();

        //Asking for the size
        double regularPrice = 5.45;
        double largePrice = 8.95;
        System.out.println("""
                Which Size you want: 
                1, Regular: base price $5.45
                2, Large: base price $8.95
                Choose 1 or 2""");
        int size = scanner.nextInt();

        double price = 0;
        if (size == 1) {
            price = regularPrice;
        } else if (size == 2) {
            price = largePrice;
        } else
            System.out.println("Sorry, invalid size!");

        // Asking for the Age
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        if (age <= 17){
            price = price - (price * 0.10);
        } else if (age >= 65){
            price = price - (price * 0.20);
        }

        System.out.printf("%s Your sandwich total is $%.2f%n",name, price);



    }
}
