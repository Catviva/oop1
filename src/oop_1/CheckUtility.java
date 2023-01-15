package oop_1;

public class CheckUtility {


    public static String checkBrand(String brand) {
        return (brand == null || brand.isEmpty()) ? "default" : brand;
    }


    public static String checkModel(String model) {
        return (model == null || model.isEmpty()) ? "default" : model;
    }

    public static double checkEngineVolume(double engineVolume) {
        if (engineVolume <= 0)
            return 1.5;
        return engineVolume;
    }

    public static String checkColor(String color) {
        return (color == null || color.isEmpty()) ? "Белый" : color;

    }
    public static int checkYear (int year) {
        if (year <= 0)
            return 2000;
        return year;
    }
    public static String checkCountry(String country) {
        return (country == null || country.isEmpty()) ? "default" : country;
    }
}
