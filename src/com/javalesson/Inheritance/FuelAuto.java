package com.javalesson.Inheritance;

public class FuelAuto extends Auto {

    private int availablePetrol;
    private int tankVolume;

    public FuelAuto(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume) {
        super(producer, model, engineType);
        this.availablePetrol = availablePetrol;
        this.tankVolume = tankVolume;
    }

    Auto fuelUp(int petrolVolume) {
        availablePetrol+=petrolVolume;
        System.out.println("Adding petrol");
        return new Auto();
    }

    public int getAvailablePetrol() {
        return availablePetrol;
    }

    public void setAvailablePetrol(int availablePetrol) {
        this.availablePetrol = availablePetrol;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}
