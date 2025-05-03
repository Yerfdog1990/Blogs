package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableExample {
  public static void main(String[] args) {
    List<String> mutableList = new ArrayList<>();
    mutableList.add("Elephant");
    mutableList.add("Giraffe");
    System.out.println("Mutable list: " + mutableList);
    List<String> unmodifiableList = Collections.unmodifiableList(mutableList);
    System.out.println("Immutable List: " + unmodifiableList);

    // Modify via original collection
    mutableList.add("Buffalo"); // Works fine
    mutableList.set(0, "Rhino"); // Works fine

    System.out.println("\nAfter modifying the original list:");
    System.out.println("Original List: " + mutableList); // Reflect changes in the original list
    System.out.println("Unmodifiable View: " + unmodifiableList); // Reflect changes in the original list

    // Modify via the wrapped reference
    try{
      unmodifiableList.add("Rabbit"); // Throws an exception
      unmodifiableList.set(0, "Gazelle"); // Throws an exception
    }catch (UnsupportedOperationException e){
      System.out.println("Cannot modify the collection via the wrapped reference: " + e.getMessage());
    }
  }
}
// Output:
//Mutable list: [Elephant, Giraffe]
//Immutable List: [Elephant, Giraffe]
//
//After modifying the original list:
//Original List: [Rhino, Giraffe, Buffalo]
//Unmodifiable View: [Rhino, Giraffe, Buffalo]
//Cannot modify the collection via the wrapped reference: null



