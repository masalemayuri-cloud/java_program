// Java Program to find maximum element
// in a vector using predefined method
 
import java.io.*;

// Importing Vector Class
import java.util.Collections;

// Importing Vector Class
import java.util.Vector;

class maximumNum {
  
    // Main Method
    public static void main(String[] args)
    {
        // initializing a Vector
        Vector<Integer> v = new Vector<Integer>();
      
        // adding values to the Vector
        v.add(7);
        v.add(50);
        v.add(0);
        v.add(67);
        v.add(98);
      
        // finding the largest element
        int n = Collections.max(v);
      
        // printing the largest element
        System.out.println(
            "The maximum value present in Vector is : "
            + n);
    }
}