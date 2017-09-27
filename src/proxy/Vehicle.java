package proxy;

import java.util.Random;

public class Vehicle implements Movable {

    @Override
    public void move() {
        try {
            System.out.println("Vehicle行驶中......");
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
