package org.example;

public class CarInspectionService {

    public boolean hasFourTires(Car car) {
        return car.getNumberOfTire() == 4;
    }

    public boolean hasSeatBelt(Car car) {
        return car.isSetBelt();
    }

    public boolean hasAirbag(Car car) {
        return car.isSetBelt();
    }

    public boolean hasValidNumbersOfDoors(Car car) {
        int doors = car.getNumberOfDoors();
        return doors == 0 || doors == 5;
    }

    public boolean checkCar(Car car) {
        return hasFourTires(car) &&
                hasSeatBelt(car) &&
                hasAirbag(car) &&
                hasValidNumbersOfDoors(car);
    }
}
