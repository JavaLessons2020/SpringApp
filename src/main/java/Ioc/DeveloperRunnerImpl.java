package Ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class DeveloperRunnerImpl implements DeveloperRunner {

    private  Developer developer;

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    //    public DeveloperRunnerImpl(Developer developer) {
//        this.developer = developer;
//    }

    @Override
    public void runCode() {
        System.out.println(developer.writeCode());
    }
}
