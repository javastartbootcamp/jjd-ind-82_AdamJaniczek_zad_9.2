package pl.javastart.task;

public class Truck extends Car {
    private double cargoWeight;
    private static final double FUEL_CONSUMPTION_WITH_AC = 1.6;
    private static final double ADDITIONAL_FUEL_CONSUMPTION_PER_100KG = 0.5;

    public Truck(String name, double fuelTankCapacity, double fuelConsumption, boolean airConditioning, double cargoWeight) {
        super(name, fuelTankCapacity, fuelConsumption, airConditioning);
        this.cargoWeight = cargoWeight;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double totalFuelConsumption() {
        double totalFuelConsumption = getFuelConsumption();
        if (isAirConditioning()) {
            totalFuelConsumption += FUEL_CONSUMPTION_WITH_AC;
        }
        if (cargoWeight > 0) {
            totalFuelConsumption += (cargoWeight / 100) * ADDITIONAL_FUEL_CONSUMPTION_PER_100KG;
        }
        return totalFuelConsumption;
    }
}
