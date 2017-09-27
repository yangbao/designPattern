package proxy.staticProxy;

import proxy.Movable;

/**
 * Created by u6035457 on 9/27/2017.
 */
public class CarTimeProxy implements Movable{
    private Movable vehicle = null;

    public CarTimeProxy(Movable vehicle) {

        this.vehicle = vehicle;
    }

    public void move() {
        long start = System.currentTimeMillis();
        vehicle.move();
        long end = System.currentTimeMillis();
        System.out.println("vehicle行驶时间: "+(end-start));
    }
}
