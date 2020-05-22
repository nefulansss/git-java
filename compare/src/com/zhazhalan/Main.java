package com.zhazhalan;

import com.zhazhalan.compare.Dog;

import java.util.ArrayList;
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
            list.add(dog);
            if (i==9){
                i=0;
            }
        }
        list.stream().forEach(System.out::println);
    }
}
