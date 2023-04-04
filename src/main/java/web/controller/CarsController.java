package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.model.CarList;
import web.service.CarService;

import java.util.ArrayList;

@Controller
@RequestMapping("/cars")
public class CarsController {

    CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    private ArrayList<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car("Mitsubishi", "Pajero Sport", 2900000));
        carList.add(new Car("Land Rover", "Discovery", 6000000));
        carList.add(new Car("УАЗ", "Patriot", 1100000));
        carList.add(new Car("Renault", "Duster", 1100000));
        carList.add(new Car("Toyota", "RAV4", 2200000));
    }

    @GetMapping()
    public String getCars(@RequestParam(value = "n", required = false) Integer quantity, Model model) {
        model.addAttribute("carList", carService.getCars(carList, quantity));
        return "cars";
    }
}
