package pl.camp.it.car.rent.gui;

public class GUI {
    private static final GUI instance = new GUI();


    private GUI() {
    }

    public void showMenu() {
        System.out.println("1. Lista aut");
        System.out.println("2. Wypożycz auto");
        System.out.println("3. Wyjdź");
        System.out.println("4. Oddaj auto");
    }

    public static GUI getInstance() {
        return instance;
    }
}
