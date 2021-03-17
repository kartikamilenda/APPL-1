/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applw1;

/**
 *
 * @author asus
 */
public class Commission extends Hourly{
    double totalSales;
    double commisionRates;
    
    public Commission(String eName, String eAddress,
            String ePhone,String socSecNumber,double rate, double eCommisionRates){
        super(eName,eAddress,ePhone,socSecNumber,rate);
        commisionRates = eCommisionRates;
    }
    
    public void addSales(double eTotalSales){
        totalSales = eTotalSales;
    }
    
    public double pay(){
        double payment = super.pay() + (totalSales*commisionRates);
        totalSales = 0;
        return payment;
    }
    
    public String toString(){
        String result = super.toString();
        
        result += "\nTotal Sales : " + totalSales;
        return result;
    }
}
