package org.example;

public class Person2 {
    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name; // instance variable = parameter
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person2 p = new Person2("Alice", 25);
        p.showInfo();
    }
}

