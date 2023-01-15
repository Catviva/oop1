package oop_1;

public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
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

    public void setBrand(String brand) {
        this.brand = brand;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEnineVolume() {
        return engineVolume;
    }

    public void setEnineVolume(double enineVolume) {
        this.engineVolume = enineVolume;
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

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
