/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import util.checkInput;

/**
 *
 * @author Anh Linh
 */
public class StudentCabinet {

    private ArrayList<Student> StudentList = new ArrayList();
    private Scanner sc = new Scanner(System.in);

    public void addNewStudentEC() {
        String id, name;
        double gpa;
        String schoolyear;
        int pos;
        do {
            id = checkInput.getID("Input student id: ", "The format of id is UITxxxxx", "^[U]IT*[0-9]{5}$");
            pos = searchStudentByID(id);
            if (pos >= 0) {
                System.out.println("This student is already exists");
            }
        } while (pos != -1);
        name = checkInput.getString("Input Student name: ", "Student name is requied!");
        gpa = checkInput.GetADouble("Input Student GPA: ", "Student GPA is from 0.0 to 10.0", 0.0, 10.0);
        schoolyear = checkInput.getSchoolYear("Input student schoolyear: ", "The format of school year is Kxx!", "^[K]*[0-9]{2}$");
        StudentList.add(new E_Commerce(id, name, gpa, schoolyear));
        System.out.println("A student profile is added sucessfully");
    }

    public void addNewStudentIS() {
        String id, name;
        double gpa;
        String schoolyear;
        int pos;
        do {
            id = checkInput.getID("Input student id: ", "The format of id is UITxxxxx", "^[U]IT*[0-9]{5}$");
            pos = searchStudentByID(id);
            if (pos >= 0) {
                System.out.println("This student is already exists");
            }
        } while (pos != -1);
        name = checkInput.getString("Input Student name: ", "Student name is requied!");
        gpa = checkInput.GetADouble("Input Student GPA: ", "Student GPA is from 0.0 to 10.0", 0.0, 10.0);
        schoolyear = checkInput.getSchoolYear("Input student schoolyear: ", "The format of school year is Kxx!", "^[K]*[0-9]{2}$");
        StudentList.add(new InformationSystem(id, name, gpa, schoolyear));
        System.out.println("A student profile is added sucessfully");
    }

    public void addNewStudentTI() {
        String id, name;
        double gpa;
        String schoolyear;
        int pos;
        do {
            id = checkInput.getID("Input student id: ", "The format of id is UITxxxxx", "^[U]IT*[0-9]{5}$");
            pos = searchStudentByID(id);
            if (pos >= 0) {
                System.out.println("This student is already exists");
            }
        } while (pos != -1);
        name = checkInput.getString("Input Student name: ", "Student name is requied!");
        gpa = checkInput.GetADouble("Input Student GPA: ", "Student GPA is from 0.0 to 10.0", 0.0, 10.0);
        schoolyear = checkInput.getSchoolYear("Input student schoolyear: ", "The format of school year is Kxx!", "^[K]*[0-9]{2}$");
        StudentList.add(new TechnologyInformation(id, name, gpa, schoolyear));
        System.out.println("A student profile is added sucessfully");
    }

    public void searchStudentByID() {
        String id = checkInput.getString("Input student id: ", "Student id is required");
        Student x = supportsearchStudentByID(id);
        System.out.println("---------------------");
        if (x == null) {
            System.out.println("Can not found!");
        } else {
            System.out.println("The student information ");
            x.showProfile();
        }
    }

    public int searchStudentByID(String StudentID) {
        int pos;
        if (StudentList.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < StudentList.size(); i++) {
            if (StudentList.get(i).getId().equalsIgnoreCase(StudentID)) {
                return i;
            }
        }
        return -1;
    }

    public Student supportsearchStudentByID(String StudentID) {
        if (StudentList.isEmpty()) {
            return null;
        }
        for (int i = 0; i < StudentList.size(); i++) {
            if (StudentList.get(i).getId().equalsIgnoreCase(StudentID)) {
                return StudentList.get(i);
            }
        }
        return null;
    }

    public void updateStudent() {
        String id;
        String tmpName;
        Student x;
        id = checkInput.getString("Input student id: ", "Student id is requied!");
        x = supportsearchStudentByID(id);
        System.out.println("-----------------");
        if (x == null) {
            System.out.println("Can not found!");
        } else {
            System.out.println("The student you are looking for: ");
            x.showProfile();
            System.out.println("Begging update student name: ");
            tmpName = checkInput.getString("Input Student new name: ", "Name is quired!");
            x.setName(tmpName);
            System.out.println("The student profile is updated sucessfully!");
        }
    }

    public void deleteStudent() {
        String id;
        int pos;
        id = checkInput.getString("Input student id: ", "Student id is requied!");
        pos = searchStudentByID(id);
        System.out.println("----------------");
        if (pos == -1) {
            System.out.println("Can not found!");
        } else {
            StudentList.remove(pos);
            System.out.println("The selected student is removed sucessfully!");
        }
    }

    public void printStudentListAscendingByID() {
        if (StudentList.isEmpty()) {
            System.out.println("Nothing to print!");
            return;
        }
        Collections.sort(StudentList);
        System.out.println("--------------------");
        System.out.println("The student: ");
        String header = String.format("|%8s|%-30s|%-4s|%10s|%-4s|%-20s|\n", "ID", "NAME", "GPA", "SCHOOLYEAR", "FGPA", "MAJOR");
        System.out.println(header);
        for (int i = 0; i < StudentList.size(); i++) {
            StudentList.get(i).showProfile();
        }
    }

    public void printStudentListAscendingByName() {
        if (StudentList.isEmpty()) {
            System.out.println("Nothing to print");
            return;
        }
        Comparator nameBalance = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareToIgnoreCase(s1.getName());
            }
        };
        Collections.sort(StudentList, nameBalance);
        System.out.println("----------------------");
        String header = String.format("|%8s|%-30s|%-4s|%-10s|%-4s|%-20s|\n", "ID", "NAME", "GPA", "SCHOOLYEAR", "FGPA", "MAJOR");
        System.out.println(header);
        for (int i = 0; i < StudentList.size(); i++) {
            StudentList.get(i).showProfile();
            
        }
    }
}
