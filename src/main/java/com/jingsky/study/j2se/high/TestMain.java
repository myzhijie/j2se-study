package com.jingsky.study.j2se.high;

//这里用来测试多态
public class TestMain{

    public static void main(String[] args){
        Animal dog=new Dog(5,"a");
        Animal cat=new Cat(5,"b");
        Animal tiger=new Tiger(5,"Tiger");
        dog.printSelf();//我是Dog
        cat.printSelf();//我是Cat
        tiger.printSelf();//我是Animal，Tiger没有自己的printSelf，则使用夫类的printSelf
    }
}
