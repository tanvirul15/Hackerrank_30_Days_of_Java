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
public class Day_6_Lets_Review {
     public static void main(String[] args) {
       
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
         
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        int i=0;
        int j;
        String s[]=new String[n];
        for (i=0;i<n;i++){
            s[i]=input.nextLine();
           
        }
        for(i=0;i<n;i++){
            for(j=0;j<s[i].length();j++){
            	if(j%2==0){
            		System.out.print(s[i].charAt(j));
            	}
            }
            System.out.print(" ");
            for(j=0;j<s[i].length();j++){
            	if(j%2==1){
            		System.out.print(s[i].charAt(j));
            	}
            }
            System.out.println("");
            
        }
        
    }
    
}
