package car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class RunCar {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("car.xml");
        BuyCarImp car = context.getBean("car", BuyCarImp.class);
        car.myCar();
        Toyota toyota = context.getBean("toyota", Toyota.class);

        System.out.println(toyota.getName());
        //System.out.println(toyota.getPrice());

        Map<String, Integer> map = toyota.getMap();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        List<String> strings = toyota.getStrings();
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
