
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

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
    
    void arrays(){
        //ArrayList<Student> [] st = new ArrayList<Student>();
        int [] q = new int[5];
        String [] s = new String[10];
        
    }
    
    void myTreeSet(){
        TreeSet ts = new TreeSet();
        //Student st = new Student();
       // ts.add(st);
        
    }
    
    void run(){
        
        //create a new tree set
        
        TreeSet ts = new TreeSet();
        
        ts.add(12);
        ts.add(11);
        ts.add(13);
        ts.add(53);
        
        
        System.out.println(ts);
        sortTree(ts);
        
    }

    void sortTree(TreeSet ts){
        
        ts.add(2);
        ts.add(14);
        ts.add(11);
        System.out.println(ts);
    }

}
