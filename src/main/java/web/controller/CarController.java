package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    final CarServiceImpl carService;

    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCar(@RequestParam(value = "count",required = false) Integer count, Model model) {
        if(count != null) {
            model.addAttribute("cars", carService.getCarsByCount(count));
            System.out.println(carService.getCarsByCount(count));
        } else {
            model.addAttribute("cars", carService.getAllCars());
        }
        return "cars";
    }

}
