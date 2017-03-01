/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author umair1
 */
public class RestaurantTest {
    
    public RestaurantTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of makeBooking method, of class Restaurant.
     */
    @Test
    public void testMakeBooking() {
        System.out.println("makeBooking");
        Customer customer = null;
        int Stime = 0;
        int seats = 0;
        Restaurant instance = new Restaurant();
        instance.makeBooking(customer, Stime, seats);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelBooking method, of class Restaurant.
     */
    @Test
    public void testCancelBooking() {
        System.out.println("cancelBooking");
        Customer customer = null;
        Restaurant instance = new Restaurant();
        instance.cancelBooking(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findTable method, of class Restaurant.
     */
    @Test
    public void testFindTable() {
        System.out.println("findTable");
        int Stime = 0;
        int seats = 0;
        Restaurant instance = new Restaurant();
        Tables expResult = null;
        Tables result = instance.findTable(Stime, seats);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTable method, of class Restaurant.
     */
    @Test
    public void testRemoveTable() {
        System.out.println("removeTable");
        Tables table = null;
        int Stime = 0;
        Restaurant instance = new Restaurant();
        instance.removeTable(table, Stime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTable method, of class Restaurant.
     */
    @Test
    public void testAddTable() {
        System.out.println("addTable");
        Tables table = null;
        int Stime = 0;
        Restaurant instance = new Restaurant();
        instance.addTable(table, Stime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooking method, of class Restaurant.
     */
    @Test
    public void testGetBooking() {
        System.out.println("getBooking");
        Long customerId = null;
        Restaurant instance = new Restaurant();
        Booking expResult = null;
        Booking result = instance.getBooking(customerId);
        assertEquals(expResult, result);
    }

    /**
     * Test of printBooking method, of class Restaurant.
     */
    @Test
    public void testPrintBooking() {
        System.out.println("printBooking");
        Restaurant instance = new Restaurant();
        instance.printBooking();
    }
    
}
