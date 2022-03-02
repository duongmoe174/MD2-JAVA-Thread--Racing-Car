import javax.swing.plaf.synth.SynthTextPaneUI;
import java.util.Random;

public class Car implements Runnable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();

        while (runDistance < Main.DISTANCE) {
            try {
                int speed = (new Random()).nextInt(200);
                runDistance += speed;
                String symboy = "|";
                int percentTravel = runDistance / Main.DISTANCE * 100;
                for (int i = 0; i < Main.DISTANCE; i += Main.STEP) {
                    if (percentTravel >= i + Main.STEP) {
                        symboy += "=";
                    } else if (percentTravel >= i && percentTravel < i + Main.STEP) {
                        symboy +=  "o";
                    } else {
                        symboy += "-";
                    }
                }
                symboy += "|";
                System.out.println("Car" + this.name + ": " + symboy + " " + Math.min(Main.DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Car " + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car " + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
