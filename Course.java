 /** 
 *Course class is a superclass that takes information from parameter and setter/mutator method and displays the output after applying certain conditions.
 * @author Saurabh Adhikari
 * @version CW.0.1
 */
public class Course{
    //Three instace variables are created: courseID, course_name, duration, and courseLeader.
    private String courseID, courseName, courseLeader;
    private int duration;
    
    /**
     * Constructor for objects of class Course, that initialize the value.
     * @param course_ID an unique id that reflect Course.
     * @param course_name Name of the Course.
     * @param duration how long does the course go.
     */
    public Course(String course_ID, String course_name, int duration)
    {
        //initialize instances varibale with parameters.
        this.courseID = course_ID;         // Assigning the value of courseID(instance variable) from course_ID (parameter).
        this.courseName = course_name;    // Assigning the value of courseName(instance variable) from course_name (parameter).
        this.duration = duration;        // Assigning the value of duratio(instance variable) from duratio (parameter).
        this.courseLeader = "";         // Assigning the value of courseID(instance variable) as empty.
       
    }
    
    
    /**
     * Encapsulated getter method is created to get value of courseID.
     * @return the value of courseID.
     */
    public String getCourseID()
    {
        return courseID;
    }
    
    /**
     * Encapsulated getter method is created to get value of course_name.
     * @return the value od CourseName.
     */
    public String getCourseName()
    {
        return courseName;
    }
    
    /**
     * Encapsulated getter method is created to get value of duration.
     * @return Duration.
     */public int getDuration()
    {
        return duration;
    }
    
    /**
     * Encapsulated getter method is created to get value of courseLeader.
     * @return courseLeader.
     */public String getCourseLeader()
    {
        return courseLeader;
    }
    
    /**
     * Encapsulated setter method is created to assign the value of courseLeader.
     * @param newcourseLeader set the new value to the course leader.
     */
    public void setCourseLeader(String newcourseLeader)
    {
        //asigning the value to the courseLeader with parameter newcourseLeader.
        this.courseLeader = newcourseLeader;
    }


    
    /**
     * display method is created to display the value.
     */
    public void display()
    {
        System.out.println("The course ID  is "+courseID+".");                 //print out the value of courseID.
        System.out.println("The course name is "+courseName+".");             //print out the value of courseName.
        System.out.println("Duration of the course "+duration+" months.");   //print out the value of duration.
        // if statement check the value of courseLeader is empty or not.
        if (courseLeader.length() != 0) {
          System.out.println("The courseLeader is "+ courseLeader+"."); //Print out the value of coursLeader only if course Leader is no empty.
        
        }
    }
}