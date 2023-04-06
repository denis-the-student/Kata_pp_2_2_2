package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import web.model.Cars;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> carList;

    public CarServiceImpl() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Cars.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Cars cars = (Cars) unmarshaller.unmarshal(getClass().getClassLoader().getResourceAsStream("carList.xml"));
        carList = cars.getCarList();
    }

    public List<Car> getCars(Integer quantity) {
        return quantity == null || quantity > carList.size() ? carList : carList.subList(0, quantity);
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
