/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirty_days_of_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Tanvir
 */
public class Day_8_Dictionaries_and_Maps {
    public static void main(String []argh){
        Map<String,Integer>myMap=new HashMap<String,Integer>();
        //Map< String,Integer> hm = new HashMap< String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            myMap.put(name, phone);
            // Write code here
           // Scanner onput=new Scanner(System.in)
        }
        
        while(in.hasNext()){
            
            
            String s = in.next();
            Integer num=myMap.get(s);
       
            try {
				if(num==null){
					 System.out.println("Not found");
				}
				else{
					
				System.out.println(s+"="+myMap.get(s));
				}
			} catch (Exception e) {
				System.out.println("Exception Occure: "+e);
			}
            
        }
        in.close();
    }
    
}
