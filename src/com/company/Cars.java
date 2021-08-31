package com.company;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Cars {
    private final String name;
    private final double price;
    private final String rented;
    public static ArrayList<Cars> carsList = new ArrayList<>();

    public Cars(String name, double price, String rented) {
        this.name = name;
        this.price = price;
        this.rented = rented;
    }

    public static void carLot() {
        carsList.add(new Cars("Honda Accord", 50, "Not Available"));
        carsList.add(new Cars("Toyota Prius", 100, "Not Available"));
        carsList.add(new Cars("Nissan Pathfinder", 90, "Available"));
        carsList.add(new Cars("Acura MDX", 150, "Not Available"));
        carsList.add(new Cars("Hyundai Sonata", 200, "Available"));
        carsList.add(new Cars("Ford F150", 50, "Available"));
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getRented() {
        return rented;
    }

    @Override
    public String toString() {

        return "Car: " + name + ", Price per day: " + price + ", Available: " + rented;
    }
}

