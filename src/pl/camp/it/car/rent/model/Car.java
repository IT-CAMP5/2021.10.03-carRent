package pl.camp.it.car.rent.model;

public class Car extends Vehicle {
    public Car(String brand, String model, int year, String plate) {
        super(brand, model, year, plate);
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
                .append(this.getPlate());

        if(this.isRent()) {
            sb.append(" Niedostępny");
        } else {
            sb.append(" Dostępny");
        }

        return sb.toString();
    }
}
