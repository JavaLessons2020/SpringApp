package Ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRun {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");
        DeveloperRunnerImpl developer = context.getBean("developer", DeveloperRunnerImpl.class);
        developer.runCode();
    }
}
