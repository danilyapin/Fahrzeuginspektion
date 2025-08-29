package org.example.Class_andObject;

import java.util.Objects;

public class Vehicle {
    private String manufacturer;
    private String model;
    private int year_of_manufacture;

    public Vehicle(String manufacturer, String model, int year_of_manufacture) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year_of_manufacture = year_of_manufacture;
    }

    public Vehicle() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear_of_manufacture() {
        return year_of_manufacture;
    }

    public void setYear_of_manufacture(int year_of_manufacture) {
        this.year_of_manufacture = year_of_manufacture;
    }

    public void autoInformation(){
        System.out.println("Manufacturer: " + manufacturer + "\n"
        + "Model: " + model + "\n"
        + "Year of Manufacture: " + year_of_manufacture);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return year_of_manufacture == vehicle.year_of_manufacture && Objects.equals(manufacturer, vehicle.manufacturer) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, year_of_manufacture);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year_of_manufacture=" + year_of_manufacture +
                '}';
    }
}
