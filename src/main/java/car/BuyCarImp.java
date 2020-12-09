package car;

public class BuyCarImp implements BuyCar {

    private final Car car;

    public BuyCarImp(Car car) {
        this.car = car;
    }


//    public void setMyNewCar(Car car) {
//        this.car = car;
//    }

    @Override
    public void myCar() {
        System.out.println("This is my car = " + car.getCar() +"\n" +
                "Engine = " + car.getEngine());
    }
}
