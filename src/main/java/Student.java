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
public class Student {

    //Student Attributes
    private String major;
    private String lname;
    private String fname;
    
    /*
        You will get a NullPointerException if you do not initialize your nested
        object. The nested object in this case is 'Semester'. To initialize it,
        all you have to say is ' = new Semester()'. If you don't do this, the
        computer won't know what semester you are talking about because the
        semester doesn't exist. You have to give it a semester by
        initialzing it.
    
        We are using a default constructor here with ' = new Semester()'.
        Go to the 'Semester' class to read why these are important.
    */
    private Semester semester = new Semester();
    
    //Constructor
    public Student(String major, String lname, String fname) {
        this.lname = lname;
        this.fname = fname;
        this.major = major;
    }
    
    //Default Constructor
    public Student(){}
    
    //Getters and Setters
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public Semester getSemester() {
        return semester;
    }
    public void setSemester(Semester semester) {
        this.semester = semester;
    }
    
}
