package com.lessonjava.oop;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Dog's count "+Dog.getDogsCount());

        Dog lab = new Dog();
        lab.setPaws(4);
        lab.setTail(1);
        lab.setName("Charley");
        lab.setBreed("Lab");
        lab.setSize("Average");
        lab.bite();

        Dog sheppard = new Dog();
        sheppard.setPaws(4);
        sheppard.setTail(1);
        sheppard.setName("Mike");
        sheppard.setBreed("Sheppard");
        sheppard.setSize("Big");
        sheppard.bite();

        Dog doberman = new Dog();
        doberman.setPaws(4);
        doberman.setTail(1);
        doberman.setName("Jake");
        doberman.setBreed("Doberman");
        sheppard.bite();
    }
}
