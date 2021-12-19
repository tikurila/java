package com.four.homeWork;

public class Main {
    public static void main(String[] args) {
        Human father = new Human("Sergei", "Popov", 1960);
        Human mother = new Human("Karina", "Popova", 1963);
        Pet pet = new Pet("dog", "Dean", 2, 85, "eat", "sleep");
        Human son = new Human("Karina", "Popova", 2004, 100, pet, mother, father);

        son.describePet();
        son.greetPet();
        son.toString();
        pet.eat();
        pet.foul();
        pet.toString();

    }
}
