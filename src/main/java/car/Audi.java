package car;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Audi implements Car {
    String name;
    int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public String getCar() {
        return "Audi Car";
    }

    @Override
    public String getEngine() {
        return "Audi Engine";
    }
}
