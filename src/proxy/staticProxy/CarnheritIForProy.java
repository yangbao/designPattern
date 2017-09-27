package proxy.staticProxy;

import proxy.Vehicle;

/**
 * Created by u6035457 on 9/26/2017.
 * 使用继承实现的静态代理
 */
public class CarnheritIForProy extends Vehicle {

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();
        System.out.println("car行驶时间: "+(end-start));
    }
}
