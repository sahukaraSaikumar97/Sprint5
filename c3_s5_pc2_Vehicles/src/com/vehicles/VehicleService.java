package com.vehicles;

public class VehicleService {
    public static void main(String[] args) {
        Bike bike = new Bike("Ninja","b7","sportsbike");
        Car car = new Car("Audi","Q7","Sportscar");

        System.out.println("Bike type is " + bike.getVehicleType() +" its speed is " + bike.maxSpeed(bike.getVehicleType()));
        System.out.println("ManufactureInformation = " + bike.getManufactureInformation());
        System.out.println("Car type is " + car.getVehicleType() +" its speed is " + car.maxSpeed(car.getVehicleType()));
        System.out.println("ManufactureInformation = " + car.getManufactureInformation());
    }
}
