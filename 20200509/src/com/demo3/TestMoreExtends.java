package com.demo3;

import com.sun.deploy.uitoolkit.Window;

import java.time.chrono.IsoChronology;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/9
 * @Content:
 */
class Animal{
    protected String name;
    public Animal(String name){
        this.name = name;
    }
}

interface IFlying{
    void fly();
}
interface IRunning{
    void run();
}
interface ISwimming{
    void swim();
}

//一个类可以继承一个普通类/抽象类  并且可以同时实现多个接口
//先extends 再implements
class Cat extends Animal implements IRunning{
    public Cat(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用四条腿跑");
    }
}

class Fish extends Animal implements ISwimming{
    public Fish(String name){
        super(name);
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在用尾巴游");
    }
}

class Frog extends Animal implements IRunning,ISwimming{
    public Frog(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在跑");
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在游");
    }
}

class Robot implements IRunning{
    @Override
    public void run() {
        System.out.println("我是机器人 我在用腿跑！");
    }
}
public class TestMoreExtends {
    public static void walk(IRunning running){
        System.out.println("我带着伙伴去散步");
        running.run();
    }
    public static void swim(ISwimming swimming){
        System.out.println("我带着伙伴去游泳");
        swimming.swim();
    }
    public static void main(String[] args) {
        IRunning iRunning1 = new Robot();
//        iRunning.run();
        walk(iRunning1);
        IRunning iRunning2 = new Frog("青青");
        walk(iRunning2);
        ISwimming iSwimming = new Frog("青青");
        swim(iSwimming);
    }
}
