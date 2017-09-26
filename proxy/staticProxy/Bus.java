package proxy.staticProxy;

import designPattern.proxy.Vehicle;

/**
 * Created by u6035457 on 9/26/2017.
 */
public class Bus {

    private Vehicle vehicle = new Vehicle();

    public void move() {
        long start = System.currentTimeMillis();
        vehicle.move();
        long end = System.currentTimeMillis();
        System.out.println("bus行驶时间: "+(end-start));
    }
}
