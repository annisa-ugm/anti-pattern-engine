class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public Engine getEngine() {
        return engine;
    }
}

class Driver {
    public void startCar(Car car) {
        // Driver mengakses detail Engine untuk menyalakan mobil
        car.getEngine().ignite();
        car.getEngine().checkOilLevel();
        System.out.println("Car started");
    }
}

class Engine {
    public void ignite() {
        System.out.println("Engine ignited");
    }

    public void checkOilLevel() {
        System.out.println("Oil level is good");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Driver driver = new Driver();
        driver.startCar(car); // Driver secara langsung mengakses Engine
    }
}
