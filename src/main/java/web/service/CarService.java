package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    public List<Car> getCars(ArrayList<Car> carList, Integer quantity) {
        return quantity == null || quantity > carList.size() ? carList : carList.subList(0, quantity);
    }
}
