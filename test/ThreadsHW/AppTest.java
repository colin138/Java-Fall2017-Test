/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsHW;

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
public class AppTest {
    
    public AppTest() {
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
     * Test of main method, of class App.
     */
    
    @Test
    public void testThread() throws Exception {
        
        Runnable num = new TestThread(0);
        Thread thread = new Thread(num);
        thread.start();
        
        assertTrue(thread.isAlive());
        
    }
    @Test
    public void testThreadCount() throws Exception {
        int tempNum;              
        
        //create lists of threads and see if added one
        Thread[] listThreads = new Thread[Thread.activeCount()];
        
        tempNum = listThreads.length;
        System.out.println(tempNum);
        
        //create a thread
        Runnable num = new TestThread(0);
        Thread thread = new Thread(num);
        thread.start();
        
        listThreads = new Thread[Thread.activeCount()];
        
        System.out.println(listThreads.length);
        assertTrue(listThreads.length > tempNum);
    }   

    /**
     * Test of run method, of class App.
     */
   
    
}
