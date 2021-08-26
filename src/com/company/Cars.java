package com.company;


import java.util.ArrayList;
import java.util.List;

public class Cars {
    public Cars(String make, String model, double price, boolean isRented) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.isRented = isRented;
    }

    private String make;
    private String model;
    private double price;
    private boolean isRented;
    public static List<Cars> carMenu = new ArrayList<>();

    public static void carLot() {
        carMenu.add(new Cars("Honda", "Civic Type R", 50, true));
        carMenu.add(new Cars("Toyota", "Supra", 100, true));
        carMenu.add(new Cars("Nissan", "350Z", 90, false));
        carMenu.add(new Cars("Acura", "NSX", 150, true));
        carMenu.add(new Cars("Nissan", "Skyline GTR", 200, true));
        carMenu.add(new Cars("Mitsubishi", "Eclipse", 50, false));
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

    public boolean isRented() {
        return isRented;
    }
    @Override
    public String toString() {
        return make + " " + model + " " + price + " " + isRented;
    }
}
