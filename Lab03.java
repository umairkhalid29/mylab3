/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author umair1
 */
public class Lab03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("WELCOME TO THE ONLINE RESTAURANT RESERVATION SYSTEM\n");
        System.out.print("\n You can now book from time 11 to 22 hours\n");
        
        Customer ICustomer = new Customer("Jon", 23, 786454);
        
        Restaurant IRestaurant = new Restaurant();
        
        Tables newTable = new Tables("EL",12);
        IRestaurant.addTable(newTable, 11);
        
        IRestaurant.makeBooking(ICustomer, 20, 12);
        
        IRestaurant.printBooking();
        
    }
    
}
