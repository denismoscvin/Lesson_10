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
public class Shirt {
    public String description;
    public char colorcode;
    public double price;
    boolean setField;
    
    public void setField (String desc, char color, double price){
        this.description=desc;
        this.colorcode='B';
        this.price=222.2d;
    }
}
