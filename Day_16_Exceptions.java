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
public class Day_16_Exceptions {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		try{
		int n=Integer.parseInt(s);
		System.out.println(n);}
		catch(Exception e){
			System.out.println("Bad String");
			
		}
		

		sc.close();
	}
}

