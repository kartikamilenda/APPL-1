/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACurrencyConverter;
import java.awt.*; 
import javax.swing.*; 
/**
 *
 * @author asus
 */
public class CurrencyConverter {
    public static void main (String[] args) 
 {  
        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RatePanel ratePanel = new RatePanel();
        frame.getContentPane().add(ratePanel);
        frame.pack();
        frame.setVisible(true); 
 } 

}
