package com.demo1;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/9
 * @Content:
 */
class Animal{
    public String name;
    public Animal(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println(this.name + "正在吃！ Animal");
    }
}
class Cat extends Animal{
    public String huzi;
    public Cat(String name,String huzi){
        super(name);//显式调用
        //子类在构造的时候，要帮助父类先进行构造
        this.huzi = huzi;
    }
    public void eat(){
        System.out.println(this.name + "正在吃！ Cat");
    }
    public void func(){
        System.out.println(this.name);
    }
}

public class TestDemo {
    public static void main(String[] args) {
        //向上转型  父类引用来引用子类对象
        Animal animal = new Cat("将军","胡子");

        //运行时绑定 运行时多态
        animal.eat();
//        animal.huzi;//是错误的

//        Cat cat = new Cat();
//        cat.eat();
    }
}