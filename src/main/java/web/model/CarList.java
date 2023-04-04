package web.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarList {
    private ArrayList<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car("Mitsubishi", "Pajero Sport", 2900000));
        carList.add(new Car("Land Rover", "Discovery", 6000000));
        carList.add(new Car("УАЗ", "Patriot", 1100000));
        carList.add(new Car("Renault", "Duster", 1100000));
        carList.add(new Car("Toyota", "RAV4", 2200000));
    }




}
