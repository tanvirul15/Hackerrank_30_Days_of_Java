/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirty_days_of_java;

import java.util.Scanner;

/**
 *
 * @author Tanvir
 */
public class Day_2_Operator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip,tax;
        tip=mealCost*((double)tipPercent/100);
        tax=mealCost*((double)taxPercent/100);
        // cast the result of the rounding operation to an int and save it as totalCost 
        
        int totalCost = (int) Math.round(mealCost+tip+tax);
      
        // Print your result
       System.out.println("The total meal cost is "+totalCost+" dollars.");
    }
    
}
