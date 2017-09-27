package proxy.staticProxy;

import proxy.Movable;
import proxy.Vehicle;

/**
 * Created by u6035457 on 9/27/2017.
 *  静态代理的测试类
 */
public class TestStaticProxy {
    public static void main(String[] args) {
        Movable movable = new Vehicle();
        movable.move();
        System.out.println("============继承方式静态代理===============");
        CarnheritIForProy CarheritIForProy = new CarnheritIForProy();
        CarheritIForProy.move();
        System.out.println("=============聚合方式静态代理==============");
        CarConvergeForProy carConvergeForProy = new CarConvergeForProy(new proxy.Vehicle());
        carConvergeForProy.move();
        System.out.println("=============聚合方式多功能静态代理==============");
        //各种功能的代理类都实现同一个Movable的接口, 会嵌套执行每一层的move方法, 每一层的move前后可以加一些逻辑
        // 如果用继承的方式就造成每一个的新功能,继承一个子类. 多个功能的任何一个组合也必须用一个新的子类
        //问题来了, 这些代理都是Car的, 如果有新的比如Bus呢, 还要写新的time,或者log代理; 因为move方法变了, 可能是ride方法-->动态代理(反射)
        CarLogProxy carLogProxy = new CarLogProxy(movable);
        CarTimeProxy carTimeProxy = new CarTimeProxy(carLogProxy);
        carTimeProxy.move();
    }
}
