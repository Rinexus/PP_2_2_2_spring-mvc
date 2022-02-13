package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("BMW", 5, "Black"));
        cars.add(new Car("BMW", 3, "Red"));
        cars.add(new Car("AUDI", 5, "Black"));
        cars.add(new Car("MERCEDES", 3, "White"));
        cars.add(new Car("MAZDA", 5, "Yellow"));
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam (value = "count", required = false) Integer count, Model model){
        CarService carService = new CarServiceImpl();
        model.addAttribute("cars", carService.getCars(cars, count));
        return "cars";
    }
}
