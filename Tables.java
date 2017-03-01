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
public class Tables {
    int numofseats;
    String type;
    
    public Tables(String typ, int t_numofseats ){
        this.numofseats = t_numofseats;
        this.type = typ;
    }
    
    int getnumofseats(){
        return this.numofseats;
    }
    String gettype(){
        return this.type;
    }
}
