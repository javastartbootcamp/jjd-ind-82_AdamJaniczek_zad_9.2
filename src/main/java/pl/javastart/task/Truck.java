package pl.javastart.task;

public class Truck extends Car {
    private double cargoWeight;

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
    public double getFuelConsumption() {
        double resoult = super.getFuelConsumption();
        if (isAirConditioning()) {
            resoult += 0.8;
        }
        if (cargoWeight > 0) {
            resoult += (cargoWeight / 100) * 0.5;
        }
        return resoult;
    }

    @Override
    public double calculateRange() {
        return (getFuelTankCapacity() / getFuelConsumption()) * 100;
    }
}
