package org.lessons.java.shop;

public class Smartphone extends Product{

    //FIELDS
    long imeiCode;
    int memory;



    // CONSTRUCTORS
    public Smartphone(int code, String name, String description, double price, int vat, long imeiCode, int memory) {
        super(code, name, description, price, vat);
        this.imeiCode = imeiCode;
        this.memory = memory;
    }


    // GETTERS AND SETTERS


    // METHODS

    @Override
    public String toString() {
        return "Smartphone{" +
                "imeiCode=" + imeiCode +
                ", memory=" + memory +
                '}';
    }
}
