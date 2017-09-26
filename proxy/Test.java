package proxy;

import designPattern.proxy.staticProxy.Bus;
import designPattern.proxy.staticProxy.Car;

/**
 * Created by u6035457 on 9/26/2017.
 */
public class Test {
    public static void main(String[] args) {
        Movable movable = new Vehicle();
        movable.move();
        System.out.println("===========================");
        Car car = new Car();
        car.move();
        System.out.println("===========================");
        Bus bus = new Bus();
        bus.move();
    }
}
