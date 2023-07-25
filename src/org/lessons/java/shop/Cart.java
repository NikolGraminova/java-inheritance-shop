package org.lessons.java.shop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Product> productsArray = new ArrayList<>();


        // PROGRAM
        System.out.println("*** Welcome to java shop v2 ***");
        boolean quit = false;
        while (!quit){
            System.out.println("Choose a product: 1-Smartphone 2-Television 3-Headphones 4-Quit");
            String choice = scan.nextLine();
            switch (choice){

                case "1":
                    System.out.println("You chose Smartphone, please enter the details.");
                    int code = random.nextInt();
                    System.out.print("Enter name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter description: ");
                    String description = scan.nextLine();
                    System.out.print("Enter price: ");
                    double price = Double.parseDouble(scan.nextLine());
                    System.out.print("Enter vat: ");
                    int vat = Integer.parseInt(scan.nextLine());
                    long imeiCode = random.nextLong();
                    System.out.print("Enter memory: ");
                    int memory = Integer.parseInt(scan.nextLine());

                    Smartphone userSmartphone = new Smartphone(code, name, description, price, vat, imeiCode, memory);
                    productsArray.add(userSmartphone);
                    System.out.println("Your cart: " + productsArray);
                    break;

                case "2":
                    System.out.println("Television");
                    break;
                case "3":
                    System.out.println("Headphones");
                    break;
                case "4":
                    System.out.println("Closing...");
                    quit = true;
                default:
                    System.out.println("Error! Please enter a valid choice.");
                    break;
            }

        }

    }
}
