package pl.camp.it.car.rent;

import pl.camp.it.car.rent.database.DataBase;
import pl.camp.it.car.rent.gui.GUI;
import pl.camp.it.car.rent.model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        DataBase dataBase = new DataBase();
        while(true) {
            GUI.showMenu();

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String choose = reader.readLine();
            switch (choose) {
                case "1":
                    for (Vehicle vehicle : dataBase.getVehicles().values()) {
                        System.out.println(vehicle);
                    }
                    break;
                case "2":
                    System.out.println("Podaj numer rejestracyjny:");
                    Vehicle vehicle = dataBase.findNotRentVehicleByPlate(reader.readLine());
                    if(vehicle == null) {
                        System.out.println("Nie ma takiego pojazdu lub jest wypożyczony !!");
                    } else {
                        vehicle.setRent(true);
                        System.out.println("Wypożyczono pojazd !!");
                    }
                    break;
                case "3":
                    System.exit(0);
                    break;
                case "4":
                    System.out.println("Podaj numer rejestracyjny:");
                    Vehicle vehicle2 = dataBase.findRentVehicleByPlate(reader.readLine());
                    if(vehicle2 == null) {
                        System.out.println("Nie ma takiego pojazdu lub nie jest wypożyczony !!");
                    } else {
                        vehicle2.setRent(false);
                        System.out.println("Oddano pojazd !!");
                    }
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór");
            }
        }
    }
}
