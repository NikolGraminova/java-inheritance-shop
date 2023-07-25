package org.lessons.java.shop;

public class Television extends Product{

    // FIELDS
    int size;
    boolean smart;


    // CONSTRUCTORS
    public Television(int code, String name, String description, double price, int vat, int size, boolean smart) {
        super(code, name, description, price, vat);
        this.size = size;
        this.smart = smart;
    }


    // METHODS

    @Override
    public String toString() {
        return "Television{" +
                "size=" + size +
                ", smart=" + smart +
                '}';
    }
}
