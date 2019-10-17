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
public class Day_26_Nested_Logic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int d_ac, m_ac, y_ac, d_ex, m_ex, y_ex;

        //Actual Date
        d_ac = sc.nextInt();
        m_ac = sc.nextInt();
        y_ac = sc.nextInt();

        //Expected Date
        d_ex = sc.nextInt();
        m_ex = sc.nextInt();
        y_ex = sc.nextInt();

        if (y_ac < y_ex || (y_ac == y_ex && m_ac < m_ex) || (d_ac == d_ex && m_ac == m_ex && y_ac == y_ex)) {
            System.out.println("0");
        } else if (m_ac == m_ex && y_ac == y_ex) {
            System.out.println(15 * (d_ac - d_ex));
        } else if (y_ac == y_ex) {
            System.out.println(500 * (m_ac - m_ex));
        } else {
            System.out.println("10000");
        }

    }
}
