package pl.camp.it.car.rent.model;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String plate;
    private boolean rent;

    public Car(String brand, String model, int year, String plate) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.plate = plate;
        this.rent = false;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getPlate() {
        return plate;
    }

    public boolean isRent() {
        return rent;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }
}
