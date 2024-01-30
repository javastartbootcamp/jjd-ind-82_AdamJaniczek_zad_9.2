package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Samochód osobowy", 50, 6.5, true);
        car.displayCarInfo();
        System.out.println(car.getFuelConsumption());
        System.out.println(car.totalFuelConsumption());
        System.out.println();
        Car truck = new Truck("Samochód ciężarowy", 250, 10.0, true, 100);
        truck.displayCarInfo();
        System.out.println(truck.getFuelConsumption());
        System.out.println(truck.totalFuelConsumption());
    }
}
