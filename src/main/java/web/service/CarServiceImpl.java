package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("BMW", 5, "Black"));
        cars.add(new Car("BMW", 3, "Red"));
        cars.add(new Car("AUDI", 5, "Black"));
        cars.add(new Car("MERCEDES", 3, "White"));
        cars.add(new Car("MAZDA", 5, "Yellow"));
    }

   public List<Car> getCars (Integer num) {
        List<Car> result = cars.stream().limit(num).toList();
        return result;
    }
}
