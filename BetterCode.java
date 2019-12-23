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
public class BetterCode {

    public static void main(String[] args) {
        Shirt shirt2 = new Shirt();
        Shirt shirt1 = new Shirt();
        Shirt shirt3 = new Shirt();
        Shirt shirt4 = new Shirt();

        shirt1.setField("Sallor", 'B', 30);
        shirt2.setField("Sweetshirt", 'C', (double) 25.2);
        shirt3.setField("Skull Tee", 'B', 15);
        shirt4.setField("Tropical", 'R', 20);

        System.out.println(shirt1);

    }

}
