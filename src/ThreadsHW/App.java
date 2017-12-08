/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsHW;

import java.util.Arrays;


/**
 *
 * @author Colin138
 */
public class App {
    String [] args;
    App(String[] _args) {
        args = _args;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        App app = new App(args);
        
        //Thread myThread = new myThread();
        //myThread.start();
        //app.run();
        Runnable date = new DateThread(20000);
        Runnable num = new TestThread(0);
        Thread dThread = new Thread(date);
        Thread nThread = new Thread(num);
        
        dThread.start();
        nThread.start();
        
        
        
        
        
    }
    
   
    
    
    void run() throws Exception {
        System.out.println("args: " + Arrays.toString(args));
    }
}