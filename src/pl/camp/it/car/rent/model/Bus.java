package pl.camp.it.car.rent.model;

import pl.camp.it.car.rent.gui.GUI;

public class Bus extends Vehicle {
    private int passengers;

    public Bus(String brand, String model, int year, String plate, int passengers) {
        super(brand, model, year, plate);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marka: ")
                .append(this.getBrand())
                .append(" Model: ")
                .append(this.getModel())
                .append(" Rok produkcji: ")
                .append(this.getYear())
                .append(" Rejestracja: ")
                .append(this.getPlate())
                .append(" Liczba pasażerów: ")
                .append(this.passengers);

        if(this.isRent()) {
            sb.append(" Niedostępny");
        } else {
            sb.append(" Dostępny");
        }

        return sb.toString();
    }
}
