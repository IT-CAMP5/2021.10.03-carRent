package pl.camp.it.car.rent.database;

import pl.camp.it.car.rent.model.Car;
public class DataBase {
    private Car[] cars = new Car[5];

    public DataBase() {
        this.cars[0] = new Car("BMW", "3", 2010, "KR1");
        this.cars[1] = new Car("Mercedes", "C", 2012, "KR2");
        this.cars[2] = new Car("Toyota", "Corolla", 2015, "KR3");
        this.cars[3] = new Car("Mazda", "3", 2016, "KR4");
        this.cars[4] = new Car("Porsche", "Carrera", 2017, "KR5");
    }

    public Car findNotRentCarByPlate(String plate) {
        Car car = this.findCarByPlate(plate);
        if(car == null || car.isRent()) {
            return null;
        } else {
            return car;
        }
    }

    public Car findRentCarByPlate(String plate) {
        Car car = this.findCarByPlate(plate);
        if(car == null || !car.isRent()) {
            return null;
        } else {
            return car;
        }
    }

    private Car findCarByPlate(String plate) {
        for(Car car : this.cars) {
            if(car.getPlate().equals(plate)) {
                return car;
            }
        }
        return null;
    }

    public Car[] getCars() {
        return cars;
    }
}
