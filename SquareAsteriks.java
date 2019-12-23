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
public class SquareAsteriks {

    public static void main(String... args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        squareOfAsteriks(number);
        
    }

    public static void squareOfAsteriks(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
