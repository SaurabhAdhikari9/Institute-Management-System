/**
 *INGCollege is created to form an interactive GUI.
 *@author (Saurabh Adhikari)
 *@version CW.1.1
 *@London met ID (20049033)
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Iterator;

import java.awt.FlowLayout;
public class INGCollege extends JFrame implements ActionListener{
    //Declaring JFrame
    public JFrame frame;

    //Declaring Panel
    public JPanel Homepage;
    public JPanel pan_Academic;
    public JPanel pan_nonAcademic;

    public JPanel Academic_title_pan;
    public JPanel Non_academic_title_pan;

    //Declaring Menu bar  
    public JMenuBar Bar;

    //Declaring Menu 
    public JMenu Menu;
    public JMenu About;
    public JMenu Help;

    //Declaring Menu item
    public JMenuItem Home;

    //Declaring Sub menus
    public JMenu Academic_menu;
    public JMenu Non_academic_menu;

    //Declaring sub items of non-academic 
    public JMenuItem Open_non;
    public JMenuItem Add_non;
    public JMenuItem Display_non;

    //Declaring sub items of academic 
    public JMenuItem Open_aca;
    public JMenuItem Add_aca;
    public JMenuItem Display_aca;

    //Declaring JLabel for Academic Course Only
    public JLabel LecturerName;
    public JLabel Level;
    public JLabel Credit;
    public JLabel NumberOfAssessments;

    //Declaring JLabel for NonAcademic Course Only
    public JLabel InstructorName;
    public JLabel ExamDate;
    public JLabel Prerequisite;
    public JLabel non_CourseID;
    public JLabel non_CourseName;
    public JLabel non_Duration;
    public JLabel non_StartDate;
    public JLabel non_CompletionDate;
    public JLabel non_CourseLeader;

    //Declaring JLabel for Academic Course 
    public JLabel CourseID;
    public JLabel CourseName;
    public JLabel Duration;
    public JLabel StartDate;
    public JLabel CompletionDate;
    public JLabel CourseLeader_aca;
    public JLabel Academic_title;
    public JLabel Non_Academic_title;

    //Declaring TextField for Academic Course
    public JTextField txt_CourseID;
    public JTextField txt_CourseName;
    public JTextField txt_Duration;
    public JTextField txt_LecturerName;
    public JTextField txt_Level;
    public JTextField txt_Credit;
    public JTextField txt_NumberOfAssessments;
    public JTextField txt_StartDate;
    public JTextField txt_CompletionDate;
    public JTextField txt_CourseLeader;

    //Declaring TextField for Non-Academic Course
    public JTextField txt_non_CourseID;
    public JTextField txt_non_CourseName; 
    public JTextField txt_non_Duration;
    public JTextField txt_non_StartDate;
    public JTextField txt_non_CompletionDate;
    public JTextField txt_non_InstructorName;
    public JTextField txt_non_ExamDate;
    public JTextField txt_non_Prerequisite;
    public JTextField txt_non_CourseLeader;

    //items of home page 
    public JLabel Title;
    public JButton Button_Academic;
    public JButton Button_nonAcademic;

    //Buttons of Academic course form:
    public JButton ADD_academic, Register_academic, Clear_academic, Display_academic;

    public JButton Go_nonacademic;

    //Buttons of Non-Academic course form:
    public JButton ADD_nonacademic;
    public JButton Register_nonacademic;
    public JButton Clear_nonacademic;
    public JButton Display_nonacademic;
    public JButton Remove_nonacademic;
    public JButton Go_academic;

    //creating arrylist:
    public ArrayList<Course> Academic_list = new ArrayList<Course>();
    public ArrayList<Course> Non_Academic_list = new ArrayList<Course>();
    
    INGCollege(){
        //creating object of JFrame
        frame = new JFrame("Course Registration");

        //Creating Object of Panel
        Homepage        = new JPanel();
        pan_Academic    = new JPanel();
        pan_nonAcademic = new JPanel();

        Academic_title_pan = new JPanel();
        Non_academic_title_pan = new JPanel();

        //Font styling
        Font Heading = new Font("Arial", Font.BOLD,50);
        Font label  = new Font("Arial",Font.BOLD,30);
        Font button = new Font("Arial",Font.BOLD,22);
        Font text = new Font("Arial",Font.PLAIN,18);
        Font small = new Font("Arial",Font.PLAIN,14);

        //Creating object of menus:
        Bar = new JMenuBar();
        Menu = new JMenu("Menu");
        About = new JMenu("About");
        Help = new JMenu ("Help");

        //Creating object of sub menus:
        Academic_menu = new JMenu("Academic");
        Non_academic_menu = new JMenu("Non-Academic");
        Home = new JMenuItem("Home");

        //Creating object of sub menu for help menu :
        JMenu help_aca = new JMenu("Academic");
        JMenu help_non = new JMenu("Non-Academic");

        //Creating object of sub menu items of non-academic
        Open_non = new JMenuItem("Open");
        Add_non = new JMenuItem("Add");
        Display_non = new JMenuItem("Display");

        //Creating object of sub menu items of academic:
        Open_aca = new JMenuItem("Open");
        Add_aca = new JMenuItem("Add");
        Display_aca = new JMenuItem("Display");

        //Content of help menu:
        JLabel help_add = new JLabel("<Html> &ensp; ADD:<br> &emsp; Add button requires Course ID,<br> &emsp; Course Name, Duration, Level,<br> &emsp; Credit & Number of Assessments. &ensp;");
        JLabel help_regis = new JLabel("<Html>&ensp; Register:<br> &emsp; All fields must be filled out before <br> &emsp; clicking the Register button.");
        JLabel help_add_non = new JLabel("<Html> &ensp; ADD: <br> &emsp; Add button requires Course ID,<br> &emsp; Course Name, Duration & Prerequisite. &emsp;");
        JLabel help_reg_non = new JLabel("<Html>&ensp; Register:<br> &emsp; All fields must be filled out before <br> &emsp; clicking the Register button. ");

        //Content of the about menu
        JLabel about_content = new JLabel("<Html> &ensp; Islington College assigns this <br> &ensp; assignment to students in the <br> &ensp; second semester of the 2021 <br> &ensp; batch via the programming<br> &ensp; module. This coursework has a <br> &ensp; grade of 100 and counts for 30% &ensp; <br> &ensp; of the total module marks.");

        //Adding content to the about menu
        About.add(about_content);

        //Adding to help menu item:
        help_aca.add(help_add);
        help_aca.addSeparator();
        help_aca.add(help_regis);
        help_non.add(help_add_non);
        help_non.addSeparator();
        help_non.add(help_reg_non);
        Help.add(help_aca);
        Help.add(help_non);

        //Adding subitems in non-academic:
        Non_academic_menu.add(Open_non);
        Non_academic_menu.add(Add_non);
        Non_academic_menu.add(Display_non);

        //Adding subitems in academic:
        Academic_menu.add(Open_aca);
        Academic_menu.add(Add_aca);
        Academic_menu.add(Display_aca);

        //adding items to the Menu:
        Menu.add(Home);
        Menu.add(Academic_menu);
        Menu.add(Non_academic_menu);

        Bar.add(Menu);
        Bar.add(About);
        Bar.add(Help);

        ImageIcon icon = new ImageIcon("logo.png");
        JLabel logo = new JLabel(icon);

        //content of home page
        String a = "<html>Hello! <br> Welcome to the Registration form<br> Of Islington College.<br><br> Please Choose the type of Course:";
        Title = new JLabel(a, SwingConstants.RIGHT);
        JLabel powered = new JLabel(" \u00a9 2021-2022 CW. Powered by Saurabh Adhikari - Islington College");

        //Font sizing of the elements of panel title
        Title.setFont(label);

        //Creating object of JButton for home page:
        Button_Academic    = new JButton("Academic Course");
        Button_nonAcademic = new JButton("Non-Academic Course");

        //adding elements to the home page :
        Homepage.add(Title);
        Homepage.add(Button_Academic);
        Homepage.add(Button_nonAcademic);
        Homepage.add(logo);
        Homepage.add(powered);

        //Font sizing of button of home page:
        Button_Academic.setFont(button);
        Button_nonAcademic.setFont(button);

        //Creating Object of JLabel of "Academic course":
        CourseID         = new JLabel("Course ID: ");
        CourseName       = new JLabel("Course Name: ");
        Duration         = new JLabel("Duration: ");
        StartDate        = new JLabel("Starting Date: ");
        CompletionDate   = new JLabel("Completion Date: ");
        CourseLeader_aca = new JLabel("Course Leader:");
        LecturerName        = new JLabel("Lecturer Name: ");
        Level               = new JLabel("Level: ");
        Credit              = new JLabel("Credit: ");
        NumberOfAssessments = new JLabel("Number Of Assessments: ");
        Academic_title      = new JLabel("Academic Course ");

        //Creating object of JText field of "Academic Course":
        txt_CourseID            = new JTextField();
        txt_CourseName          = new JTextField();
        txt_Duration            = new JTextField();
        txt_LecturerName        = new JTextField();
        txt_Level               = new JTextField();
        txt_Credit              = new JTextField();
        txt_NumberOfAssessments = new JTextField();
        txt_StartDate           = new JTextField();
        txt_CompletionDate      = new JTextField();
        txt_CourseLeader        = new JTextField();

        //Creating object of JButton of "Academic Course" :
        ADD_academic      = new JButton("ADD");
        Clear_academic    = new JButton("Clear");
        Register_academic = new JButton("Register");
        Display_academic  = new JButton("Display");
        Go_nonacademic    = new JButton("Go to Non-Academic");

        //Font sizing of button of "Academic Course":
        ADD_academic.setFont(button);
        Clear_academic.setFont(button);
        Register_academic.setFont(button);
        Display_academic.setFont(button);
        Go_nonacademic.setFont(button);

        //Font sizing of the elements of panel (Academic):
        CourseID.setFont(label);
        CourseName.setFont(label);
        Duration.setFont(label);
        StartDate.setFont(label);
        CompletionDate.setFont(label);
        CourseLeader_aca.setFont(label);

        powered.setFont(small);
        //Font Sizing of the elements of panel (Academic Course):
        Academic_title.setFont(Heading);
        LecturerName.setFont(label);
        Level.setFont(label);
        Credit.setFont(label);
        NumberOfAssessments.setFont(label);

        //Font sizing of the text field of academic course:
        txt_CourseID.setFont(text);
        txt_CourseName.setFont(text);
        txt_Duration.setFont(text);
        txt_Credit.setFont(text);
        txt_Level.setFont(text);
        txt_CompletionDate.setFont(text);
        txt_StartDate.setFont(text);
        txt_CourseLeader.setFont(text);
        txt_NumberOfAssessments.setFont(text);
        txt_LecturerName.setFont(text);

        //adding items in Panel (pan_Academic)
        pan_Academic.add(CourseID); 
        pan_Academic.add(CourseName);
        pan_Academic.add(Duration);
        pan_Academic.add(LecturerName);
        pan_Academic.add(Level);
        pan_Academic.add(Credit);
        pan_Academic.add(NumberOfAssessments);
        pan_Academic.add(StartDate);
        pan_Academic.add(CompletionDate);
        pan_Academic.add(CourseLeader_aca);
        Academic_title_pan.add(Academic_title);

        pan_Academic.add(txt_CourseID);
        pan_Academic.add(txt_CourseName);
        pan_Academic.add(txt_Duration);
        pan_Academic.add(txt_LecturerName);
        pan_Academic.add(txt_Level);
        pan_Academic.add(txt_Credit);
        pan_Academic.add(txt_NumberOfAssessments);
        pan_Academic.add(txt_StartDate);
        pan_Academic.add(txt_CompletionDate);
        pan_Academic.add(txt_CourseLeader);

        pan_Academic.add(ADD_academic);
        pan_Academic.add(Clear_academic);
        pan_Academic.add(Register_academic);
        pan_Academic.add(Display_academic);
        pan_Academic.add(Go_nonacademic);

        pan_Academic.add(Academic_title_pan);

        //Creating Object of JLabel of "Non-Academic course":
        non_CourseID       = new JLabel("Course ID: ");
        non_CourseName     = new JLabel("Course Name: ");
        non_Duration       = new JLabel("Duration: ");
        non_StartDate      = new JLabel("Starting Date: ");
        non_CompletionDate = new JLabel("Completion Date: ");
        non_CourseLeader   = new JLabel("Course Leader:");
        InstructorName     = new JLabel("Instructor Name:");
        ExamDate           = new JLabel("Exam Date:");
        Prerequisite       = new JLabel("Prerequisite:");
        Non_Academic_title = new JLabel("Non-Academic Course");

        //Creating object of JText field for "Non-Academic Course":
        txt_non_CourseID       = new JTextField();
        txt_non_CourseName     = new JTextField();
        txt_non_Duration       = new JTextField();
        txt_non_ExamDate       = new JTextField();
        txt_non_StartDate      = new JTextField();
        txt_non_CompletionDate = new JTextField();
        txt_non_InstructorName = new JTextField();
        txt_non_Prerequisite   = new JTextField();
        txt_non_CourseLeader   = new JTextField();

        //Creating object of JButton of "Non-Academic Course":
        ADD_nonacademic      = new JButton("ADD");
        Register_nonacademic = new JButton("Register");
        Clear_nonacademic    = new JButton("Clear");
        Display_nonacademic  = new JButton("Display");
        Go_academic          = new JButton("Go to Academic");
        Remove_nonacademic   = new JButton("Remove");

        //Font sizing of button of Non-Academic page:
        ADD_nonacademic.setFont(button);
        Register_nonacademic.setFont(button);
        Clear_nonacademic.setFont(button);
        Display_nonacademic.setFont(button);
        Go_academic.setFont(button);
        Remove_nonacademic.setFont(button);

        //Font sizing of the elements of panel (Non-Academic):
        non_CourseID.setFont(label);
        non_CourseName.setFont(label);
        non_Duration.setFont(label);
        non_StartDate.setFont(label);
        non_CompletionDate.setFont(label);
        non_CourseLeader.setFont(label);

        //Font sizing of the element of panel (Non-Academic):
        Non_Academic_title.setFont(Heading);
        InstructorName.setFont(label);
        ExamDate.setFont(label);
        Prerequisite.setFont(label);

        //Font sizing of the elements of Non-Academic course:
        txt_non_CourseID.setFont(text);
        txt_non_CourseName.setFont(text);
        txt_non_Duration.setFont(text);
        txt_non_Prerequisite.setFont(text);
        txt_non_StartDate.setFont(text);
        txt_non_CompletionDate.setFont(text);
        txt_non_CompletionDate.setFont(text);
        txt_non_ExamDate.setFont(text);
        txt_non_InstructorName.setFont(text);
        txt_non_CourseLeader.setFont(text);

        //adding items in panel (Non-Academic Course):
        pan_nonAcademic.add(non_CourseID);
        pan_nonAcademic.add(non_CourseName);
        pan_nonAcademic.add(non_Duration);
        pan_nonAcademic.add(non_CompletionDate);
        pan_nonAcademic.add(non_StartDate);
        pan_nonAcademic.add(InstructorName);
        pan_nonAcademic.add(ExamDate);
        pan_nonAcademic.add(Prerequisite);
        pan_nonAcademic.add(non_CourseLeader);
        Non_academic_title_pan.add(Non_Academic_title);

        pan_nonAcademic.add(txt_non_CourseID);
        pan_nonAcademic.add(txt_non_CourseName);
        pan_nonAcademic.add(txt_non_Duration);
        pan_nonAcademic.add(txt_non_CompletionDate);
        pan_nonAcademic.add(txt_non_StartDate);
        pan_nonAcademic.add(txt_non_InstructorName);
        pan_nonAcademic.add(txt_non_ExamDate);
        pan_nonAcademic.add(txt_non_Prerequisite);
        pan_nonAcademic.add(txt_non_CourseLeader);

        pan_nonAcademic.add(ADD_nonacademic);
        pan_nonAcademic.add(Clear_nonacademic);
        pan_nonAcademic.add(Register_nonacademic);
        pan_nonAcademic.add(Display_nonacademic);
        pan_nonAcademic.add(Go_academic);
        pan_nonAcademic.add(Remove_nonacademic);
        pan_nonAcademic.add(Non_academic_title_pan);

        //using addActionLister to take action while clicking the button.
        Button_Academic.addActionListener(this);
        Button_nonAcademic.addActionListener(this);
        ADD_academic.addActionListener(this);
        Clear_academic.addActionListener(this);
        Register_academic.addActionListener(this);
        Go_nonacademic.addActionListener(this);
        ADD_nonacademic.addActionListener(this);
        Register_nonacademic.addActionListener(this);
        Display_nonacademic.addActionListener(this);
        Go_academic.addActionListener(this);
        Home.addActionListener(this);
        Open_aca.addActionListener(this);
        Add_aca.addActionListener(this);
        Display_aca.addActionListener(this);
        Display_academic.addActionListener(this);
        Open_non.addActionListener(this);
        Add_non.addActionListener(this);
        Display_non.addActionListener(this);
        
        Clear_nonacademic.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                        int answer = JOptionPane.showConfirmDialog(frame,"Are you sure?","Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (answer == JOptionPane.YES_OPTION){
                            CLEAR_Nonacademic();
                        }

                        
                }
            });


        Remove_nonacademic.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent y){
                    if(txt_non_CourseID.getText().isEmpty()){
                        JOptionPane.showMessageDialog(frame,"Please enter the Course ID.","Alert",JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    String courseid = txt_non_CourseID.getText();
                    Iterator<Course> itr = Non_Academic_list.iterator();
                    while(itr.hasNext()){
                        NonAcademicCourse ac = (NonAcademicCourse)itr.next();
                        if(courseid.equals(ac.getCourseID())){
                            if(ac.getisRemoved()== false){
                                ac.remove();
                                Non_Academic_list.remove(ac);
                                JOptionPane.showMessageDialog(frame,"Course is removed Successfully ");
                                return;
                            }
                        }
                    } 
                    JOptionPane.showMessageDialog(frame,"Course is already removed");
                    return;

                }

            });
        

        Title.setBounds(0,50,900,400);
        Button_Academic.setBounds(400,370,230,40);
        Button_nonAcademic.setBounds(640,370,280,40);
        powered.setBounds(400,500,600,40);
        
        //Setting size and location of pan_Academic elements
        CourseID.setBounds(50,180,180,30);
        CourseName.setBounds(50,255,250,30);
        Duration.setBounds(50,320,250,30);
        Level.setBounds(50,390,250,30);
        Credit.setBounds(50,455,180,30);

        StartDate.setBounds(650,180,220,30);
        CompletionDate.setBounds(650,255,270,30);
        CourseLeader_aca.setBounds(650,320,250,30);
        LecturerName.setBounds(650,390,250,30);
        NumberOfAssessments.setBounds(650,455,390,30);

        txt_CourseID.setBounds(290,180,240,40);
        txt_CourseName.setBounds(290,255,240,40);
        txt_Duration.setBounds(290,320,240,40);
        txt_Level.setBounds(290,390,240,40);
        txt_Credit.setBounds(290,455,240,40);

        txt_StartDate.setBounds(920,180,270,40);
        txt_CompletionDate.setBounds(920,255,270,40);
        txt_CourseLeader.setBounds(920,320,270,40);
        txt_LecturerName.setBounds(920,390,270,40);
        txt_NumberOfAssessments.setBounds(1030,455,160,40);     

        ADD_academic.setBounds(230,550,180,40);
        Register_academic.setBounds(430,550,180,40);
        Clear_academic.setBounds(620,550,180,40);
        Display_academic.setBounds(810,550,180,40);

        Go_nonacademic.setBounds(30,660,300,40);
        Go_academic.setBounds(30,660,230,40);

        //Setting size and location of Panels
        Homepage.setBounds(0,0,1240,1000);
        pan_Academic.setBounds(0,0,1240,1000);
        pan_nonAcademic.setBounds(0,0,1240,1000);
        logo.setBounds(50,50,150,150);

        //Setting size and location of Non-Academic elements:
        Non_Academic_title.setBounds(180,100,700,40);
        non_CourseID.setBounds(50,220,180,25);
        non_CourseName.setBounds(50,285,250,25);
        non_Duration.setBounds(50,350,390,30);
        non_StartDate.setBounds(670,220,230,30);
        non_CompletionDate.setBounds(670,285,270,30);
        ExamDate.setBounds(670,350,250,25);
        InstructorName.setBounds(670,420,250,25);
        Prerequisite.setBounds(50,420,200,25);
        non_CourseLeader.setBounds(670,485,250,25);

        txt_non_CourseID.setBounds(290,220,245,40);
        txt_non_CourseName.setBounds(290,285,240,40);
        txt_non_Duration.setBounds(290,350,240,40);
        txt_non_StartDate.setBounds(940,220,240,40);
        txt_non_ExamDate.setBounds(940,350,240,40);
        txt_non_CompletionDate.setBounds(940,285,240,40);
        txt_non_InstructorName.setBounds(940,420,240,40);
        txt_non_Prerequisite.setBounds(290,420,240,40);
        txt_non_CourseLeader.setBounds(940,485,240,40);

        ADD_nonacademic.setBounds(230,550,180,40);
        Register_nonacademic.setBounds(430,550,180,40);
        Clear_nonacademic.setBounds(620,550,180,40);
        Display_nonacademic.setBounds(810,550,180,40);
        Remove_nonacademic.setBounds(990,660,180,40);
        
        Non_academic_title_pan.setBounds(0,50,1240,200);
        Academic_title_pan.setBounds(0,50,1240,200);
        
        //Coloring the panel and the buttons.
        Homepage.setBackground(new Color(167, 196, 181));
        Academic_title.setForeground(new Color(232,125,127));
        Non_Academic_title.setForeground(new Color(232,125,127));
        ADD_academic.setBackground(new Color(232,125,127));
        ADD_academic.setForeground(Color.WHITE);
        Register_academic.setForeground(Color.WHITE);
        Register_academic.setBackground(new Color(232,125,127));
        Clear_academic.setBackground(new Color(232,125,127));
        Clear_academic.setForeground(Color.WHITE);
        Display_academic.setBackground(new Color(23,125,127));
        Display_academic.setForeground(Color.WHITE);

        ADD_nonacademic.setForeground(Color.WHITE);
        Register_nonacademic.setForeground(Color.WHITE);
        Clear_nonacademic.setForeground(Color.WHITE);
        Display_nonacademic.setForeground(Color.WHITE);
        Remove_nonacademic.setForeground(Color.WHITE);

        ADD_nonacademic.setBackground(new Color(232,125,127));
        Register_nonacademic.setBackground(new Color(232,125,127));
        Clear_nonacademic.setBackground(new Color(232,125,127));
        Display_nonacademic.setBackground(new Color(232,125,127));
        Remove_nonacademic.setBackground(new Color(23,125,127));

        Go_nonacademic.setBackground(new Color(23,125,127));
        Go_academic.setBackground(new Color(23,125,127));

        Go_nonacademic.setForeground(Color.WHITE);
        Go_academic.setForeground(Color.WHITE);

        Title.setForeground(Color.WHITE);

       

        //setting layout of panels
        Homepage.setLayout(null);
        pan_Academic.setLayout(null);
        pan_nonAcademic.setLayout(null);

        Non_academic_title_pan.setLayout(new FlowLayout(FlowLayout.CENTER)); 
        Academic_title_pan.setLayout(new FlowLayout(FlowLayout.CENTER));

        // Setting visibility of panels
        pan_Academic.setVisible(false);
        pan_nonAcademic.setVisible(false);
        Homepage.setVisible(true);
        //adding panels to the JFrame
        add(Homepage);
        add(pan_Academic);
        add(pan_nonAcademic);
        setLocation(100,20);
        setJMenuBar(Bar);
        setSize(1240,770);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

    }
    /**
     * The clear method is used to clear the text fields of Academic panel.
     */

    public void CLEAR_Academic(){
        txt_CourseID.setText("");
        txt_CourseName.setText("");
        txt_Duration.setText("");
        txt_LecturerName.setText("");
        txt_Level.setText("");
        txt_Credit.setText("");
        txt_NumberOfAssessments.setText("");
        txt_StartDate.setText("");
        txt_CompletionDate.setText("");
        txt_CourseLeader.setText("");
    }
    /**
     * The clear method is used to clear the text fields of Non-Academic panel 
     */

    public void CLEAR_Nonacademic(){
        txt_non_CourseID.setText("");
        txt_non_CourseName.setText("");
        txt_non_Duration.setText("");
        txt_non_StartDate.setText("");
        txt_non_CompletionDate.setText("");
        txt_non_InstructorName.setText("");
        txt_non_ExamDate.setText("");
        txt_non_Prerequisite.setText("");
        txt_non_CourseLeader.setText("");
    }
    /**
     * This method is used to switch the panel and give function to add, clear, register for academic, display and
     * non academic course where as remove button for non-academic course
     * @param AcationEvent is the event class for ActionListner
     */
    public void actionPerformed(ActionEvent e ){
        if(e.getSource()==Home){
            Homepage.setVisible(true);
            pan_Academic.setVisible(false);
            pan_nonAcademic.setVisible(false);

        }

        else if(e.getSource()==Button_Academic || e.getSource()== Open_aca || e.getSource()==Go_academic){
            Homepage.setVisible(false);
            pan_Academic.setVisible(true);
            pan_nonAcademic.setVisible(false);
        }
        else if(e.getSource()== ADD_academic || e.getSource()==Add_aca){
            //initialize the duration, numberofassessments and credit
            int duration = 0 ,numberofassessments = 0, Credit = 0;
            
            //check if any empty fields found.
            if(txt_CourseID.getText().isEmpty()||txt_CourseName.getText().isEmpty()||txt_Duration.getText().isEmpty()||txt_Level.getText().isEmpty()||
            txt_Credit.getText().isEmpty()||txt_NumberOfAssessments.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame,"<Html> &emsp Empty fields !!! <br> Please re-enter the data","Alert",JOptionPane.WARNING_MESSAGE);
                return;
            }
            else{
                String courseid = txt_CourseID.getText();
                //Applying try catch for exception handling
                try {
                    duration = Integer.parseInt(txt_Duration.getText());

                } catch (NumberFormatException b) {
                    JOptionPane.showMessageDialog(frame,"<Html>Please enter numberical value <br> in Duration.","Alert",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                try{
                    numberofassessments = Integer.parseInt(txt_NumberOfAssessments.getText());
                }
                catch(NumberFormatException b){
                    JOptionPane.showMessageDialog(frame,"<Html> Please enter numerical value <br> in Number of Assessments","Alert",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                try{
                     Credit = Integer.parseInt(txt_Credit.getText());
                }
                catch(NumberFormatException b){
                    JOptionPane.showMessageDialog(frame,"<Html> Please enter numerical value <br>&emsp in Credit. ","Alert",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                //Traversing 
                Iterator<Course> i = Academic_list.iterator();
                while(i.hasNext()){
                    if(courseid.equals(i.next().getCourseID())){
                        JOptionPane.showMessageDialog(frame,"This course is already added");
                        return;
                    }
                }
                
                String coursename = txt_CourseName.getText(); 
                String level = txt_Level.getText();
                String credit = txt_Credit.getText();
                AcademicCourse aca_obj = new AcademicCourse(courseid,coursename,duration,level,""+Credit,numberofassessments);
                Academic_list.add(aca_obj);
                JOptionPane.showMessageDialog(frame,"Course has been added sucessfully");
                CLEAR_Academic();
            }
        }
        else if(e.getSource()==Clear_academic){

            int v = JOptionPane.showConfirmDialog(frame,"Are you sure?","Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(v == JOptionPane.YES_OPTION){
                CLEAR_Academic();
            }
        }

        else if(e.getSource()==Register_academic){
            if(txt_CourseID.getText().isEmpty()||txt_CourseName.getText().isEmpty()||txt_StartDate.getText().isEmpty()||
            txt_CompletionDate.getText().isEmpty()||txt_LecturerName.getText().isEmpty()||txt_Duration.getText().isEmpty()||
            txt_Level.getText().isEmpty()||txt_Credit.getText().isEmpty()||
            txt_NumberOfAssessments.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame,"<Html> &emsp Empty fields found!!! <br> Please fill all the fields.","Alert",JOptionPane.WARNING_MESSAGE);
                return;
            }
            else{
                String courseid = txt_CourseID.getText();
                for(int i = 0; i < Academic_list.size();i++){
                    /*
                     * Downcasting the object.
                     * Course object is casting to the AcademicCourse object
                     */
                    AcademicCourse ac = (AcademicCourse)Academic_list.get(i);
                    //check the course id of GUI with the course id of the array list.
                    if(courseid.equals(Academic_list.get(i).getCourseID())){
                        if(ac.getisRegistered() == false ){
                            String courseleader = txt_CourseLeader.getText();
                            String lecturername = txt_LecturerName.getText();
                            String startingDate = txt_StartDate.getText();
                            String completionDate = txt_CompletionDate.getText();
                            ac.register(courseleader,lecturername,startingDate,completionDate);
                            JOptionPane.showMessageDialog(frame,"Course has been register sucessfuly.");
                            CLEAR_Academic();
                            return;
                        }
                        else{
                            JOptionPane.showMessageDialog(frame,"Course is already register");
                            return; // Take the program out side of the loop. 
                        }
                    }
                }
                JOptionPane.showMessageDialog(frame,"Please enter valid Course ID","Alert",JOptionPane.WARNING_MESSAGE);
                return;
            }

        }
        else if(e.getSource() == Display_academic || e.getSource()== Display_aca){
            JFrame displayAcademic = new JFrame("Details of Academic Course");
            // two dimension array list was created.
            String [][]academic_data = new String[Academic_list.size()][10];
            for(int i = 0; i < Academic_list.size(); i++){
                AcademicCourse ac = (AcademicCourse)Academic_list.get(i);
                for(int j = 0; j<10; j++){
                    if( j == 0){
                        academic_data[i][j] = ac.getCourseID(); 
                    }
                    else if(j == 1){
                        academic_data[i][j] = ac.getCourseName();
                    }
                    else if( j == 2){
                        String duration =Integer.toString(ac.getDuration());
                        academic_data[i][j] = duration ;
                    }
                    else if( j == 3){
                        academic_data[i][j] = ac.getLevel();
                    }
                    else if( j == 4){
                        academic_data[i][j] = ac.getCredit();
                    }
                    else if( j == 5){
                        academic_data[i][j] = Integer.toString(ac.getNumberOfAssessments ()); 
                    }
                    else if( j == 6){
                        academic_data[i][j] = ac.getCourseLeader();
                    }
                    else if( j == 7){
                        academic_data[i][j] = ac.getLecturerName();
                    }
                    else if( j == 8){
                        academic_data[i][j] = ac.getStartingDate();
                    }
                    else if( j == 9){
                        academic_data[i][j] = ac.getcompletionDate();
                    }
                }
            }
            String column[]={"Course ID","Course Name","Duration","Level","Credit","No of Assessments","Course Leader","Lecturer Name","Starting Date","Completion Date"};
            //creating the table
            JTable jt=new JTable(academic_data,column);    
            jt.setBounds(30,40,500,300);          
            JScrollPane sp=new JScrollPane(jt); 
            displayAcademic.add(sp);  
            displayAcademic.setSize(1000,500);
            displayAcademic.setVisible(true);
            displayAcademic.setLayout(null);
        }
        else if (e.getSource()==Button_nonAcademic|| e.getSource()==Open_non || e.getSource()==Go_nonacademic){
            Homepage.setVisible(false);
            pan_Academic.setVisible(false);
            pan_nonAcademic.setVisible(true);
        }
        else if(e.getSource()==ADD_nonacademic ||e.getSource()== Add_non){
            if(txt_non_CourseID.getText().isEmpty()|| txt_non_CourseName.getText().isEmpty()||txt_non_Duration.getText().isEmpty()||
            txt_non_Prerequisite.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame,"<Html> &emsp Empty fields !!! <br> Please fill all the fields.","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                int duration = 0;
                String courseid = txt_non_CourseID.getText();
                //Applying try catch for exception handling
                try {
                    duration = Integer.parseInt(txt_non_Duration.getText());

                } catch (NumberFormatException b) {
                    JOptionPane.showMessageDialog(frame,"<Html>Please enter numerical value <br> in Duration","Alert",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                Iterator<Course> i = Non_Academic_list.iterator();
                while(i.hasNext()){
                    if(courseid.equals(i.next().getCourseID())){
                        JOptionPane.showMessageDialog(frame,"This course is already registered");
                        return;
                    }
                }

                String coursename = txt_non_CourseName.getText();               
                String prerequisite = txt_non_Prerequisite.getText();
                NonAcademicCourse Nonacademic_obj = new NonAcademicCourse(courseid,coursename,duration,prerequisite);
                Non_Academic_list.add(Nonacademic_obj);
                JOptionPane.showMessageDialog(frame,"Course has been added sucessfully");

                CLEAR_Nonacademic();

            }
        }
        else if(e.getSource() == Display_nonacademic ||e.getSource()== Display_non){
            JFrame displaynonacademic = new JFrame("Details of Non-Academic Course");
            String [][]nonacademic_data = new String[Non_Academic_list.size()][9];
            for(int i = 0; i < Non_Academic_list.size(); i++){
                NonAcademicCourse ac = (NonAcademicCourse)Non_Academic_list.get(i);
                for(int j = 0; j<9; j++){
                    if( j == 0){
                        String courseid = ac.getCourseID();
                        nonacademic_data[i][j] = courseid; 
                    }
                    else if(j == 1){
                        nonacademic_data[i][j] = ac.getCourseName();
                    }
                    else if( j == 2){
                        String duration =Integer.toString(ac.getDuration());
                        nonacademic_data[i][j] = duration ;
                    }
                    else if( j == 3){
                        nonacademic_data[i][j] = ac.getInstructorName();
                    }
                    else if( j == 4){
                        nonacademic_data[i][j] = ac.getStartingDate();
                    }
                    else if( j == 5){
                        nonacademic_data[i][j] = ac.getCompletionDate();
                    }
                    else if( j == 6){
                        nonacademic_data[i][j] = ac.getExamDate();
                    }
                    else if( j == 7){
                        nonacademic_data[i][j] = ac.getPrerequisite();
                    }
                    else if( j == 8){
                        nonacademic_data[i][j] = ac.getCourseLeader();
                    }
                }
            }

            String column[]={"Course ID","Course Name","Duration","Instructor Name","Starting Date","Completion Date","Exam Date","Prerequisite","Course Leader"};

            JTable jt=new JTable(nonacademic_data ,column);    
            jt.setBounds(30,40,500,300);          
            JScrollPane sp=new JScrollPane(jt); 
            displaynonacademic.add(sp);  
            displaynonacademic.setSize(1000,500);
            displaynonacademic.setVisible(true);
            displaynonacademic.setLayout(null);
        }
        else if(e.getSource()==Register_nonacademic){
            if(txt_non_CourseID.getText().isEmpty()||txt_non_CourseName.getText().isEmpty()||txt_non_StartDate.getText().isEmpty()||
            txt_non_CompletionDate.getText().isEmpty()||txt_non_InstructorName.getText().isEmpty()||txt_non_Duration.getText().isEmpty()||
            txt_non_ExamDate.getText().isEmpty()||txt_non_CourseLeader.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame,"<Html> &emsp Empty fields found!!! <br> Please fill all the fields.","Alert",JOptionPane.WARNING_MESSAGE);
                return;

            }
            else{
                String courseid = txt_non_CourseID.getText();
                for(int i = 0; i < Non_Academic_list.size();i++){
                    NonAcademicCourse ac = (NonAcademicCourse)Non_Academic_list.get(i);
                    if(courseid.equals(Non_Academic_list.get(i).getCourseID())){

                        if(ac.getisRegistered() == false ){
                            String courseleader = txt_non_CourseLeader.getText();
                            String instructorname = txt_non_InstructorName.getText();
                            String startingDate = txt_non_StartDate.getText();
                            String completionDate = txt_non_CompletionDate.getText();
                            String ExamDate = txt_non_ExamDate.getText();
                            ac.register(courseleader,instructorname,startingDate,completionDate,ExamDate);
                            JOptionPane.showMessageDialog(frame,"Course has been register successfully.");
                            CLEAR_Nonacademic();
                            return;

                        }
                        else{
                            JOptionPane.showMessageDialog(frame,"Course is already register");
                            return;
                        }

                    }

                }
                JOptionPane.showMessageDialog(frame,"Please enter valid Course ID","Alert",JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

    }
    /**
     * It is the main method where constructor INGCollege() is called.
     * The return type of this method is void and keyword is static.
     * @param String [] args is used to store the data in arrya in string data type.
     */
    public static void main(String[]args){
        new INGCollege();
    }
}
