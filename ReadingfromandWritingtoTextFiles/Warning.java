/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadingfromandWritingtoTextFiles;
import java.util.Scanner; 
import java.io.*; 

/**
 *
 * @author asus
 */
public class Warning {
 // -------------------------------------------------------------------- 
 // Reads student data (name, semester hours, quality points) from a 
 // text file, computes the GPA, then writes data to another file 
 // if the student is placed on academic warning. 
 // -------------------------------------------------------------------- 
 public static void main (String[] args) 
 { 
 int creditHrs; // number of semester hours earned 
 double qualityPts; // number of quality points earned 
 double gpa; // grade point (quality point) average 
 String line, name, inputName = "students.dat"; 
 String outputName = "warning.dat"; 
 
 try 
 { 
  Scanner newFile = new Scanner(new File(inputName));  // Set up scanner to input file 
  PrintWriter outFile = new PrintWriter(outputName);// Set up the output file stream 
  // Print a header to the output file
 
    outFile.println (); 
    outFile.println ("Students on Academic Warning"); 
    outFile.println (); 
    
 // Process the input file, one token at a time 
 while (newFile.hasNext()) 
 { 
    // Get the credit hours and quality points and 
    // determine if the student is on warning. If so, 
    // write the student data to the output file.
    line = newFile.nextLine();
    creditHrs = Integer.parseInt(line.split("\\s+")[1]);
    qualityPts =    Double.parseDouble(line.split("\\s+")[2]);
    gpa = qualityPts/creditHrs;
    if(gpa < 1.5 && creditHrs < 30){
        outFile.printf(line+"\n");
    }else if (gpa < 1.75 && creditHrs < 60){
        outFile.printf(line + "\n");
    } else if (gpa < 2.0){
        outFile.printf(line+"\n");
    }
 } 
    outFile.close();
    newFile.close();
 // Close output file 
 } 
 catch (FileNotFoundException exception) 
 { 
    System.out.println ("The file " + inputName + " was not found."); 
 } 
 catch (IOException exception) 
 { 
    System.out.println (exception); 
 } 
 catch (NumberFormatException e) 
 { 
    System.out.println ("Format error in input file: " + e); 
 } 
 } 

}
