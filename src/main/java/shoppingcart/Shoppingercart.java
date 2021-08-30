/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

/**
 *
 * @author Darren
 */
public class Shoppingercart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String custName = "Sally Smith";
        String firstName;
        int spaceIndex;
        
        //get index of the space character " "
        
        spaceIndex = custName.indexOf(" ");
        
        //Use the substring method to locate the first name
        firstName = custName.substring(0, spaceIndex);
        
        System.out.println(firstName);
        
        //instatiate and initialize 
        
        /*
        // Instantiate 2 items objects
        Item item1 = new Item();
        Item item2 = new Item();
        
        //Assign values to fields
        item1.desc = "Shirt";
        item1.itemID = 12345;
        item2.desc = "Trousers";
        item2.itemID = 67891;
        
        //Display items
        System.out.println("Item1: " + item1.desc + " " + item1.itemID);
        System.out.println("Item2: " + item2.desc + " " +  item2.itemID);
        
        //Assign one item to the other
        item1 = item2;
        System.out.println("Item1: " + item1.desc + " " + item1.itemID);
        System.out.println("Item2: " + item2.desc + " " +  item2.itemID);
        */        
        
    }
    
}
