package org.example.Class_andObject;

public class Car extends Vehicle {
    private Vehicle vehicle;
    private final int numberOfDoors;

    public Car(String manufacturer, String model, int year_of_manufacture,  int numberOfDoors) {
        this.vehicle = new Vehicle(manufacturer, model, year_of_manufacture);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void autoInformation() {
        System.out.println("Manufacturer: " + vehicle.getManufacturer() + "\n"
                + "Model: " + vehicle.getModel() + "\n"
                + "Year of Manufacture: " + vehicle.getYear_of_manufacture() + "\n"
                + "Number of Doors: " + numberOfDoors);
    }
}
