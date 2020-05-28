package com.wisely.highlight_spring4.ch1.cloneTest;

import org.junit.Test;

public class Persion implements Cloneable{
    private String name;
    private Integer age;
    private String address;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Test
    public void testClone() throws CloneNotSupportedException {
        Persion persion = new Persion();
        persion.setName("张三");
        persion.setAge(25);
        persion.setAddress("中国香港");

        Persion persionClone = (Persion) persion.clone();

        System.out.println(persionClone == persion);
        System.out.println("persion: \t" + persion.toString());
        System.out.println("persionClone: \t" + persionClone.toString());
}


    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
