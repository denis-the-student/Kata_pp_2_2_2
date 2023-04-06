package web.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "car")
@XmlAccessorType(XmlAccessType.FIELD)
public class Car {

    private String brand;
    private String model;
    private int price;

    public Car() {
    }

    public Car(String Brand, String model, int price) {
        this.brand = Brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String carBrand) {
        this.brand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
