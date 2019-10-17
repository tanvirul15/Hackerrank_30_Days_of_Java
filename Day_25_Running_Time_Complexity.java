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
public class Day_25_Running_Time_Complexity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int number = sc.nextInt();
            prime_check(number);
        }

    }

    static void prime_check(int num) {
        if (num < 2) {
            System.out.println("Not prime");
            return;
        } else if (num == 2) {
            System.out.println("Prime");
            return;
        } else if (num % 2 == 0) {
            System.out.println("Not prime");
            return;
        } else {
            int root = (int) Math.sqrt(num);
            for (int i = 3; i <= root;) {
                if (num % i == 0) {
                    System.out.println("Not prime");
                    return;
                }
                i = i + 2;
            }

        }
        System.out.println("Prime");

    }
}
