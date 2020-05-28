/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentupgrade;

import data.StudentCabinet;
import ui.Menu;

/**
 *
 * @author Anh Linh
 */
public class StudentUpgrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu menu = new Menu("University Of Information");
        menu.addNewOption("1. Add new student EC profile");
        menu.addNewOption("2. Add new student IS profile");
        menu.addNewOption("3. Add new student TI profile");
        menu.addNewOption("4. Search a student profile");
        menu.addNewOption("5. Update a student profile");
        menu.addNewOption("6. Delete a student profile");
        menu.addNewOption("7. Print the student ascending by id");
        menu.addNewOption("8. Print the student ascending by name");
        menu.addNewOption("9. Quit");

        StudentCabinet sl = new StudentCabinet();
        int choice;
        do {
            menu.printMenu();
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    System.out.println("You are preparing to "
                            + "input a new Student E-commerce profile");
                    sl.addNewStudentEC();
                    break;
                case 2:
                    System.out.println("You are preparing to "
                            + "input a new Student Information System profile");
                    sl.addNewStudentIS();
                    break;
                case 3:
                    System.out.println("You are preparing to " + 
                            "input a new Student Technology Information profile");
                    sl.addNewStudentTI();
                    break;
                case 4:
                    System.out.println("You are required to input " 
                            + "a Student id to search");
                    sl.searchStudentByID();
                    break;
                case 5:
                    System.out.println("You are required to input "
                            + "a Student id to update");
                    sl.updateStudent();
                    break;
                case 6:
                    System.out.println("You are required to input "
                            + "a Student id to delete");
                    sl.deleteStudent();
                    break;
                case 7:
                    System.out.println("You are preparing to "
                            + "print the student list ascending by id");
                    sl.printStudentListAscendingByID();
                    break;
                case 8:
                    System.out.println("You are preparing to "
                            + "print the stucent list ascending by name");
                    sl.printStudentListAscendingByName();
                    break;
                case 9:
                    System.out.println("Bye bye, see you next time!");
                    break;                    
            } 
        }while (choice != 9);
    }
}