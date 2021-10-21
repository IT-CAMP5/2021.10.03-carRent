package pl.camp.it.car.rent.model;

public class Truck extends Vehicle {
    private int wheels;

    public Truck(String brand, String model, int year, String plate, int wheels) {
        super(brand, model, year, plate);
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
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
                .append(" Ilość kół: ")
                .append(this.wheels);

        if(this.isRent()) {
            sb.append(" Niedostępny");
        } else {
            sb.append(" Dostępny");
        }

        return sb.toString();
    }
}
