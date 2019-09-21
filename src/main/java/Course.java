
/**
 *
 * @author jaredwaller
 */
public class Course {
  
    //Course Attributes
    private String name;
    
    /*  Instead of having the tests class have 3 different variables like test1,
    *   test2, and test3, I have created an object array of tests. I feel like
    *   it is a little bit easier to understand if each test object has its own
    *   grade.
    */
    private Test[] tests = new Test[3];
    
    //Constructors
    public Course(){}
    
    public Course(String name, Test[] tests)
    {
        this.name = name;
        this.tests = tests;
    }
    
    /* I made this custom function specifically to use with the array of tests
    *  The parameters are the index in the array and then the score for the
    *  test.
    */
    public void setTestScore(int i, int score)
    {
        /*  Before we set the scores of the tests, we must first make the tests.
        *   When I made the array, I basically made 3 paper slots for the tests
        *   to go in. However, they are empty, so we need to make some tests to
        *   fill them. So we will make a test and use the test class's
        *   constructor - 'Test(score)' - and set the score on the test to the 
        *   score we are given in the parameters of this function.
        */
        Test test = new Test(score);
        
        /*  Next, we must actually put the test we made into the paper slots.
            So we will put them into their respective slots. With this custom
            method, you can also pick up a test from a specific slot and
            re-grade it. So if I wanted to regrade test 2 and give it a grade
            of a 90, all I would type is, setTestScore(1, 90). I use 1 instead
            of 2 because all arrays start at index 0.
        */
        tests[i] = test;
    }
    
    /*  This function asks for the paper slot you want the test from. Asking for
        test 3's grade would be, getTestScore(2). It will go to the paper slot
        2 and pick up the test and read the grade on it.
    */
    public int getTestScore(int i)
    {
        //Go to paper slot 'i' and give us the grade
        return tests[i].getGrade();
    }
    
    //Getters and Setters
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
    
    
}
