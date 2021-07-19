package com.javalesson.Inheritance;

public class Bus extends FuelAuto {

    int passengerNumber;

    public Bus(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engineType, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized");
    }


    public void fuelUp() {
        int volume = getTankVolume() - getAvailablePetrol();
        fuelUp(volume);
    }

    @Override
    public Integer fuelUp(int petrolVolume) {
        int volume = getAvailablePetrol() + petrolVolume;
        if (volume>getTankVolume()) {
            setAvailablePetrol(getTankVolume());
        }
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
