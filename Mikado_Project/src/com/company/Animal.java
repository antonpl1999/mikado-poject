package com.company;

public class Animal {
    private String name;
    private int hitPoints;
    private short type;
    private boolean predator;

    public Animal(int hitPoints, String name, short type) {
        this.hitPoints = hitPoints;
        this.name = name;
        switch (type) {
            case 1:
                predator = true;
                break;
            case 2:
                predator = true;
                break;
            case 3:
                predator = false;
                break;
            case 4:
                predator = false;
                break;
        }
    }
    public void sayName() {
        System.out.println("\nAmimal name: "+ this.name);
    }

    public void eat(Animal animal) {

        if (predator) {
            this.hitPoints += 10;
        } else {
            this.hitPoints -= 10;
        }
        animal.hitPoints =0;

        System.out.print("\t"+this.hitPoints);
    }
    public void eat(Fruit food) {
        if (!predator) {
            this.hitPoints += 10;
        } else {
            this.hitPoints -= 10;
        }
        System.out.print("\t" + this.hitPoints);

    }
}