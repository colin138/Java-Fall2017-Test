/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsHW;

import java.util.Date;

/**
 *
 * @author Colin138
 */
public class TestThread implements Runnable{
    
    int sleep;
    
    public TestThread (int sleep)
    {
        this.sleep = sleep;
    }
    
    public void run() {
        
        
        
        for (int i = 0; i < 5; ++i) {
            
            double num = Math.random() + 1;
            
             try{
            Thread.sleep(3000);
            }
            catch(InterruptedException e)
            {}
            System.out.println(num);
            
        }
        
       
    }
    
}
