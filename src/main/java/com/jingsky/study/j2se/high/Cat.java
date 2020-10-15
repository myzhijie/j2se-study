package com.jingsky.study.j2se.high;

/**
 * 猫类继承于动物类，因为动物类没有默认无参构造，所以Cat类也必须至少一个Animal中的构造方法。
 */
public class Cat extends Animal{
    //Cat会自动获取到Animal类中的非private成员变量或者成员函数
    public Cat(int age) {
        super(age);
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    public void setLegsNum(int legsNum) {
        //子类中可以设置父类中protected的成员变量
        this.legsNum=legsNum;
    }

    //打印下自己
    public void printSelf(){
        System.out.println("我是Cat");
    }
}
