package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

import javax.xml.bind.JAXBException;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarServiceImpl carService;

    @Autowired
    public CarsController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String getCars(@RequestParam(value = "n", required = false) Integer quantity, Model model) throws JAXBException {
        model.addAttribute("carList", carService.getCars(quantity));
        return "cars";
    }
}
