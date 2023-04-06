package web.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "carList")
public class Cars {

    private List<Car> carList;

    public List<Car> getCarList() {
        return carList;
    }

    @XmlElement(name = "car")
    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
