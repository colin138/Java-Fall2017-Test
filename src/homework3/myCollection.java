
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Colin138
 */

public class myCollection {
    String[] args;
    myCollection(String[] _args){
        args = _args;
    }

    
    
    
    
    public static void main(String[] args) throws Exception{
        myCollection app = new myCollection(args);
        app.run();
        
    }
    
       
       
    void run(){
        
        //create a new tree set
        
        TreeSet<Student> ts = new TreeSet<Student>(new school());
        
        ts.add(new Student("todd", 32, 4.0));
        ts.add(new Student("bob", 19, 2.0));
        ts.add(new Student("sally", 27, 3.0));
        ts.add(new Student("mary", 23, 2.7));
        
        
        
        for(Student e:ts)
        {
            System.out.println(e);
        }
        
            
    }

    
}
