/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numbers;

/**
 *
 * @author asus
 */
public class SalesPerson implements Comparable {
    private String firstName, lastName; 
    private int totalSales; 
     //------------------------------------------------------ 
     // Constructor: Sets up the sales person object with 
     // the given data. 
     //------------------------------------------------------ 
     public SalesPerson (String first, String last, int sales) { 
     firstName = first; 
     lastName = last; 
     totalSales = sales; 
     } 
     //------------------------------------------- 
     // Returns the sales person as a string. 
     //------------------------------------------- 
     public String toString() { 
     return lastName + ", " + firstName + ": \t" + totalSales; 
     } 
     //------------------------------------------- 
     // Returns true if the sales people have 
     // the same name. 
     //------------------------------------------- 
     public boolean equals (Object other) { 
     return (lastName.equals(((SalesPerson)other).getLastName())
             && 
     firstName.equals(((SalesPerson)other).getFirstName())); 
     } 
     //-------------------------------------------------- 
     // Order is based on total sales with the name 
     // (last, then first) breaking a tie. 
     //-------------------------------------------------- 
     public int compareTo(Object other) { 
         
     int result = this.totalSales - ((SalesPerson)other).totalSales;
     if (result == 0){
         result = (this.firstName).compareTo(((SalesPerson)other).firstName);
         
         if(result == 0){
             result = (this.lastName).compareTo(((SalesPerson)other).lastName);
         }
     }  
     return result; 
     } 

     //------------------------- 
     // First name accessor. 
     //------------------------- 
     public String getFirstName() { return firstName; 
     } 

     //------------------------- 
     // Last name accessor. 
     //------------------------- 
     public String getLastName() { 
     return lastName; 
     } 
     //------------------------- 
     // Total sales accessor. 
     //------------------------- 
     public int getSales() { 
     return totalSales; 
     } 
}
