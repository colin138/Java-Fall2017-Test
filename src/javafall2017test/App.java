package javafall2017test;

import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Colin138
 */
public class App {
    String[] args;
    App(String[] _args){
        args = _args;
    }
    
    
    public static void main(String[] args) throws Exception{
        App app = new App(args);
        app.run();
    }
    
    int h, w, n;
    int[] x;
    
    class Lars {
        boolean annoyed;
        boolean done;
        int nextBrickHeight = 0;
        int nextBrickOffset = 0;
        int nextBrickIndex = 0;
        
        void work(){
            if (annoyed) return;
            
            if (nextBrickIndex >= n) {
                annoyed = true;
                return;
            }
            if (x[nextBrickIndex] + nextBrickOffset > w) {
                annoyed = true;
                return;
            }
            nextBrickOffset += x[nextBrickIndex];
            nextBrickIndex++;
            
            if(nextBrickOffset == w) {
                nextBrickOffset = 0;
                nextBrickHeight += 1;
                if (nextBrickHeight == h) {
                    done = true;
                }
                
            }
        }
        
    }
    
    void readInput(Scanner in) {
        h = in.nextInt();
        w = in.nextInt();
        n = in.nextInt();
        
        if ( h < 1 || h > 100) {
            throw new IllegalStateException("invalid value of h: " +h);
        }
        
        if ( w < 1 || w > 100) {
            throw new IllegalStateException("invalid value of h: " +w);
        }
        
        if ( n < 1 || n > 10_000) {
            throw new IllegalStateException("invalid value of h: " +n);
        }
        
        x = new int[n];
        
        for (int i=0; i<n; ++i){
            x[i]=in.nextInt();
            
            if (x[i] < 1 || x[i] > 10_000) {
            throw new IllegalStateException("invalid value of x[" + i + "]");
            }
        }
    }
    
    void readInput() {
        Scanner in = new Scanner(System.in);
        readInput(in);
    }
    
    boolean completed;
    void solveProblem() {
        Lars lars = new Lars();
        while(!lars.annoyed && !lars.done) {
            lars.work();
        }
        
        completed = lars.done;
        
    }
    
    void writeOutput() {
        System.out.println(completed ? "YES" : "NO");
        
    }
    
    void run() throws Exception {
        System.out.println("args: " + Arrays.toString(args));
    }
    
}
