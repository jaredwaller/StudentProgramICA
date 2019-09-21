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

    
    private String major;
    private String lname;
    private String fname;
    private Semester semester = new Semester();
    
    public Student(String major, String lname, String fname) {
        this.lname = lname;
        this.fname = fname;
        this.major = major;
        
        Scanner in = new Scanner(System.in);
    }
    
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
