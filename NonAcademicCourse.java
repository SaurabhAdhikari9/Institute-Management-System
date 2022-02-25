   /**
  NonAcadmicCourse is the sup/child class, of course. It accessed the course inside the constructor and called the display method of the course. It holds the information related to the non-academic course, processes it according to the code.
 * 
 * @author Saurabh Adhikari
 * @version CW.0.1
 */
public class NonAcademicCourse extends Course {
    // Instance variable are created with private access.
    private String instructorName, startingDate,completionDate, examDate, prerequisite; //Declaration of String variable.
    private boolean isRegistered, isRemoved; //Declaration of boolean variable.
    
    /**
     * Constructor for objects of class NonAcademicCourse, that initialize the value.
     * @param CourseID an unique id that reflect Course.
     * @param CourseName Name of the Course.
     * @param Duration how long does the course go.
     * @param Prerequisite required as a prior condition.
     */
    public NonAcademicCourse(String CourseID, String CourseName, int Duration, String Prerequisite)
    {
        super(CourseID, CourseName, Duration);              // Assinging the value of Superclass from parameters.
        this.prerequisite = Prerequisite;                  //initialize the value of prerequisite with parameter.
        startingDate = "";                                //initialize the empty value.
        completionDate = "";                             // initialize the empty value.
        examDate = "";                                  //initialize the empty value.
        isRegistered = false;                          // initialize the false boolean value.
        isRemoved = false;                            //initialize the false boolean value.
        
    }
    
    /**
     * Encapsulated getter method is created to get value of InstructorName.
     * @return the value of instructorName.
     */
    public String getInstructorName()
    {
        return instructorName;
    }
    
 
    /**
     * Encapsulated getter method is created to get value of StartingDate.
     * @return the value of startingDate.
     */
    public String getStartingDate()
    {
        return startingDate;
    }
    
    
    /**
     * Encapsulated getter method is created to get value of CompletionDate.
     * @return the value of completionDate.
    */
    public String getCompletionDate()
    {
        return completionDate;
    }
    
    /**
     * Encapsulated getter method is created to get value of ExamDate.
     * @return the value of examDate.
     */
    public String getExamDate()
    {
        return examDate;
    }
    
    /**
     * Encapsulated getter method is created to get value of Prerequisite.
     * @return the value of prerequisite.
     */
    public String getPrerequisite()
    {
        return prerequisite;
    }
    
    /**
     * Encapsulated getter method is created to get value of isRegistered.
     * @return the value of isRegistered.
     */
    public boolean getisRegistered()
    {
        return isRegistered;
    }
    
    /**
     * Encapsulated getter method is created to get value of isRemoved.
     * @return the value of isRemoved.
     */
    public boolean getisRemoved()
    {
        return isRemoved;
    }
    
    /**
     * Encapsulated setter method is created to assign the value of Instructor name.
     * @param newInstructorName set the new value to the instructor name .
     */
    public void setInstructorName(String newInstructorNmae)
    {
        
        //If statement check the value of isRegistered is true or false.
        if (isRegistered == true) { //If isRegistered is true, this block of code is executes
            System.out.println("The nonacademic course has already been registered."); //display "The nonacademic course has already been registered."
            System.out.println("Therefore it is not possible to change the instructor."); //display "Therefore it is not possible to change the instructor."
            
        } 
        else { //If isRegistered is false, this block of code is executes .
            this.instructorName = newInstructorNmae; // assign the value of newInstructorName (parameter) to the instructorName (instance variable).
        
        }
    }
    
    /**
     * register method is created.
     * @param CourseLeaderName Name of course leader.
     * @param InstructorName Name of instructor.
     * @param StartingDate Course starting date.
     * @param CompletionDate Course ending date.
     * @param ExamDate Date for exam.
     */
    public void register (String CourseLeaderName,String InstructorName, String StartingDate, String CompletionDate, String ExamDate)
    {
        
        //if statement check that the value of isRegistered is true or false. 
        if (isRegistered == false) { //If isRegistered is false, the code of this block executes. 
            super.setCourseLeader(CourseLeaderName);
            setInstructorName(InstructorName);          //Assigning the value to the InstructorName(instance variable) from InstructorName (parameter).
            this.startingDate = StartingDate;           //Assigning the value to the startingDate(instance variable) from StartingDate(parameter).
            this.completionDate = CompletionDate;       //Assign the value to the completionDate(instance variable) from CompletionDate(parameter).
            this.examDate = ExamDate;                   //Assigning the value to the examDate(instance variable) from ExamDate.
            this.isRegistered = true;                    //Assigning the false boolean value to the isRegistered .
        } else {//If the isRegistered is true, the code of this block executes. 
            System.out.println("The course has already been registered");      //display "The course has already been registered."
        }
    }
    
    /**
     *  remove method is created to remove the registered courses.
     */
    public void remove()
    {
        
        //If statement check that the value of isRemoved is true or false.
        if (isRemoved == true) {//If isRemoved is true, the code of this block executes. 
            System.out.println("The nonacademic course is already removed."); //display "The non_academic course is already removed."
            
        } else {//If isRemoved is false, the code of this block executes. 
            super.setCourseLeader("");           //Assigning the empty value to the CourseLeader of superclass.
            instructorName = "";                //Assigning the empty value to the instructorName.
            startingDate = "";                 //Assigning the empty value to the startingDate.
            completionDate = "";              //Assigning the empty value to the completionDate.
            examDate = "";                   //Assigning the empty value to the examDate.
            isRegistered = false;           //Assigning the false boolean value to the isRegistered.
            isRemoved = true;              //Assigning the true boolean valur to the isRemoved.
            
        }
    }

    /**
     * display method is created, to display the requireds.
     */
    public void display()
    {
        
        super.display(); //calling display method of superclass.
        
        //If statements checks isRegistered value is true or false.
        if (isRegistered == true) {// if isRegistered is true, the code of this block is executes.
            System.out.println("The instructor name is: "+ instructorName);      //print out the value of instructorName.
            System.out.println("The starting date is: "+startingDate );         //print out the value of startigDate.
            System.out.println("The completion date is: "+ completionDate);    //print out the value of completionDate.
            System.out.println("The exam date is: "+examDate);                //print out the value of examDate.
        }
    }
}
