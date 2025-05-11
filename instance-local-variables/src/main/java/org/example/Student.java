package org.example;

public class Student {
    // Instance variables
    String name;
    int age;

    // Constructor (assigning values to instance variables)
    public Student(String studentName, int studentAge) {
        name = studentName;   // instance variable assigned from local variable
        age = studentAge;     // instance variable assigned from local variable
    }
    public void displayInfo() {
        // Local variable
        String info; // ❌ Must be initialized before use

        // Assigning a value to the local variable
        info = "Name: " + name + ", Age: " + age;

        // Printing local variable
        System.out.println(info);
    }
    public static void main(String[] args) {
        // Local variable inside the main method
        Student s1 = new Student("Alice", 20); // Assigning instance variables via constructor
        s1.displayInfo();

        Student s2 = new Student("Bob", 22);
        s2.displayInfo();
    }
}








