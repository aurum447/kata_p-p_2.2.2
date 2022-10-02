package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> carsList = new ArrayList<>();
    {
        Car car1 = new Car("1", 11, 10000);
        carsList.add(car1);
        Car car2 = new Car("2", 22, 20000);
        carsList.add(car2);
        Car car3 = new Car("3", 33, 30000);
        carsList.add(car3);
        Car car4 = new Car("4", 44, 40000);
        carsList.add(car4);
        Car car5 = new Car("5", 55, 50000);
        carsList.add(car5);
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        if(count < 5) {
            return carsList.stream().limit(count).collect(Collectors.toList());
        } else {
            return carsList;
        }
    }

    @Override
    public List<Car> getAllCars() {
        return carsList;
    }

}
