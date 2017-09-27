package proxy.staticProxy;

import proxy.Vehicle;

/**
 * 测试继承实现多个代理功能的叠加
 * ....每一次一个功能的调整都要弄出一个新的代理类
 * 聚合实现的话, 更为灵活一些, 但是也是需要一些新的function 类
 */
public class CarProxyForMutipleFunction extends Vehicle{

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();
        //添加打印日志的功能
        //添加权限判断的功能
        System.out.println("car2的日志...");
        System.out.println("car2行驶时间: "+(end-start));
    }
}
