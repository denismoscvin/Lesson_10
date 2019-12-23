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
public class L_10_1 {
    public static void main(String[] arg) {
        int number = 4;
        System.out.println(isPositive(number));
    }
    static boolean isPositive(int numberToCheck) {
        boolean result;
        if (numberToCheck >= 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
