package pl.javastart.task;

public class Car extends Vehicle {
    private boolean airConditioning;
    private static final double FUEL_CONSUMPTION_WITH_AC = 0.8;

    public Car(String name, double fuelTankCapacity, double fuelConsumption, boolean airConditioning) {
        super(name, fuelTankCapacity, fuelConsumption);
        this.airConditioning = airConditioning;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public double totalFuelConsumption() {
        double totalFuelConsumption = getFuelConsumption();
        if (airConditioning) {
            totalFuelConsumption += FUEL_CONSUMPTION_WITH_AC;
        }
        return totalFuelConsumption;
    }

    @Override
    public double calculateRange() {
        return (getFuelTankCapacity() / totalFuelConsumption()) * 100;
    }

    public void displayCarInfo() {
        System.out.println("_".repeat(10) + "\n");
        System.out.printf("Spalanie pojazdu %s: %.2f l/100 km\n", getName(), totalFuelConsumption());
        System.out.printf("Zasie wynosi: %.2f km\n", calculateRange());
        System.out.println("_".repeat(10) + "\n");
    }
}
