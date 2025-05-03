package org.example;

import java.util.List;

public class ImmutableExample {
    public static void main(String[] args) {
        List<String> immutableList = List.of("Red", "Green", "Blue");
        System.out.println("Immutable List: " + immutableList);

        // Trying to modify will throw an exception
        try {
            immutableList.add("Yellow"); // This will throw an exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify an immutable list: " + e.getMessage());
        }
    }
}
// Output:
//Immutable List: [Red, Green, Blue]
//Cannot modify an immutable list: null