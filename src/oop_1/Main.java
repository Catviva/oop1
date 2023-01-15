package oop_1;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("", "Granta", 0, "Желтый", 2015, "Россия");
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия");
        Car car3 = new Car("BMW", "", 3.0, "", 2021, "Германия");
        Car car4 = new Car(null, "Sportage 4-го поколения", 2.4, "Красный", 2018, null);
        Car car5 = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 0, "Южная Корея");

        car1.print();
        car2.print();
        car3.print();
        car4.print();
        car5.print();
    }


}