package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService{
   public List<Car> getCars (List<Car> cars,Integer num) {
        List<Car> result = cars.stream().limit(num).toList();
        return result;
    }
}
