package homework9;

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
    }
}
