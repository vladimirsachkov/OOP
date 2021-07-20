package com.javalesson.Inheritance;

import java.io.FileNotFoundException;

public class Bus extends FuelAuto {

    int passengerNumber;

    public Bus(String producer, String model, Engine engine, int availablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engine, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized");
    }

    public void fuelUp() {
        int volume = getTankVolume() - getAvailablePetrol();
        fuelUp(volume);
    }

    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvailablePetrol() + petrolVolume;
        if (volume>getTankVolume()) {
            setAvailablePetrol(getTankVolume());
        }
        System.out.println("Adding DIESEL");
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void pickUpPassengers (int passengerNumber) {
        this.passengerNumber+=passengerNumber;
        System.out.println("Picking up "+passengerNumber+"passengers");
    }

    public void releasePassengers() {
        if (isRunning) {
            stop();
        }
    }
}
