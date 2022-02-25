/**
 * 
 * AcademicCourse is the subclass of Course. It accesses superclass by using extends. It stores and process information related to Academic Course.
 * @author Saurabh Adhikari
 * @version CW.0.1
 */ 

public class AcademicCourse extends Course
{
    // instance variable are created with private access.
    private String lecturerName, level, credit, startingDate, completionDate;     // decleration of String data type variable.
    private int numberOfAssessments;                                             // decleration of int data type variable.
    private boolean isRegistered;                                               // decleration of boolean data type variable.
    
    /**
     * Constructor for objects of class AcademicCourse, that initialize the value.
     * @param courseID an unique id that reflect Course.
     * @param courseName Name of the Course.
     * @param duration how long does the course go.
     * @param level position of the course.
     * @param credit the number of classroom hours.
     * @param NumberOFAssessments number of assignment given during course.
     * 
     */
    public AcademicCourse(String courseID, String courseName, int duration, String level, String credit,int NumberOFAssessments)
    {
        super(courseID,courseName,duration);        //Assigning parameter courseID, courseName, duration to the intances variable of superclass.
        this.lecturerName = "";                     // initialize the instance variable as empty.         
        this.startingDate ="";                      // initialize the instance variable as empty.
        this.completionDate ="";                    // initialize the instance variable as empty.
        this.isRegistered = false;     // intialize the boolean value as false.
        this.numberOfAssessments = NumberOFAssessments;
        this.level = level;
        this.credit = credit;
    }
    
    /**
     * Encapsulated getter method is created to get value of LecturerName.
     * @return the value of lecturerName.
     */
    public String getLecturerName()
    {
        return lecturerName;
    }
    
    /**
     * Encapsulated getter method is created to get value of Level.
     * @return the value of level.
     */
    public String getLevel()
    {
        return level;
    }
    
    /**
     * Encapsulated getter method is created to get value of Credit.
     * @return the value of credit.
     */
    public String getCredit()
    {
        return credit;
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
    public String getcompletionDate()
    {
        return completionDate;
    }
    
    /**
     * Encapsulated getter method is created to get value of NumberOfAssessments.
     * @return the value of numberOfAssessments.
     */
    public int getNumberOfAssessments ()
    {
        return numberOfAssessments;
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
     * Encapsulated setter method is created to assign the value of LecturerName.
     * @param newlecturerName set the new value to the lecturer name.
     */
    public void setLecturerName( String newlecturerName)
    {
        // Assign the value to the lecturerName from parameter newlecturerName.
        this.lecturerName = newlecturerName;
    }
    
    /**
     * Encapsulated setter method is created to assign the value of NumberOfAssessments.
     * @param newNumberOfAssessments set the new value to the number of assessments.
     */
    public void setNumberOfAssessments( int newNumberOfAssessments)
    {
        this.numberOfAssessments = newNumberOfAssessments;
    }
    
    /**
     * register method is created to register the details of course.
     * @param CourseLeaderName Name of Course Leader.
     * @param Lecturer_Name Name of Lecturer.
     * @param Starting_Date Course startind date.
     * @param Completion_Date Course ending date.
     */
    public void register(String CourseLeaderName, String Lecturer_Name, String Starting_Date, String Completion_Date)
    {
        
        //If statement check that the value of isRegistered is true or false. 
        if (isRegistered == true ) { //If isRegistered is true, this block of code is executes.
            System.out.println("The course leader is "+  Lecturer_Name);      //print out the value of Lecturer_Name.
            System.out.println("The statring date is "+ Starting_Date);       //print out the value of Starting_Date.
            System.out.println("The completion date is "+ Completion_Date);   //print out the value of Completion_Date.
            
        } else{ //If isRegistered is false, this block of code is execute.
    
            super.setCourseLeader(CourseLeaderName);     //set the value of CourseLeader of the superclass from CourseLeaderName.
            this.lecturerName = Lecturer_Name;           //initialize the instance variable (lecturerName) with parameter (Lecturer_Name) value.
            this.startingDate = Starting_Date;           //initialize the instance variable (startingDate) with parameter (Starting_Date) value.
            this.completionDate = Completion_Date;       //initialize the instance variable (completionDate) with parameter (Completion_Date) value.
            this.isRegistered = true;                    //updating the boolean value as true.
             
        }  
    }
    
    /**
     * display method is created, to display the details.
     */
    public void display()
    {
        super.display(); //calling the display method of super class.
        
        // if statement check the value of isRegistered is true or false.
        if (isRegistered == true) {//If isRegistered is true, this block of code is executes.
            System.out.println("The lecturer name is "+ lecturerName);                    // print out the value of lecturerName.
            System.out.println("The level is: "+ level);                                  //print out the value of level.
            System.out.println("The credit hours is "+credit);                            //print out the value of credit.
            System.out.println("The Starting date is "+startingDate);                     //print out the value of startingDate.
            System.out.println("The completion date is "+completionDate);                  //print out the value of completionDate.
            System.out.println("The number of assessments: "+numberOfAssessments);        //print out the value of numberOfAssessments.
            
          }    
    }
   
}

