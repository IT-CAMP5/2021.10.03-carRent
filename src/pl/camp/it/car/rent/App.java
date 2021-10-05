package pl.camp.it.car.rent;

import pl.camp.it.car.rent.database.DataBase;
import pl.camp.it.car.rent.gui.GUI;
import pl.camp.it.car.rent.model.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        DataBase dataBase = new DataBase();
        GUI gui = new GUI();
        while(true) {
            gui.showMenu();

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String choose = reader.readLine();
            switch (choose) {
                case "1":
                    for (Car car : dataBase.getCars()) {
                        gui.printCar(car);
                    }
                    break;
                case "2":
                    System.out.println("Podaj numer rejestracyjny:");
                    Car car = dataBase.findNotRentCarByPlate(reader.readLine());
                    if(car == null) {
                        System.out.println("Nie ma takiego auta lub jest wypożyczone !!");
                    } else {
                        car.setRent(true);
                        System.out.println("Wypożyczono samochód !!");
                    }
                    break;
                case "3":
                    System.exit(0);
                    break;
                case "4":
                    System.out.println("Podaj numer rejestracyjny:");
                    Car car2 = dataBase.findRentCarByPlate(reader.readLine());
                    if(car2 == null) {
                        System.out.println("Nie ma takiego auta lub nie jest wypożyczone !!");
                    } else {
                        car2.setRent(false);
                        System.out.println("Oddano samochód !!");
                    }
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór");
            }
        }
    }
}
