package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;
import web.service.CarServiceimpl;

import java.util.List;

@Controller
public class CarController {

    private CarServiceimpl carServiceimpl;
    @Autowired
    public CarController(CarServiceimpl carServiceimpl) {
        this.carServiceimpl = carService;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(name = "count", required = false, defaultValue = "5") int count, Model model) {
        List<Car> cars = carServiceimpl.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
