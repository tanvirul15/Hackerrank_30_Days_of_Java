/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirty_days_of_java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tanvir
 */
public class Day_28_Regex {
    
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        ArrayList<String> ar=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        Pattern p=Pattern.compile("@gmail.com");
        
        
        for(int i=0;i<n;i++){
        	String s=sc.nextLine();
        	String temp[]=s.split(" ");
        	Matcher m=p.matcher(temp[1]);
        	if(m.find())ar.add(temp[0]);
        }
        ar.sort(null);
        
        for(String t: ar){
        	
        	System.out.println(t);
        }
       
    }
}
