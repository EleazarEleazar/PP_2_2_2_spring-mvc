package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> cars;

    public CarDaoImpl() {
        cars = new ArrayList<Car>();
        cars = new ArrayList<>();
        cars.add(new Car("Camaro", "Chevrolet", 2016));
        cars.add(new Car("M5", "BMW", 2020));
        cars.add(new Car("C 200", "Mercedes", 2024));
        cars.add(new Car("Bronco", "Ford", 2025));
        cars.add(new Car("Accord", "Honda", 2014));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
