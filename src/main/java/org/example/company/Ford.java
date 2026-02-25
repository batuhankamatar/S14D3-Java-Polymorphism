package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        super.startEngine();
        return "Ford's engine is starting";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return "Ford is is accelerating.";
    }

    @Override
    public String brake() {
        super.brake();
        return "Ford is breaking.";
    }
}
