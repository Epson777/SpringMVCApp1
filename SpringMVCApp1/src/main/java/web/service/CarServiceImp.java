package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "5-series", "Blue"));
        cars.add(new Car("Mercedes-Benz", "C-class", "White"));
        cars.add(new Car("Toyota", "Land Cruiser 200", "Black"));
        cars.add(new Car("Audi", "R8", "Yellow"));
        cars.add(new Car("Ford", "Focus", "Gray"));
    }

    @Override
    public List<Car> getCarsCount(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
