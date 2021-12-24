package com.homeWork8;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog", 1, 78, "eat", "sleep");
        dog.foul();
        dog.respond();


        RoboCat roboCat = new RoboCat("RoboCat", 1, 78, "eat", "sleep");
        roboCat.foul();
        roboCat.respond();

        Fish fish = new Fish("fish", 1, 78, "eat", "sleep");
        fish.foul();
        fish.respond();

        DomesticCat domesticCat = new DomesticCat("DomesticCat", 1, 78, "eat", "sleep");
        domesticCat.foul();
        domesticCat.respond();


        Man man = new Man("Sergei", "Popov", 1960);
        man.greetPet();

        Woman woman = new Woman("Svetlana", "Popova", 1970);
        woman.greetPet();

        Family family = new Family(woman, man);
        family.setPet(dog);
        family.setPet(fish);
        man.greetPet();
        woman.greetPet();
        man.repairCar();
        woman.makeUp();
    }
}