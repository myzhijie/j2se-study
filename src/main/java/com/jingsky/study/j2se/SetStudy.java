package com.jingsky.study.j2se;


import java.util.HashSet;
import java.util.Set;

public class SetStudy {

    public static void main(String[] args) {
        //set特点：和list功能类似但是set无序且不可以重复
        Set<String> set=new HashSet<String>();
        set.add("a");//向set中添加元素
        set.add("c");
        set.add("b");
        System.out.println(set);//[a, b, c] 注意和添加的顺序不一致
        //其他操作和list类似，不再赘述
    }
}
