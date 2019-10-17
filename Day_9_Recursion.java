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
public class Day_9_Recursion {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        System.out.println(factorial(N));
    }
    public static  int factorial(int N){
        if(N==1||N==0)return 1;
        else return (N*factorial(N-1));
    }
    
}
