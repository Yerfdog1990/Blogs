package org.example;

public class MyClass {
    private int instanceVar;  // instance variable
    private static int staticVar;  // static variable

    // Constructor
    public MyClass(int instanceVar, int staticVar) {
        this.instanceVar = instanceVar;
        this.staticVar = staticVar;
    }

    public static void staticMethod() {
        System.out.println(instanceVar); // ❌ Error: Cannot make a static reference to a non-static field
        MyClass obj = new MyClass(100, 200);
        System.out.println(obj.instanceVar); // ✅ Correct way to access
    }
    // Main method
    public static void main(String[] args) {
        staticMethod();
        System.out.println(staticVar);
    }
}



