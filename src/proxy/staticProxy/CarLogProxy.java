package proxy.staticProxy;

import proxy.Movable;

/**
 * Created by u6035457 on 9/27/2017.
 */
public class CarLogProxy implements Movable{
    private Movable vehicle = null;

    public CarLogProxy(Movable vehicle) {

        this.vehicle = vehicle;
    }

    public void move() {
        System.out.println("car log start...");
        vehicle.move();
        System.out.println("car log end...");
    }
}
