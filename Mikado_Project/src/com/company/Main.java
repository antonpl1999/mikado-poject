package com.company;

public class Main {

    public static void main(String[] args) {
        Animal beer = new Animal(100, "Misha", (short) 1);
        Animal wolf = new Animal(100, "Potap", (short) 2);
        Animal deer = new Animal(100, "O1e9ator", (short) 3);
        Animal pig = new Animal(100, "Pyatachok", (short) 4);
        Fruit apple = new Fruit();

        beer.sayName();
        System.out.print("State of hitPoint while eatting process: ");
        beer.eat(apple);
        beer.eat(wolf);
        beer.eat(deer);
        beer.eat(pig);

        wolf.sayName();
        System.out.print("State of hitPoint while eatting process: ");
        wolf.eat(deer);
        wolf.eat(pig);
        wolf.eat(apple);
        wolf.eat(deer);

        deer.sayName();
        System.out.print("State of hitPoint while eatting process: ");

        deer.eat(apple);
        deer.eat(apple);
        deer.eat(apple);
        deer.eat(pig);
        deer.eat(wolf);
        deer.eat(beer);

        pig.sayName();
        System.out.print("State of hitPoint while eatting process: ");

        pig.eat(apple);
        pig.eat(apple);
        pig.eat(apple);
        pig.eat(apple);
        pig.eat(apple);
        pig.eat(apple);
        pig.eat(apple);
        pig.eat(apple);
        pig.eat(apple);
        pig.eat(apple);
        pig.eat(wolf);
        pig.eat(deer);
        pig.eat(pig);
    }

}