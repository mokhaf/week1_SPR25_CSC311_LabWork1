package org.example;

public class Car extends Vehicle {

    // variable
    private String brand;

    // constructor method
    public Car(int numberOfWheels, float engineSize, String color, String fuelType, String brand) {
        super(numberOfWheels, engineSize, color, fuelType);
        this.brand = brand;
    }

    // getter method for variable: brand
    public String getBrand() {
        return brand;
    }

    // setter method for variable: brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // honk method
    public void honk() {
       System.out.println("Honk, honk!");
    }

    // displayInfo method
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of wheels: " + getNumberOfWheels());
        System.out.println("Engine size: " + getEngineSize());
        System.out.println("Color: " + getColor());
        System.out.println("Fuel type: " + getFuelType());
    }
}
