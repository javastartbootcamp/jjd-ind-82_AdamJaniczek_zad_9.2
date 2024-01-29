package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Samochód osobowy", 50, 6.5, true);
        car.displayCarInfo();
        Car truck = new Truck("Samochód ciężarowy", 250, 10.0, true, 1000);
        truck.displayCarInfo();
    }
}
