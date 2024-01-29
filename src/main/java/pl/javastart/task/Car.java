package pl.javastart.task;

public class Car extends Vehicle {
    private boolean airConditioning;

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

    @Override
    public double getFuelConsumption() {
        double fuelConsumption = super.getFuelConsumption();
        if (airConditioning) {
            fuelConsumption += 0.8;
        }
        return fuelConsumption;
    }

    @Override
    public double calculateRange() {
        return (getFuelTankCapacity() / getFuelConsumption()) * 100;
    }

    public void displayCarInfo() {
        System.out.println();
        System.out.printf("Spalanie pojazdu %s: %.2f l/100 km\n", getName(), getFuelConsumption());
        System.out.printf("Zasie wynosi: %.2f km", calculateRange());

    }
}
