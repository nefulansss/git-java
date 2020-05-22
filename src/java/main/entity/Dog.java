package entity;

/**
 * @Author: zhanglan61
 * @Date: 2020/5/22 19:50
 * @Version: 1.0
 */
public class Dog {
    /**
     * 姓名
     */
    private String name;
    /**
     * 面临
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
