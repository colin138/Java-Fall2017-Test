/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

/**
 *
 * @author Colin138
 */
public class Student implements Comparable<Student> {
    
    private String name;
    private int age;
    private double gpa;
    
    public Student(String _name, int _age, double _gpa)
    {
        this.name = _name;
        this.age = _age;
        this.gpa = _gpa;
    }
    
    public String getName() {return name;}
    public int getAge() {return age;}
    public double getGpa() {return gpa;}

    @Override
    public int compareTo(Student o) {
        if(this.name != o.name){
            return 0;
        }       
        else if(this.age < o.age){
            return 0;
        }        
        else if(this.gpa != o.gpa){
            return 0;
        }
        else{
            return 1;
        }       
        
            
    }
    
}
