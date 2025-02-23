package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private List<Car> cars;

    public CarServiceImp() {
        cars = new ArrayList<>();
        cars.add(new Car("Camaro", "Chevrolet", 2016));
        cars.add(new Car("M5", "BMW", 2020));
        cars.add(new Car("C 200", "Mercedes", 2024));
        cars.add(new Car("Bronco", "Ford", 2025));
        cars.add(new Car("Accord", "Honda", 2014));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size() || count <= 0) {
            return cars;
        }
        return cars.subList(0, count);
    }

}
