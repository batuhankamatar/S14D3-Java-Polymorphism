package org.example;

import org.example.company.*;
import org.example.arge.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println("\n--- Car R&D Company Test ---");

        CarSkeleton gasCar = new GasPoweredCar("Mustang", "Classic Muscle", 15.5, 8);
        CarSkeleton electricCar = new ElectricCar("Tesla", "Model S", 500, 100);
        CarSkeleton hybridCar = new HybridCar("Prius", "Eco Friendly", 20.0, 40, 4);

        testCar(gasCar);
        testCar(electricCar);
        testCar(hybridCar);
    }

    public static void testCar(CarSkeleton car) {
        System.out.println(car.startEngine());
        System.out.println(car.drive());
        System.out.println("-------------------------");
    }
}