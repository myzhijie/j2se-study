package com.jingsky.study.j2se.high;

/**
 * 动物基础类
 */
public class Animal { //默认都继承于Object类，每个类文件中必须有一个public修饰的类且类名Animal必须和文件名保持一致。
    //类中的变量推荐用private修饰再用get set方法对外暴漏
    private int age;    //成员变量
    private String name;    //成员变量
    private static int eyesNum=2;    //类的静态变量，推荐用类名的方式访问
    private final int noseNum=1; //final修饰后，这个变量被赋值后不可以再进行修改
    //这个成员变量是protected，可以在子类中访问到。
    protected int legsNum;

    //就算不写任何构造函数，类会自动创建一个无参构造函数并且无任何内容，和下面的函数一样。
    //public Animal(){
    //}

    //构造函数没有返回值且名称和类名保持一样，一旦定义了构造函数默认的构造函数就会失效
    public Animal(int age){
        //可以通过this关键字调用别的构造函数
        this(age,"小动物");
    }

    //可以有多个构造函数
    public Animal(int age,String name){
        //this关键字表示当前自己，所以this.age表示类的成员变量，后面的age为函数内的局部变量
        this.age=age;
        this.name=name;
    }

    //类的成员函数
    public void printName(){
        //非静态方法中可以调用静态方法或者静态变量
        System.out.println("小动物:"+name+",noseNum:"+noseNum);
        //noseNum=3; 编译不通过，因为final修饰后不可以再次赋值
    }

    //类的静态函数，静态函数推荐用类名直接调用
    public static void printEyesNum(){
        //静态函数里面只能调用其他静态函数或者静态变量，不可以调用非静态变量和函数
        System.out.println("小动物EyesNum:"+eyesNum);
    }
}
