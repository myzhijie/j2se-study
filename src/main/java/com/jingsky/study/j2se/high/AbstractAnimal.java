package com.jingsky.study.j2se.high;

/**
 * 如果有些方法不想实现，例如setLegsNum无法实现也可以，但这个是是抽象类不能实例化，参见AbstractAnimal类。<br/>
 * 抽象类里面也可以全部是已经实现的方法，但是依然不能被实例化。
 */
public abstract class AbstractAnimal implements IAnimal {
    public void run() {

    }

    abstract public void setLegsNum(int legsNum);
}
