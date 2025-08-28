package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {

    CarInspectionService carInspectionService = new CarInspectionService();

    @Test
    void testHasFourTires() {
        Car car = new Car(4, 5, true, true);
        assertTrue(carInspectionService.hasFourTires(car));
    }

    @Test
    void testHasSeatBelt() {
        Car car = new Car(4, 5, true, true);
        assertTrue(carInspectionService.hasSeatBelt(car));
    }

    @Test
    void testHasAirbag() {
        Car car = new Car(4, 5, true, true);
        assertTrue(carInspectionService.hasAirbag(car));
    }

    @Test
    void testHasValidNumbersOfDoors() {
        Car car = new Car(4, 5, true, true);
        assertTrue(carInspectionService.hasValidNumbersOfDoors(car));
    }

    @Test
    void checkCar() {
        Car car = new Car(4, 5, true, true);
        assertTrue(carInspectionService.checkCar(car));
    }
}