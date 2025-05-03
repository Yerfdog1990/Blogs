package org.example;

import java.util.ArrayList;

public class MutableExample {
    public static void main(String[] args) {
        ArrayList<String> mutableList = new ArrayList<>();
        mutableList.add("Apple");
        mutableList.add("Banana");
        System.out.println("Before modification: " + mutableList);

        // Modifying the list
        mutableList.remove("Banana");
        mutableList.add("Cherry");
        System.out.println("After modification: " + mutableList);
    }
}
