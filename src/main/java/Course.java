/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaredwaller
 */
public class Course {
    private String name;
    private Test[] tests = new Test[3];
    
    public Course(String name, Test[] tests)
    {
        this.name = name;
        this.tests = tests;
    }
    
    public Course(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test[] getTests() {
        return tests;
    }

    public void setTests(Test[] tests) {
        this.tests = tests;
    }
    
    public void setTestScore(int i, int score)
    {
        //make new test
        Test test = new Test(score);
        
        //add test to an array of tests
        tests[i] = test;
    }
    
    public int getTestScore(int i)
    {
        return tests[i].getGrade();
    }
}
