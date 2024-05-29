package org.example;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("2022 Toyota Corolla");
        runRace(car);

        Car ford = new GasPoweredCar("1968 Ford Mustang GT", 11.6, 8);
        runRace(ford);

        Car toyota = new GasPoweredCar("1986 Corolla GTS", 28.4, 4);
        runRace(toyota);

        Car tesla = new ElectricCar("2024 Red Tesla Model 3", 365, 75);
        runRace(tesla);

        Car prius = new HybridCar("2024 Toyota Prius", 350, 75, 4);
        runRace(prius);



    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }



}