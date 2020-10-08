package com.company.Encapsulation;

public class Mouse {
    private String name;
    private double weight;
    private int keys;
    private String connection;
    private String manufacturer;

    public Mouse(String name, double weight, int keys, String connection, String manufacturer) {
        this.name = name;
        this.weight = weight;
        this.keys = keys;
        this.connection = connection;
        this.manufacturer = manufacturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String print() {
        return ("Name: " + name + "\n" +
                "Weight g: " + weight + "\n" +
                "Number of keys: " + keys + "\n" +
                "Connection type: " + connection + "\n" +
                "Manufacturer country: " + manufacturer
        );
    }
}
