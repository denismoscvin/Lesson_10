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
public class L_10_8 {

    public static void main(String... args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number:");
        int side = sc.nextInt();
        System.out.println("Introduce character:");
        char fillCharacter = sc.next().charAt(0);
        squareOfAsteriks(side, fillCharacter);
    }

    public static void squareOfAsteriks(int side, char fillCharacter) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(fillCharacter);
            }
            System.out.println(" ");
        }
    }
}
