package proxy;

import java.util.Random;

/**
 * Created by u6035457 on 9/26/2017.
 */
public class Vehicle implements Movable {

    @Override
    public void move() {
        try {
            System.out.println("Vehicle行驶中......");
            new Thread(new Runnable() {
                @Override
                public void run() {

                }
            }).sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
