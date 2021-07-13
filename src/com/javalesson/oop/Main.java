package com.javalesson.oop;

import com.javalesson.oop.Dog;

public class Main {

    public static void main(String[] args) {

        System.out.println("Dog's count "+ Dog.getDogsCount());

        Dog lab = new Dog();
        lab.setName("Charley");
        lab.setBreed("Lab");
        lab.setSize(com.javalesson.oop.Size.AVERAGE);
        lab.bite();

        Dog sheppard = new Dog();
        sheppard.setName("Mike");
        sheppard.setBreed("Sheppard");
        sheppard.setSize(com.javalesson.oop.Size.BIG);
        sheppard.bite();

        Dog doberman = new Dog();
        doberman.setName("Jake");
        doberman.setBreed("Doberman");
        doberman.setSize(com.javalesson.oop.Size.BIG);
        sheppard.bite();
    }
}
