package com.jingsky.study.j2se;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapStudy {

    public static void main(String[] args) {
        //Map特点：键值对对应，键默认没有顺序
        Map<String,String> map=new HashMap<String, String>();
        //放入一个键值对应元素
        map.put("name","mark");
        System.out.println(map);//{name=mark}
        //再放入一个并且键也为name，则会覆盖上面放入的元素
        map.put("name","jing");
        System.out.println(map);//{name=jing}
        //再放入一个，键为其他
        map.put("sex","female");
        System.out.println(map);//{sex=female, name=jing},注意打印的顺序可能和插入的顺序不同
        //map.putAll(); 和list类似：将另一个map放入到这个map中
        System.out.println(map.get("sex"));//female 根据键获取对应的值
        System.out.println(map.get("aaa"));//null 键不存在时返回null
        //循环读取每一个键值
        for(String key : map.keySet()){
            System.out.println("key:"+key+",value:"+map.get(key));
        }
        System.out.println(map.isEmpty());//false 是否为空
        System.out.println(map.size());//2 map长度
        System.out.println(map.containsKey("sex"));//true 是否包含sex这个key
        System.out.println(map.containsValue("aa"));//false 是否包含aa这个value
        map.remove("sex");//移除key为sex这个元素
        System.out.println(map);//{name=jing},移除sex后只剩下name
        map.clear();//清除全部
        System.out.println(map);//{}
        //此时将map的key变成有序的
        map=new LinkedHashMap<String, String>();
        map.put("name","jing");
        map.put("sex","female");
        System.out.println(map);//{name=jing, sex=female}
    }
}
