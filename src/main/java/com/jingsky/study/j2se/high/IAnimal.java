package com.jingsky.study.j2se.high;

/**
 * 动物基础接口，接口里面只定义要实现的方法但不进行具体实现。
 */
public interface IAnimal {
    //例如需要自己实现Run方法
    void run();
    //例如设置有几条腿
    void setLegsNum(int legsNum);
}
