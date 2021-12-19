package com.four.homeWork;

public class Main {
    public static void main(String[] args) {

        Human father = new Human("Sergei", "Popov", 1960);
        Human mother = new Human("Svetlana", "Popova", 1963);
        Pet pet = new Pet("dog", "Dean", 2, 85, "eat", "sleep");
        Human son1 = new Human("Roma", "Popov", 1990, 120);
        Human son2 = new Human("Andrey", "Popov", 2010, 60);
        Human son3 = new Human("Vladimir", "Popov", 2000, 95);
        Human son4 = new Human("Slavik", "Popov", 1983, 50);

        Family family1 = new Family(mother, father);
        family1.addChild(son1);
        family1.addChild(son2);
        family1.addChild(son3);
        family1.addChild(son4);

        family1.deleteChild(1);
        family1.deleteChild(3);
        family1.deleteChild(2);

        family1.setPet(pet);
        System.out.println(family1.countFamily());

        family1.toString();
    }

}
