package com.company;
public class Student {
    private String name;
    private String lastname;
    private int age;
    private Gender gender;
    private int iq;

    public void setName(String name) {
        this.name = name;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getIq() {

        return iq;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }


}
