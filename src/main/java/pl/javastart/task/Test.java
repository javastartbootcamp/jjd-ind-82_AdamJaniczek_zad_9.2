package pl.javastart.task;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();
        cars.add(new Car("Opel", 50, 6.0, true));
        cars.add(new Car("Mercedes", 75, 9.2, true));
        cars.add(new Car("Seat", 35, 5.1, true));
        cars.add(new Truck("IVECO", 350, 12.5, true, 0));
        for (Car car : cars) {
            car.displayCarInfo();
            car.setAirConditioning(false);
        }
        System.out.println();
        for (Car car : cars) {
            car.displayCarInfo();
        }
    }
}
