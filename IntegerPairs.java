/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_10;

import java.util.Scanner;

/**
 *
 * @author DENIS
 */
public class IntegerPairs {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr both numbers!");

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Second number is multiple than first number - " + isMultiple(y, x));
    }

    public static boolean isMultiple(int x, int y) {
        return y % x == 0;
    }
}
