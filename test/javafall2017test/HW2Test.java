/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafall2017test;

//import hw2.HW2;

import HW2.HW2;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Colin138
 */
public class HW2Test {
    
    public HW2Test() {
    }
    
   

    /**
     * Test of main method, of class HW2.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        
    }

    /**
     * Test of run method, of class HW2.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        
    }

    /**
     * Test of sovle method, of class HW2.
     */
    @Test
    public void testSovle() {
        System.out.println("sovle");
        
    }

    /**
     * Test of readInput method, of class HW2.
     */
    @Test
    public void testReadInput_Scanner() {
        System.out.println("readInput");
        Scanner in = new Scanner("123");
        HW2 app = new HW2(new String[] {});
        app.readInput(in);
        
        assertEquals(2, app.first);
        assertEquals(1, app.second);
        assertEquals(3, app.last);
        
    }

    /**
     * Test of readInput method, of class HW2.
     */
}
