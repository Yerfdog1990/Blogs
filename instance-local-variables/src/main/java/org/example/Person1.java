package org.example;

public class Person1 {
    String name; // instance variable
    int age;     // instance variable

    public Person1(String name, int age) {
        name = name; // ❌ does nothing useful — assigns a local variable to itself
        age = age;   // ❌ same issue
    }

    public void showInfo() {
        System.out.println("Name: " + name); // null (default value for String)
        System.out.println("Age: " + age);   // 0 (default value for int)
    }

    public static void main(String[] args) {
        Person1 p = new Person1("Alice", 25);
        p.showInfo();
    }
}




