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
public class AreaParallelogram {

    public static void main(String args[]) {
        System.out.println("Perimetru dreptunghi: " +calculatePerimeter(2,3));
        System.out.println("Perimetru dreptunghi: " +calculateArea(2,3));
       
    }

    static int calculatePerimeter(int length, int width) {
        
        return 2*(length+width);
    }
    
    static double calculateArea(int length, int width){
        return (width*length);
        
    }
     int calculateArea(int sideLength){
        return (sideLength*4);
    }

}
