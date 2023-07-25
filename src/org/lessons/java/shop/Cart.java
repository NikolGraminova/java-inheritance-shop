package org.lessons.java.shop;

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
                    int smartphoneCode = random.nextInt();
                    System.out.print("Enter name: ");
                    String smartphoneName = scan.nextLine();
                    System.out.print("Enter description: ");
                    String smartphoneDescription = scan.nextLine();
                    System.out.print("Enter price: ");
                    double smartphonePrice = Double.parseDouble(scan.nextLine());
                    System.out.print("Enter vat: ");
                    int smartphoneVat = Integer.parseInt(scan.nextLine());
                    long smartphoneImeiCode = random.nextLong();
                    System.out.print("Enter memory: ");
                    int smartphoneMemory = Integer.parseInt(scan.nextLine());

                    Smartphone userSmartphone = new Smartphone(smartphoneCode, smartphoneName, smartphoneDescription,smartphonePrice, smartphoneVat, smartphoneImeiCode, smartphoneMemory);
                    productsArray.add(userSmartphone);
                    System.out.println("Your cart: " + productsArray);
                    break;

                case "2":
                    System.out.println("You chose Television, please enter the details.");
                    int tvCode = random.nextInt();
                    System.out.print("Enter name: ");
                    String tvName = scan.nextLine();
                    System.out.print("Enter description: ");
                    String tvDescription = scan.nextLine();
                    System.out.print("Enter price: ");
                    double tvPrice = Double.parseDouble(scan.nextLine());
                    System.out.print("Enter vat: ");
                    int tvVat = Integer.parseInt(scan.nextLine());
                    System.out.print("Enter tv size: ");
                    int tvSize = Integer.parseInt(scan.nextLine());
                    System.out.print("Is it a smart tv? Y/N");
                    String smartChoice = scan.nextLine();
                    boolean tvSmart;
                    tvSmart = smartChoice.equalsIgnoreCase("Y");

                    Television userTelevision = new Television(tvCode, tvName, tvDescription,tvPrice, tvVat, tvSize, tvSmart);
                    productsArray.add(userTelevision);
                    System.out.println("Your cart: " + productsArray);
                    break;

                case "3":
                    System.out.println("You chose Headphones, please enter the details.");
                    int headphonesCode = random.nextInt();
                    System.out.print("Enter name: ");
                    String headphonesName = scan.nextLine();
                    System.out.print("Enter description: ");
                    String headphonesDescription = scan.nextLine();
                    System.out.print("Enter price: ");
                    double headphonesPrice = Double.parseDouble(scan.nextLine());
                    System.out.print("Enter vat: ");
                    int headphonesVat = Integer.parseInt(scan.nextLine());
                    System.out.print("Enter color: ");
                    String headphonesColor = scan.nextLine();
                    System.out.print("Is it wireless? Y/N");
                    String headphonesChoice = scan.nextLine();
                    boolean headphonesWireless;
                    headphonesWireless = headphonesChoice.equalsIgnoreCase("Y");

                    Headset userHeadset = new Headset(headphonesCode, headphonesName, headphonesDescription,headphonesPrice, headphonesVat, headphonesColor, headphonesWireless);
                    productsArray.add(userHeadset);
                    System.out.println("Your cart: " + productsArray);
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
