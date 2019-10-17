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
public class Day_29_Bitwise_And {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            findmax(n, k);
        }

        scanner.close();
    }

    public static void findmax(int n, int k) {
        int max = 0;
        int i, j;

        for (i = 1; i < n; i++) {
            for (j = i + 1; j <= n; j++) {
                int c = i & j;

                if (c > max && c < k - 1) {
                    max = c;
                } else if (c == k - 1) {
                    System.out.println(c);
                    return;
                }

            }

        }
        System.out.println(max);

    }
}
