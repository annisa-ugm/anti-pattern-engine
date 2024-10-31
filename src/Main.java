class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    // Menyediakan method untuk memulai mesin, tanpa memaparkan detail Engine
    public void startEngine() {
        engine.ignite();
        engine.checkOilLevel();
    }
}

class Driver {
    public void startCar(Car car) {
        car.startEngine(); // Driver hanya meminta Car untuk menyalakan mesin
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
        driver.startCar(car); // Driver sekarang tidak langsung mengakses Engine
    }
}
