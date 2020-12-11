package car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("car")
public class CarJava {
//    @Bean
//    public Car toyotaJava() {
//        return new Toyota();
//    }
//
//    @Bean
//    public Car audiJava() {
//        return new Audi();
//    }
//
//
//    @Bean
//    public BuyCar byCarJava(@Autowired Car car) {
//        return new BuyCarImp(car);
//    }

    //вариант1
//    @Bean
//    public BuyCar byCarJava(@Autowired @Qualifier("toyotaJava") Car car) {
//        BuyCarImp buyCarImp = new BuyCarImp();
//        buyCarImp.setMyNewCar(car);
//        return buyCarImp;
//    }

    //вариант2
//    @Bean
//    public BuyCar byCarJava(@Autowired Car audiJava) {
//        BuyCarImp buyCarImp = new BuyCarImp();
//        buyCarImp.setMyNewCar(audiJava);
//        return buyCarImp;
//    }

    //вариант3
//    @Bean
//    public BuyCar byCarJava() {
//        BuyCarImp buyCarImp = new BuyCarImp();
//        buyCarImp.setMyNewCar(toyotaJava());
//        return buyCarImp;
//    }

    //вариант4 ?????????????????????
//    @Bean
//    public BuyCar byCarJava(@Name("audiJava") Car car) {
//        BuyCarImp buyCarImp = new BuyCarImp();
//        buyCarImp.setMyNewCar(car);
//        return buyCarImp;
//    }
}
