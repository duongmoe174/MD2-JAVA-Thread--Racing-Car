public class Main {
    public static int DISTANCE = 400;
    public static int STEP  = 5;
    public static void main(String[] args) {
        Car lamboghini = new Car("Lamborghini Aventador");
        Car ferrari = new Car("Ferrari V12 Turbo");
        Car vinfast = new Car("Vinfast lux A2.0 Turbo");

        Thread thread1 = new Thread(lamboghini);
        Thread thread2 = new Thread(ferrari);
        Thread thread3 = new Thread(vinfast);

        System.out.println("DISTANCE = 400KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
