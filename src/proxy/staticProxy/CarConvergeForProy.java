package proxy.staticProxy;

import proxy.Vehicle;

/**
 * Created by u6035457 on 9/26/2017.
 * 使用聚合的方式来实现的静态代理
 */
public class CarConvergeForProy {

    private Vehicle vehicle = null;

    public CarConvergeForProy(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void move() {
        long start = System.currentTimeMillis();
        vehicle.move();
        long end = System.currentTimeMillis();
        System.out.println("bus行驶时间: "+(end-start));
    }
}
