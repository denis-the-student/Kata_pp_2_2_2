package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.model.Cars;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    public List<Car> getCars(Integer quantity) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Cars.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Cars cars = (Cars) unmarshaller.unmarshal(
                getClass().getClassLoader().getResourceAsStream("carList.xml"));
        List<Car> carList = cars.getCarList();
        return quantity == null ? carList : carList.stream().limit(quantity).collect(Collectors.toList());
    }

}
