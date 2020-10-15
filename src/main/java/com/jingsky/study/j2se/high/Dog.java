package com.jingsky.study.j2se.high;

/**
 * 狗类继承于动物类
 */
public class Dog extends Animal{
    public Dog(int age) {
        super(age);
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    //打印下自己
    public void printSelf(){
        System.out.println("我是Dog");
    }
}
