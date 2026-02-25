package org.example.arge;

public class HybridCar extends CarSkeleton{

    private double avgKmPerLitre;
    private  int batterySize;
    private int cylinders;

    public HybridCar(double avgKmPerLitre, int batterySize, int cylinders) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return getName() + " (Hybrid) is initializing dual systems...";
    }

    @Override
    protected void runEngine() {
        System.out.println("Hybrid system is balancing gas and " + batterySize + "kWh battery power.");
    }
}
