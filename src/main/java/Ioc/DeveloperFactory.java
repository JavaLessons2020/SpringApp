package Ioc;

public class DeveloperFactory {
    static Developer developer;
    static DeveloperRunnerImpl runner;


    public static Developer createDeveloper(){
        return developer = new CppDeveloper();
    }

    public static DeveloperRunner createDeveloperRunner(Developer developer){
        runner.setDeveloper(developer);
        return runner = new DeveloperRunnerImpl();
    }
}
