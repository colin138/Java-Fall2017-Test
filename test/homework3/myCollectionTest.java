/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import homework3.Student;
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
public class myCollectionTest {
    
    public myCollectionTest() {
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
     * Test of main method, of class myCollection.
     */
    

    /**
     * Test of run method, of class myCollection.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        //myCollection app = new myCollection(args);
        //app.run();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testStudent(){
        Student st = new Student("bob", 21, 2.5);
        
        System.out.println(st.getName() + " " + st.getAge() + " " + st.getGpa());
              
    }
    
    @Test
    public void testCompare(){
        Student st = new Student("bob", 21, 2.5);
        Student st1 = new Student("sally", 24, 3.5);
        boolean isEqual = true;
                        
        if(st.compareTo(st1) == 0)
        {
            isEqual = false;
        }
        assertFalse(isEqual);
    }        
    
    
}