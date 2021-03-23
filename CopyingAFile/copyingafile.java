/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CopyingAFile;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class copyingafile {
    
    public static void main(String[] args){
        Scanner newFile = new Scanner(System.in);
        System.out.print("Insert your file : ");
        String inputFile = newFile.next();

        File file = new File(inputFile);
        try{
            Scanner text = new Scanner(file);
            String textfile;
            while(text.hasNextLine()){
            textfile = text.nextLine();
            System.out.println(textfile);
            }
            text.close();
        } catch(FileNotFoundException e){
           System.out.println(inputFile + " File Not Found");
         }
    } 
}
