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
    private String name;
    private Course course = new Course();

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
    
    public Semester(String name, Course[] courses)
    {
        this.name = name;
        this.course = course;
        Scanner in = new Scanner(System.in);
        course.setName(in.next());
                
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter student test #" + (i+1) + ": ");
            
            //add next int to a new test
            course.setTestScore(i, in.nextInt());
            
        }
    }
    
    public Semester(){}
    
    
}
