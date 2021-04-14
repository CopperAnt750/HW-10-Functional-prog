package com;

public class Human {
    private int age;
    private String name;
    private Gender gender;

    @Override
    public String toString() {
        return  name + " - " + gender;
    }

    public Human(int age, String name, Gender gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }
}
