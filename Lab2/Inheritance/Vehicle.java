public class Vehicle {
    public void start() {
        System.out.println("vehicle starting ");
    }
    public void applyBrake() {
        System.out.println("Vehicle: Apply brake");
    }
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Car starting");
    }
    public void applyBrake() {
        System.out.println("Car apply brake");
    }
}

class Motorcycle extends Vehicle {
    public void start() {
        System.out.println("Motorcycle starting");
    }
    public void applyBrake() {
        System.out.println("Motorcycle apply brake");
    }
}
class Main1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Motorcycle m = new Motorcycle();
        v.start();
        v.applyBrake();
        c.start();
        c.applyBrake();
        m.start();
        m.applyBrake();
    }
}