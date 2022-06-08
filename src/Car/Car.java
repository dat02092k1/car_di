package Car;
import Interface.IEngine;
import Interface.IWheel;
import Ultilities.engine.SuperEngine;
import Ultilities.wheel.SuperWheel;

public class Car {
    private IEngine engine;
    private IWheel wheel;

    private String name;

    public Car() {

    }

    public Car(IEngine engine, IWheel wheel, String name) {
        this.engine = engine;
        this.wheel = wheel;
        this.name = name;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public IWheel getWheel() {
        return wheel;
    }

    public void setWheel(IWheel wheel) {
        this.wheel = wheel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
    System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        IWheel sw = new SuperWheel();
        IEngine se = new SuperEngine();
        Car car = new Car(se, sw, "Super car");
        car.display();
        System.out.println(se);
        System.out.println(sw);
    }
}
