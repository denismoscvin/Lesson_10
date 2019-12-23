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
public class ConversionTemperature {

    public static void main(String args[]) {

        double c, f;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 or 2 for choice!\n1.Fahrenheit to Celsius.\n2.Celsius to Fahrenheit.\n Choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Enter  Fahrenheit temperature!");
                f = sc.nextDouble();
                c = (f - 32) * 5 / 9;
                System.out.println("Celsius temperature is = " + c);
                break;

            case 2:
                System.out.println("Enter Celsius temperature!");
                c = sc.nextDouble();
                f = ((9 * c) / 5) + 32;
                System.out.println("Fahrenheit temperature is " + f);
                break;
        }
    }
}
