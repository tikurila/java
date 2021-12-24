package com.six.homeWork;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FamilyCreator family = new FamilyCreator();
        family.createFamily();

        Human human = new Human("Karina", "Popova", 12);
        human.setSchedule(dayOfWeek.SUNDAY, "new task");
        System.out.println(Arrays.deepToString(human.getSchedule()));


    }
}