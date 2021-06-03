package com.lessonjava.oop;

public class Dog {
    private int paws;
    private int tail;
    private String name;
    private String breed;

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        if (paws == 4) {
            this.paws = paws;
        } else {
            this.paws = 4;
            System.out.println("User tried to assign."+paws+" paws for a dog");
            System.out.println("Correct number is 4");
        }
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        if (paws == 1) {
            this.tail = paws;
        } else {
            this.tail = 1;
            System.out.println("User tried to assign."+tail+" tail for a dog");
            System.out.println("Correct number is 1");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
