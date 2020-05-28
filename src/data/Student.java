/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Anh Linh
 */
public abstract class Student implements Comparable<Student>{
    protected String id;
    protected String name;
    protected double gpa;
    protected String schoolyear;

    public Student(String id, String name, double gpa, String schoolyear) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.schoolyear = schoolyear;
    }

     

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getSchoolyear() {
        return schoolyear;
    }

    public void setSchoolyear(String schoolyear) {
        this.schoolyear = schoolyear;
    }
          
    public abstract void showProfile();
    
    public abstract double caculateFinalGPA();
    
    @Override
    public int compareTo(Student that){
        return this.id.compareToIgnoreCase(that.id);
    }
}
