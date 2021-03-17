/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numbers;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Strings {
    // -------------------------------------------- 
 // Reads in an array of integers, sorts them, 
 // then prints them in sorted order. 
 // -------------------------------------------- 
 public static void main (String[] args) { 
        String[] stringList; 
        int size; 
        
        Scanner scan = new Scanner(System.in); 
        System.out.print ("\nHow many String do you want to sort? "); 
        size = scan.nextInt()+1; 
        stringList = new String[size]; 
        
        System.out.println ("\nEnter the strings..."); 
        for (int i = 0; i < size; i++) 
            stringList[i] = scan.nextLine(); 
        
        Sorting.insertionSort(stringList);
        System.out.println ("\nYour strings in sorted order..."); 
        for (int i = 0; i < size; i++) 
        System.out.print(stringList[i] + " "); 
        System.out.println();
 } 
}
