package com.jingsky.study.j2se;

import java.util.ArrayList;
import java.util.List;

public class ListStudy {

    public static void main(String[] args) {
        //list特点：有序可以重复，链表结构擅长添加、修改、删除，但不擅长遍历
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);//添加到list的尾部
        integerList.add(2);
        System.out.println(integerList);//[1, 2]
        System.out.println(integerList.size());//list的长度：2
        integerList.add(0, 3);//在下标为0的未知添加元素3，注意下标都是从0开始
        System.out.println(integerList);//[3, 1, 2]
        System.out.println(integerList.get(0));//获取下标为0的元素，也就是第一个元素：3
        //遍历整个list
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println("integerList[" + i + "]:" + integerList.get(i));
        }
        System.out.println(integerList.contains(1));//是否包含1这个元素：true
        System.out.println(integerList.indexOf(1));//元素1在list中的下标:1
        //再创建一个list
        List<Integer> integerOtherList = new ArrayList<Integer>();
        integerOtherList.add(6);
        integerOtherList.add(7);
        //将第二个list添加到第一个list的尾部
        integerList.addAll(integerOtherList);
        System.out.println(integerList);//[3, 1, 2, 6, 7]
        System.out.println(integerOtherList);//[6, 7] 被添加的list保持不变
        //移除刚添加的第二个list对应的元素
        integerList.removeAll(integerOtherList);
        System.out.println(integerList);//[3, 1, 2]
        //移除指定下标的元素
        integerList.remove(0);
        System.out.println(integerList);//[1, 2]
        integerList.clear();//将集合置空
        System.out.println(integerList);//[]
    }
}
