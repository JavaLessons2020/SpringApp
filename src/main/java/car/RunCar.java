package car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class RunCar {
    public static void main(String[] args) {

        //XML конфигурация
//        ApplicationContext context
//                = new ClassPathXmlApplicationContext("car.xml");
//        BuyCarImp car = context.getBean("car", BuyCarImp.class);
//        car.myCar();
//        Toyota toyota = context.getBean("toyota", Toyota.class);
//
//        System.out.println(toyota.getName());
//        //System.out.println(toyota.getPrice());
//
//        Map<String, Integer> map = toyota.getMap();
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//
//        List<String> strings = toyota.getStrings();
//        for (String string : strings) {
//            System.out.println(string);
//        }

//        //Java конфигурация
        ApplicationContext context = new AnnotationConfigApplicationContext(CarJava.class);
//        BuyCarImp byCar = context.getBean(BuyCarImp.class);
//        byCar.myCar();


        Audi audi1 = context.getBean("audi", Audi.class);
        audi1.setName("quatro_1");
        Audi audi2 = context.getBean("audi", Audi.class);
        audi2.setName("A4");
        System.out.println("1 = " + audi1.getName());
        System.out.println("2 = " + audi2.getName());


    }
}
