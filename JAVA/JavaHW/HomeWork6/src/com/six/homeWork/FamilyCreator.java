package com.six.homeWork;

public class FamilyCreator {
    void createFamily() {

        Human father = new Human("Sergei", "Popov", 1960);
        Human mother = new Human("Svetlana", "Popova", 1963);
        Pet pet = new Pet(Species.DOG, "Dean", 1, 85, "eat", "sleep");
        Human son1 = new Human("Andrey", "Popov", 2001, 90);
        Human son2 = new Human("Danya", "Popov", 2002, 120);
        Human son3 = new Human("Roma", "Popov", 2004, 110);
        Human son4 = new Human("Sasha", "Popov", 2003, 120);

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
