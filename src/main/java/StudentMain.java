/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaredwaller
 */

import java.util.*;
public class StudentMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //prompt user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        String fname = in.next();
        
        System.out.print("Enter student last name: ");
        String lname = in.next();
        
        System.out.print("Enter student major: ");
        String major = in.next();
        
        //create student with name and major
        Student s1 = new Student(major, lname, fname);
        
        s1.getSemester().setName("Fall 2019");
        s1.getSemester().getCourse().setName("MIS 321");
        for(int i = 0; i < 3; i++)
        {
            System.out.print("Enter Grade #" + (i+1) + ": ");
            s1.getSemester().getCourse().setTestScore(i, in.nextInt());
        }
        
        System.out.println();
        System.out.println("Name: " + s1.getFname() + " " + s1.getLname());        
        System.out.println("Major: " + s1.getMajor());        
        System.out.println("Semester: " + s1.getSemester().getName());
        System.out.println("Course: " + s1.getSemester().getCourse().getName());
        
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Grade #" + (i+1) + ": " + s1.getSemester().getCourse().getTestScore(i));
        }
        
        
        
    }
    
}
