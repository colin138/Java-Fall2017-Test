/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.Comparator;

/**
 *
 * @author Colin138
 */
public class school implements Comparator<Student>{
    
    @Override
    public int compare(Student s1, Student s2){
        return s1.getName().compareTo(s2.getName());
    }
    
}
