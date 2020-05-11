package com.demo4;

import javax.rmi.CORBA.StubDelegate;
import java.util.Arrays;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * 接口使用的实例
 * 一般情况下 ：自定义类型进行比较 需要时可比较的
 * Comparable  Comparator 二者有区别
 * @Date:2020/5/9
 * @Content:
 */
class Student implements Comparable<Student>{
    public String name;
    public int age;
    public int score;

    @Override
    public int compareTo(Student o) {
        if(this.score > o.score){
            return 1;
        }else if (this.score == o.score){
            return 0;
        }else{
            return -1;
        }

    }


    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student student1 = new Student("bit",18,79);
        Student student2 = new Student("lxy",21,70);
        Student student3 = new Student("ysm",21,66);

//        if(student1.compareTo(student2) < 0){
//            System.out.println("student1的年龄 < student2的年龄");
//        }
        Student[] students = new Student[3];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Arrays.sort(students);//Arrays.sort排序时默认从小到大排序
        System.out.println(Arrays.toString(students));
    }

    public static void main1(String[] args) {
        int[] array = {12,4,89,43,56};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
