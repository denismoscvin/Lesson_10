/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_10;

/**
 *
 * @author DENIS
 */
public class L_10_5 {

    public static int integerPower() {
        int power = 0;
        int base = 4;
        int exponent = 5;
        while (exponent > 0) {
            power = power * base;
            exponent--;
        }
        System.out.println("Power: "+power);
        return power;
    }
}
