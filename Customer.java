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
public class Customer {
    String name;
    long customerId;
    int phoneno;
    
    Customer(String nam, int id, int phone){
        this.name = nam;
        this.customerId = id;
        this.phoneno = phone;
    }
    
    public long getId() { 
        return customerId;
    }
    
    
}
