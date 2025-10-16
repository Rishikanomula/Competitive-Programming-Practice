public class Vehicle {
    public void start() {
        System.out.println("Vehicle started");
    }
    public void stop() {
        System.out.println("Vehicle stopped");
    }
    public void accelerate() {
        System.out.println("Vehicle is accelerating");
    }
    public void brake() {
        System.out.println("Vehicle is braking");
    }
    public void honk() {
        System.out.println("Vehicle is honking");
    }
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.start();
        v.accelerate();
        v.honk();
        v.brake();
        v.stop();
    }
}
