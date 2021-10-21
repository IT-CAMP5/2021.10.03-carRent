package pl.camp.it.car.rent.database;

import pl.camp.it.car.rent.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
    private Map<String, Vehicle> vehicles = new HashMap<>();

    public DataBase() {
        this.vehicles.put("KR1", new Car("BMW", "3", 2010, "KR1"));
        this.vehicles.put("KR2", new Car("Mercedes", "C", 2012, "KR2"));
        this.vehicles.put("KR3", new Car("Toyota", "Corolla", 2015, "KR3"));
        this.vehicles.put("KR4", new Car("Mazda", "3", 2016, "KR4"));
        this.vehicles.put("KR5", new Car("Porsche", "Carrera", 2017, "KR5"));
        this.vehicles.put("KR6", new Bus("Solaris", "100", 2015, "KR6", 50));
        this.vehicles.put("KR7", new Truck("MAN", "1000", 2014, "KR7", 6));
        this.vehicles.put("KR8", new Motor("Yamaha", "1000", 2010, "KR8", true));
    }

    public Vehicle findNotRentVehicleByPlate(String plate) {
        Vehicle vehicle = this.vehicles.get(plate);
        if(vehicle == null || vehicle.isRent()) {
            return null;
        } else {
            return vehicle;
        }
    }

    public Vehicle findRentVehicleByPlate(String plate) {
        Vehicle vehicle = this.vehicles.get(plate);
        if(vehicle == null || !vehicle.isRent()) {
            return null;
        } else {
            return vehicle;
        }
    }

    public Map<String, Vehicle> getVehicles() {
        return vehicles;
    }
}
