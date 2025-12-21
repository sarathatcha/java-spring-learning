package src.main.java.com.learning.day03;

public class Main {
    public static void main(String[] args){
        Engine engine = new ElectricEngine();
        Car car = new Car(engine);

        car.drive();
    }
}
