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
public class DateThread implements Runnable{
    int sleep = 0;
    
   public DateThread (int sleep)
   {
       this.sleep = sleep;
   }
    public void run() {
        
        
        for (int i = 0; i < 5; ++i) {
            
            Date myDate = new Date();
            
            try{
                Thread.sleep(sleep);
            }
            catch(InterruptedException e)
            {}
            System.out.println(myDate);
            
        }
        
       
    }
}
