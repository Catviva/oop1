package oop_1;

import oop_1.CheckUtility;

public class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;


    public Car(String brand, String model, double engineVolume,
               String color, int year, String country) {
        this.brand = CheckUtility.checkBrand(brand);
        this.model = CheckUtility.checkModel(model);
        this.engineVolume = CheckUtility.checkEngineVolume(engineVolume);
        this.color = CheckUtility.checkColor(color);
        this.year = CheckUtility.checkYear(year);
        this.country = CheckUtility.checkCountry(country);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return  brand + ", " +
                model + ", " +
                engineVolume + ", " +
                color + ", " +
                year + ", " +
                country + ".";
    }
    public void print() {
        System.out.println(this);
}





}
