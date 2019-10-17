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
class Difference {

    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    int size, max, min;

    void computeDifference() {
        size = elements.length;
        max = elements[0];
        min = elements[0];
        for (int i = 1; i < size; i++) {
            if (max < elements[i]) {
                max = elements[i];
            }
            if (min > elements[i]) {
                min = elements[i];
            }

        }
        maximumDifference = max - min;
    }

}

public class Day_14_Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
