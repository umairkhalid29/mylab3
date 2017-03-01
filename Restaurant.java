/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author umair1
 */
public class Restaurant {
    HashMap<Long, Booking> TableList;
    ArrayList<Tables>[] tables;
    int MAX_TIME = 1;
    
    
    public void makeBooking(Customer customer, int Stime, int seats) {
        Tables newTable;
        newTable = findTable(Stime, seats);
        
        if(newTable != null) {
            Booking newBooking = new Booking(newTable,customer,Stime);
            long custId = customer.getId();
            TableList.put(custId, newBooking);
            removeTable(newTable, Stime);
        } 
        else {
            System.out.println("No table found!!!");
        }
    }
    public void cancelBooking(Customer customer){
        Booking canBooking = TableList.remove(customer.getId());
        addTable(canBooking.getTable(),canBooking.getTime());
    }
    
    public Tables findTable(int Stime, int seats) {
        ArrayList<Tables> tableList;
        tableList = tables[Stime];
        
        for(Tables tbl : tableList) {
            if(tbl.getnumofseats() >= seats) {
            return tbl;
            }
        }
        return null;
    }
    
    public void removeTable(Tables table, int Stime) {
        int index = Stime;
        tables[index+MAX_TIME].remove(table);
    }
    
    public void addTable(Tables table, int Stime ) {
        int index = Stime;
        tables[index+MAX_TIME].add(table);
    }
 
    public Booking getBooking(Long customerId) { 
        return TableList.get(customerId);
    }
    
    public void printBooking(){
         for(Entry<Long, Booking> entry : TableList.entrySet())
        {   
             System.out.println("Customer ID: " + entry.getKey() + " \t Booking: " +entry.getValue());
        }
    }
}
