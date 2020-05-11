package com.demo1;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * 理解多态
 * @Date:2020/5/9
 * @Content:
 */
class Shape{
    public void draw(){

    }
}
class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个⚪");
    }
}
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个▲");
    }
}
public class TestDemo2 {
    /**
     * 什么是多态
     * 1.父类引用 引用子类对象
     * 2.父类和子类有同名的覆盖方法
     * 3.通过父类引用去调用重写的方法的时候 发生了运行时绑定
     * @param shape
     */
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new Rect();
        drawMap(shape1);
        drawMap(shape2);
//        shape1.draw();
//        shape2.draw();
        Shape shape3 = new Triangle();
        drawMap(shape3);

    }
}
