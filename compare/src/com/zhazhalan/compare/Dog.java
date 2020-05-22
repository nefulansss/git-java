package com.zhazhalan.compare;

/**
 * @Author: zhanglan61
 * @Date: 2020/5/22 20:15
 * @Version: 1.0
 */
public class Dog implements Comparable<Dog> {
    /**
     * 名字
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 根据年龄排序
     * @param o
     * @return
     */
    @Override
    public int compareTo(Dog o) {
        return this.age>o.age?1:-1;
    }

}
