package com.javalesson.Inheritance;

public class Truck extends Auto{

    private int cargoWeight;

    public Truck(String producer, String model, EngineType engineType, int cargoWeight) {
        super(producer, model, engineType);
        this.cargoWeight = cargoWeight;
        System.out.println("Constructing truck");
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public void load() {
        System.out.println("Cargo loaded");
    }

    public void unload() {
        System.out.println("Cargo unloaded");
    }
}
