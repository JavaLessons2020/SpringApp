package Ioc;

public class Main {
    public static void main(String[] args) {
  /*      Developer developer = new JavaDeveloper();
        DeveloperRunner runner = new DeveloperRunnerImpl(developer);
        runner.runCode();*/

        Developer developer = DeveloperFactory.createDeveloper();
        DeveloperRunner runner = DeveloperFactory.createDeveloperRunner(developer);
        runner.runCode();
    }
}
