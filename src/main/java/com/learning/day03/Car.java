package src.main.java.com.learning.day03;

public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    void drive(){
        engine.drive();
    }
}
