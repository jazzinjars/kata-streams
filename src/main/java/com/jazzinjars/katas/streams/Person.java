package com.jazzinjars.katas.streams;

public class Person {

    private String name;
    private int age;
    private String house;

    public Person(final String nameValue, final int ageValue) {
        this.name = nameValue;
        this.age = ageValue;
    }

    public Person(final String nameValue, final int ageValue, final String house) {
        this.name = nameValue;
        this.age = ageValue;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHouse() {
        return house;
    }

}