package org.example;

import java.util.Objects;

public class Car {
    private int numberOfTire;
    private int numberOfDoors;
    private boolean setBelt;
    private boolean airbag;

    public Car() {
    }

    public Car(int numberOfTire, int numberOfDoors, boolean setBelt, boolean airbag) {
        this.numberOfTire = numberOfTire;
        this.numberOfDoors = numberOfDoors;
        this.setBelt = setBelt;
        this.airbag = airbag;
    }

    public int getNumberOfTire() {
        return numberOfTire;
    }

    public void setNumberOfTire(int numberOfTire) {
        this.numberOfTire = numberOfTire;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isSetBelt() {
        return setBelt;
    }

    public void setSetBelt(boolean setBelt) {
        this.setBelt = setBelt;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numberOfTire == car.numberOfTire && numberOfDoors == car.numberOfDoors && setBelt == car.setBelt && airbag == car.airbag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfTire, numberOfDoors, setBelt, airbag);
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfTire=" + numberOfTire +
                ", numberOfDoors=" + numberOfDoors +
                ", setBelt=" + setBelt +
                ", airbag=" + airbag +
                '}';
    }
}
