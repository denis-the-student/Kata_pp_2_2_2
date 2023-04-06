package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl {
    private List<Car> carList;




    public List<Car> getCars(Integer quantity) {
        return quantity == null || quantity > carList.size() ? carList : carList.subList(0, quantity);
    }
}
