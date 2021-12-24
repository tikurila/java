package homework10;

public class Main {
    public static void main(String[] args) {
        Human mother1 = new Woman("Svetlana1", "Popova1", 1963);
        Human mother2 = new Woman("Svetlana2", "Popova2", 1963);
        Human mother3 = new Woman("Svetlana3", "Popova3", 1963);


        Human father1 = new Man("Sergei1", "Popov1", 1960);
        Human father2 = new Man("Sergei2", "Popov2", 1960);
        Human father3 = new Man("Sergei3", "Popov3", 1960);


        Human adoptedSon1 = new Man("Danya1", "Popov1", 2002);
        Human adoptedSon2 = new Man("Danya2", "Popov2", 2002);
        Human adoptedSon3 = new Man("Danya3", "Popov3", 2002);

        FamilyController familyController = new FamilyController();
        Family family1 = familyController.createNewFamily(mother1, father1);
        Family family2 = familyController.createNewFamily(mother2, father2);
        Family family3 = familyController.createNewFamily(mother3, father3);

        familyController.displayAllFamilies();

        familyController.bornChild(family1, "ManChildFamily_1", "WomanChildFamily_1");

        familyController.displayAllFamilies();

        familyController.bornChild(family1, "ManChildFamily_1_child_2", "WomanChildFamily_1_child_2");

        familyController.displayAllFamilies();

        familyController.getFamiliesBiggerThan(3);

        familyController.getFamiliesLessThan(3);

        familyController.countFamiliesWithMemberNumber(4);

        familyController.adoptChild(family1,adoptedSon1);
        familyController.adoptChild(family1,adoptedSon2);
        familyController.adoptChild(family1,adoptedSon3);

        familyController.displayAllFamilies();

        familyController.deleteAllChildrenOlderThen(10);

        familyController.displayAllFamilies();

        System.out.println(familyController.count());

        System.out.println(familyController.getFamilyById(2));

        System.out.println(familyController.getPets(0));

        familyController.getFamiliesBiggerThan(-1);

        familyController.deleteFamilyByIndex(1);

        familyController.displayAllFamilies();

    }
}
