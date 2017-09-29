/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW2;

import java.util.Scanner;

/**
 *
 * @author Colin138
 */
public class HW2 {
    String[] args;
    HW2(String[] _args){
        args = _args;
    }
    
    
    
    
    public static void main(String[] args) throws Exception{
        HW2 app = new HW2(args);
        app.run();
        
    }
    
    String  output = "-1";
    int second, first, last,  temp = 0;
    
    public void run() {
        
       
        readInput();
    }
    
    
    void sovle(){
        
                
        
        if (second > first){
            
            temp = first;
            first = second;
            second = temp;
            
            
            if (first > last && last != 0){
                temp = first;
                first = last;
                last = temp;
            }
        }else if(last > first){
            temp = first;
            first = last;
            last = temp;
            
            if (first > second && second != 0){
                temp = first;
                first = second;
                second = temp;
            }
        }else{
                output = "0";
                System.out.println(output);
                return;
                
            }
            
         output = Integer.toString(first) + Integer.toString(second) + Integer.toString(last);
            
        
        
        System.out.println(output);
        
        
    }
    void readInput(Scanner in) {
        String s;
        s = in.nextLine();
        
        first = Integer.parseInt(s.substring(0,1));
        second = Integer.parseInt(s.substring(1,2));
        last = Integer.parseInt(s.substring(2,3));
        
        
        sovle();
        
       
    }
    
    void readInput() {
        Scanner in = new Scanner(System.in);
        readInput(in);
    }
    
}
