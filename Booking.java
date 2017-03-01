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
public class Booking {
    String name;
    long ReservationId;
    Tables table;
    Customer customer;
    int S_time;
    
    public Booking(Tables table, Customer customer, int Stime) {
        this.table = table;
        this.customer = customer;
        this.S_time = Stime;
        }

    public Tables getTable() {
        return table;
    }
    
    public int getTime() { 
        return S_time;
    }
    public Customer getCustomer(){
        return customer;
    }
}
