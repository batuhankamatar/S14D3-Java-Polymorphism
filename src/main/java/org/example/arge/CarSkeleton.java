package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(){

    };

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return name + " engine is starting.";
    }

    public String drive() {
        runEngine();
        return name + " is driving...";
    }

    protected void runEngine() {
        System.out.println("Engine is running for: " + getClass().getSimpleName());
    }
}
