package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.model.Cars;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private static List<Car> carList;
    {
        Cars cars;
        try {
            cars = (Cars) JAXBContext.newInstance(Cars.class).createUnmarshaller().unmarshal(
                    getClass().getClassLoader().getResourceAsStream("carList.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
        carList = cars.getCarList();

        System.out.println("parsing xml");
    }

    public List<Car> getCars(Integer quantity) {
        return quantity == null ? carList : carList.stream().limit(quantity).collect(Collectors.toList());
    }
}
