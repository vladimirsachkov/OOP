package com.lessonjava.oop;

public class Dog {
    private static int dogsCount;

    private int paws;
    private int tail;
    private String name;
    private String breed;
    private String size;

    public Dog() {
        dogsCount++;
        System.out.println("Dog's count is " + dogsCount);
    }

    public static int getDogsCount(){
        return dogsCount;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(size.equalsIgnoreCase("Big") ||
                size.equalsIgnoreCase("Average") ||
                size.equalsIgnoreCase("Small")) {
            this.size = size;
        } else {
            System.out.println("Size should be one of these: Big, Average or Small");
        }
    }

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
        if (tail == 1) {
            this.tail = tail;
        } else {
            this.tail = 1;
            System.out.println("User tried to assign. "+tail+" tail for a dog");
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

    public void bark() {
        if(size.equalsIgnoreCase("Big")) {
            System.out.println("Wof - Wof");
        } else if (size.equalsIgnoreCase("Average")) {
            System.out.println("Raf - Raf");
        } else if (size.equalsIgnoreCase("Small")) {
            System.out.println("Tiaf - tiaf");
        }
    }

    public void bite() {
        if (dogsCount>2) {
            System.out.println("Dogs are biting you");
        } else {
            bark();
        }
    }
}
