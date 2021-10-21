package pl.camp.it.car.rent.model;

public class Motor extends Vehicle {
    boolean additionalSeat;

    public Motor(String brand, String model, int year, String plate, boolean additionalSeat) {
        super(brand, model, year, plate);
        this.additionalSeat = additionalSeat;
    }

    public boolean isAdditionalSeat() {
        return additionalSeat;
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
                .append(" Dodatkowe siedzenie: ")
                .append(this.additionalSeat);

        if(this.isRent()) {
            sb.append(" Niedostępny");
        } else {
            sb.append(" Dostępny");
        }

        return sb.toString();
    }
}
