

/**
 *
 * @author jaredwaller
 * 
 */

import java.util.*;
public class StudentMain {

    //IMPORTANT: If a comment confuses you, I am sure there is another comment
    //           somewhere else that maybe clears things up.
    //           I recommend looking at all of the object classes first.
    public static void main(String[] args) {
        
        //Make the scanner
        Scanner in = new Scanner(System.in);
        
        
        //Ask the user for the first name and save it into the String fname
        System.out.print("Enter student first name: ");
        String fname = in.next();
        
        
        //Ask the user for the last name and save it into the String lname
        System.out.print("Enter student last name: ");
        String lname = in.next();
        
        
        //Ask the user for the major and save it into the String major
        System.out.print("Enter student major: ");
        String major = in.next();
        
        
        //take the saved input from the Strings: 'major', 'lname', and 'fname' 
        //and create the student object
        Student s1 = new Student(major, lname, fname);
        
        /*
            Here comes the complicated part. Think of all of these classes as
            a series of rooms. The first room being Student and the last being
            Test. 
        
            Student -> Semester -> Course -> Test
        
            You can't jump to the test room without first going through the
            semester, the course room, and the student room. You can't jump to 
            the semester room without going through the student room and so on.
            
            First, we will ask the user to enter the semester name, something
            like 'Fall 2019'. So to assign that name of 'Fall 2019' to the 
            semester, we must go through the student room first. Saying 's1' is
            like entering the student room. Now we must go into the semester
            room by adding getSemester(). Now that we are in the semester room,
            we have access to all of the semester's functions. We can use all
            of its getters, setters, or custom functions (ours doesn't have
            any custom functions). So let's set the semester's name to what
            the user enters by saying, setName( in.next() ). Easy right?
        */
        System.out.println("Enter the semester name: ");
        s1.getSemester().setName(in.next());
        
        /*
            Let's use the same logic here, but we must go farther into the
            rooms. Go into the student room again with s1. Then go into the
            semester room with getSemester(). Next, we go into the course room
            by using getCourse(). Now, we have access to all of course's
            functions. Let's set the course's name to the user input.
        */
        System.out.println("Enter the course name: ");
        s1.getSemester().getCourse().setName(in.next());
        
        /*
            Now, let's get some test scores for our 3 tests. We will use a for
            loop that is limited to 3 entries because that is how big our
            test array is in the 'Course' class. 
        
            Next, we will set the test scores by going into the student room,
            the semester room, and the course room. We will use the course
            room's custom function of 'setTestScore' to assign the grades
            to the tests in the array. The parameters of 'setTestScore' are
            index and the user input. Since we start the for loop at 0, we will
            look in paper slot 0 first and assign the test in there whatever
            the user enters. We will go to paper slot 1, and paper slot 2.
        
            Side note: The (index+1) in the prompt is just there so that it doesn't 
            say 'Grade #0'. We still start the for loop at 0 because all arrays 
            start at index 0. If you wanted to start the for loop at 1, that is 
            fine, but you would change the (index+1) to just i and then change the 
            setTestScore to setTestScore(index-1, in.nextInt()).
        */
        for(int index = 0; index < 3; index++)
        {
            System.out.print("Enter Grade #" + (index+1) + ": ");
            s1.getSemester().getCourse().setTestScore(index, in.nextInt());
        }
        
        /*
            We will print out the entire student with the same logic that
            we used earlier.
        */
        System.out.println();
        System.out.println("Name: " + s1.getFname() + " " + s1.getLname());        
        System.out.println("Major: " + s1.getMajor());        
        System.out.println("Semester: " + s1.getSemester().getName());
        System.out.println("Course: " + s1.getSemester().getCourse().getName());
        
        /*
            We need this for loop here because of the function in 'Course'.
        */
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Grade #" + (i+1) + ": " + s1.getSemester().getCourse().getTestScore(i));
        }
        
        
        
    }
    
}
