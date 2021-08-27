package com.company;


import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final String make;
    private final String model;
    private double price;
    private final String isRented;
    public static ArrayList<Cars> carsList = new ArrayList<>();

    public Cars(String make, String model, double price, String isRented) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.isRented = isRented;
    }

    public static void carLot() {
        carsList.add(new Cars("Honda", "Civic Type R", 50, "true"));
        carsList.add(new Cars("Toyota", "Supra", 100, "true"));
        carsList.add(new Cars("Nissan", "350Z", 90, "false"));
        carsList.add(new Cars("Acura", "NSX", 150, "true"));
        carsList.add(new Cars("Nissan", "Skyline GTR", 200, "true"));
        carsList.add(new Cars("Mitsubishi", "Eclipse", 50, "false"));
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getIsRented() {
        return isRented;
    }
}

