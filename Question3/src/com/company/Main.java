package com.company;
import java.util.*;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {

//course_Details object
        Course_Details cop = new Course_Details();
//calling of methods method call
       cop.getCourse_Name();
        cop.setCourse_Name(cop.course_Name);
        cop.getStudentNumbers();
        cop.setStudentNumbers(cop.studentNumbers);
        cop.getLecturerName();
        cop.setLecturerName(cop.lecturerName);


//declarations
        int  Diploma1 = 1 ;
        int diploma2 = 2;
        int diploma3 = 3;
        int numberInput;
       //String output;
//input output
        JOptionPane inputJob = new JOptionPane();

      String input =  JOptionPane.showInputDialog("Select from the following to view the course details: " +"\n 1)DISD" +
                                    "\n 2)DIWD " + "\n 3)DIDM");

      int output  = Integer.parseInt(input);

      int stop = 4;

//decision statements and calling of methods from CourseDetails class
      if (output == Diploma1){
          cop.dateclass();
          cop.getDisdLect();
          cop.setDisdLect(cop.disdLect);
          cop.getDISD();
          cop.setDISD(cop.DISD);
          cop.getDISDnum();
          cop.setDISDnum(cop.DISDnum);
          cop.getVenueNumber();
          cop.setVenueNumber(cop.venueNumber);
          cop.getVenueName();
          cop.setVenueName(cop.venueName);
          cop.assignVenue();




      }


        if (output == diploma2){
            cop.dateclass();
            cop.getDiwdLect();
            cop.setDiwdLect(cop.diwdLect);
            cop.getDIWD();
            cop.setDIWD(cop.DIWD);
            cop.getDIWDnum();
            cop.setDIWDnum(cop.DIWDnum);
            cop.getVenueNumber();
            cop.setVenueNumber(cop.venueNumber);
            cop.getVenueName();
            cop.setVenueName(cop.venueName);
            cop.assignVenue();


        }

        if (output == diploma3){

            cop.dateclass();
            cop.getDidmLect();
            cop.setDidmLect(cop.didmLect);
            cop.getDIDMnum();
            cop.getDIDM();
            cop.setDIDM(cop.DIDM);
            cop.setDIDMnum(cop.DIDMnum);
            cop.getVenueNumber();
            cop.setVenueNumber(cop.venueNumber);
            cop.getVenueName();
            cop.setVenueName(cop.venueName);
            cop.assignVenue();


        }


    }
}
