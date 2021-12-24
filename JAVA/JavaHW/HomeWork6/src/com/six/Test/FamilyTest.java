package com.six.Test;

import com.six.homeWork.Family;
import com.six.homeWork.Human;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FamilyTest {
    private static Family family;
    private static Human mother;
    private static Human father;
    private static Human son1;
    private static Human son2;
    private static Human son3;
    private static Human son4;

    @BeforeAll
    static void setFamily() {
        father = new Human("Sergei", "Popov", 1960);
        mother = new Human("Svetlana", "Popova", 1963);
        son1 = new Human("Andrey", "Popov", 2001, 90);
        son2 = new Human("Danya", "Popov", 2002, 120);
        son3 = new Human("Roma", "Popov", 2004, 110);
        son4 = new Human("Sasha", "Popov", 2003, 120);
        family = new Family(mother, father);
        family.addChild(son1);
        family.addChild(son2);
        family.addChild(son3);
    }

    @Test
    void deleteChild() {
        assertEquals(4, family.getChildren().length);
        family.deleteChild(1);
        assertEquals(3, family.getChildren().length);
    }

    @Test
    void deleteChildOutOfBounds() {
        assertEquals(family.deleteChild(10).length, family.getChildren().length);
    }


    @Test
    void addChild() {
        int previOusLength = family.getChildren().length;
        family.addChild(son4);
        assertEquals(previOusLength + 1, family.getChildren().length);
    }

    @Test
    void countFamily() {
        assertEquals(5, family.countFamily());
    }
}
