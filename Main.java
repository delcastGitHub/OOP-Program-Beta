package oopprogrambeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        // Write one line of code to create an ArrayList of products
        //ArrayList<Product> products =new ArrayList<Product>();
    	ArrayList<Product> products =new ArrayList<Product>();
        
        // Write one line of code to call testCollection and assign the result to the ArrayList
        products = testCollection();

        // Write one line of code to sort the ArrayList
       Collections.sort(products); 

        // Call the print method on the ArrayList
       print(products);
    }
    
    // Step 15
    // Complete the header for the testCollection method here
    
    public static ArrayList<Product> testCollection() {

        AudioPlayer a1 = new AudioPlayer("iPod Mini","MP3");
        AudioPlayer a2 = new AudioPlayer("Walkman","WAV ");
        MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
                new Screen(" 720x480", 40, 22), MonitorType.LCD);
        MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
                new Screen("1366x768", 40, 22), MonitorType.LED);
                
        // Write one line of code here to create the collection
        ArrayList<Product> productsTwo = new ArrayList<>();
        
        productsTwo.add(a1);
        productsTwo.add(a2);
        productsTwo.add(m1);
        productsTwo.add(m2);
        return productsTwo;
       
    }

    // Step 16
    // Create print method here
    public static void print(ArrayList<Product> products) {
        for (Product p : products){
          System.out.println(p);
        }  
}
}
