package com.jingsky.study.j2se.high;

/**
 * 当一个类实现于某个接口时，需要实现全部的接口方法。<br/>
 * 如果有些方法不想实现，例如setLegsNum无法实现也可以，但这个是是抽象类不能实例化，参见AbstractAnimal类。
 */
public class RealAnimal implements IAnimal {
    public void run() {

    }

    public void setLegsNum(int legsNum) {

    }
}
