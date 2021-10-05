package pl.camp.it.car.rent.gui;

import pl.camp.it.car.rent.model.Car;

public class GUI {

    public void showMenu() {
        System.out.println("1. Lista aut");
        System.out.println("2. Wypożycz auto");
        System.out.println("3. Wyjdź");
        System.out.println("4. Oddaj auto");
    }

    public void printCar(Car car) {
        System.out.print(car.getBrand() + " " + car.getModel() + " rok: " + car.getYear() + " numer rejestracyjny: " + car.getPlate());
        if (car.isRent()) {
            System.out.print(" status: wypożyczony");
        } else {
            System.out.print(" status: wolny");
        }
        System.out.println();
    }
}
