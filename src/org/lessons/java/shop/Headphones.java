package org.lessons.java.shop;

public class Headphones extends Product{

    // FIELDS
    String color;
    boolean wireless;


    // CONSTRUCTORS
    public Headphones(int code, String name, String description, double price, int vat, String color, boolean wireless) {
        super(code, name, description, price, vat);
        this.color = color;
        this.wireless = wireless;
    }


    // METHODS

    @Override
    public String toString() {
        return "Headphones{" +
                "color='" + color + '\'' +
                ", wireless=" + wireless +
                '}';
    }
}
