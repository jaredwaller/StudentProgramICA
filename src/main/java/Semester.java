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

public class Semester {
    //Semester Attributes
    private String name;
    
    //Again you must initialize (create) your course object
    private Course course = new Course();
    
    /******IMPORTANT*****
    *  A default constructor for a nested object is super duper important.
    *  This is to create the semester inside the student class
    *  without having to enter values like we did to Student in the
    *  'StudentMain' class. With this, we don't have to assign any value to the 
    *  semester that is initialized inside the student object.
    *  We can just say our student has a semester without saying what the name
    *  is and what the courses are.
    */
    public Semester(){}
    
    public Semester(String name, Course[] courses)
    {
        this.name = name;
        this.course = course;
    }
    

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
        
    
}
