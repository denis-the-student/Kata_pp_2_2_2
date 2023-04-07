package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private static final List<Car> carList;
    static {
        carList = new ArrayList<>();
        carList.add(new Car("Mitsubishi", "Pajero Sport", 2900000));
        carList.add(new Car("Land Rover", "Discovery", 6000000));
        carList.add(new Car("УАЗ", "Patriot", 1100000));
        carList.add(new Car("Renault", "Duster", 1100000));
        carList.add(new Car("Toyota", "RAV4", 2200000));
    }

    public List<Car> getCars(Integer quantity) {
        return quantity == null ? carList : carList.stream().limit(quantity).collect(Collectors.toList());
    }
}
