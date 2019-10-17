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
public class Day_10_Binary_Numbers {
    static int [] stack=new int[20];
	static int top=-1;
	
	

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner input=new Scanner(System.in);
    	int n=input.nextInt();
    	int remainder=0;
    	while(n>0){
    		remainder=n%2;
    		push(remainder);
    		n=n/2;
    		
    	}
    	
    	int num;
    	int max=0;
    	int flag=0;
    	
    	num=pop();
    	while(num>=-1){
    	
    		
    		
    		if(num==1){
    		
    			
    			flag++;
    			    			if(max<flag){
    				
    			
    			max=flag;
    			}
    		
    		}
    		else {
    			if(max<flag){
    				
    			
    			max=flag;
    			}
    			flag=0;
    			
    		}
    		num=pop();
    	}
    	System.out.println(max);
    	
    }
    static void push(int n){
    	++top;
    	stack[top]=n;
    	
    }
    public static int pop(){
    	int temp;
    	if(top>=0){
    		temp=stack[top];
    		top--;
    	return temp;
    	}
    	else return -10;
    }
    
}
