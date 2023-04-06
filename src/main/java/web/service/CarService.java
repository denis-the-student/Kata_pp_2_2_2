package web.service;

import web.model.Car;

import javax.xml.bind.JAXBException;
import java.util.List;

public interface CarService {

    List<Car> getCars(Integer quantity) throws JAXBException;
}
