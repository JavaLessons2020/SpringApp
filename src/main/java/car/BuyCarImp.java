package car;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component //== @Bean
public class BuyCarImp implements BuyCar {

    private  Car car;

//    public BuyCarImp(Car car) {
//        this.car = car;
//    }

    //@Inject //Внедрение зависимости ????
    @Autowired//Внедрение зависимости
    public void setMyNewCar(@Qualifier("audi") Car car) {
        this.car = car;
    }

    @Override
    public void myCar() {
        System.out.println("This is my car = " + car.getCar() +"\n" +
                "Engine = " + car.getEngine());
    }
}
