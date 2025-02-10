package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;


    {
        cars = new ArrayList<>();
        cars.add(new Car("bmw", 11, 1));
        cars.add(new Car("mersedes", 12, 2));
        cars.add(new Car("audi", 13, 3));
        cars.add(new Car("Reno", 14, 4));
        cars.add(new Car("Autovaz", 15, 5));
    }


    @Override
    public List<Car> getCars(Integer count) {
        List<Car> res = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            res.add(cars.get(i));
        }
        return res;
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }


}