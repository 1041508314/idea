package com.demo3;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/9
 * @Content:
 */

/**
 * 接口（interface）
 * 1.接口中的方法都是抽象方法
 * 2.其实可以有具体实现的方法  这个方法是被default进行修饰的（JDK 1.8加入的）
 * 3.接口中定义的成员变量默认为常量
 * 4.接口当中的成员变量默认是 public static final   成员方法是 public abstract
 * 5.接口是不可以被实例化的
 * 6。接口和类之间的关系：implements
 * 7.为了解决java单继承的问题
 * 8.只要这个类实现了该接口  那么你就可以进行向上转型
 */
interface Shape{
    //int a = 10;
    public abstract void draw();
//    default void func(){
//        System.out.println("123456");
}

class Cycle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个⚪");
    }
}

class Rect implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}

public class TestInterFace {
    public static void  drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new Rect();
        drawMap(shape1);
        drawMap(shape2);
    }
//    public static void main(String[] args) {
//        Shape shape1 = new Cycle();
//        Shape shape2 = new Rect();
//    }
}
