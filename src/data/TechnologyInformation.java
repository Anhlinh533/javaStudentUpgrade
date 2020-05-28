/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Random;

/**
 *
 * @author Anh Linh
 */
public class TechnologyInformation extends Student{
    private static final double MAX_GPA = 10.0;

    public TechnologyInformation(String id, String name, double gpa, String schoolyear) {
        super(id, name, gpa, schoolyear);
    }   
       
    @Override
    public void showProfile() {
        System.out.printf("|%8s|%-30s|%-2.2f|%10s|%-2.2f|Technology Information|\n",id, name, gpa, schoolyear, caculateFinalGPA());
    }

    @Override
    public double caculateFinalGPA() {
        return new Random().nextDouble() * MAX_GPA;
    }
    
}
