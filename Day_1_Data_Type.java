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
public class Day_1_Data_Type {
        public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
            int i2;
            double d2;
            String s2;

            

        /* Read and save an integer, double, and String to your variables.*/

            i2=scan.nextInt();
            d2=scan.nextDouble();
            scan.nextLine();
            s2=scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
            System.out.println((i+i2));

        /* Print the sum of the double variables on a new line. */
            System.out.printf("%.1f",(d+d2));
            System.out.println();
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
            System.out.println(s+s2);

        scan.close();
    }
    
}
