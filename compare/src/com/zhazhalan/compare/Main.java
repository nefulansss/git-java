package com.zhazhalan.compare;

import com.zhazhalan.compare.Dog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: zhanglan61
 * @Date: 2020/5/22 20:15
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        List<Dog> list = new ArrayList<>(30);
        for (int i=0;i<10;i++){
            Dog dog =new Dog("狗子"+i,i);
            Dog dog1 =new Dog("狗子"+(10-i),(10-i));
            list.add(dog);
            list.add(dog1);
        }
        System.out.println("输出狗子");
        list.stream().forEach(System.out::println);
        Collections.sort(list);
        System.out.println("排序后");
        list.stream().forEach(System.out::println);

    }
}
