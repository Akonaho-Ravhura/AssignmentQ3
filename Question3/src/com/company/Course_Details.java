package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Course_Details {


    //declarations

    String course_Name;
    int studentNumbers;
    String lecturerName;
    String venueName;
    int venueNumber;
    //assigning variables
    String disdLect = "Lecturer Name :     Mr Jones";
    String diwdLect = "Lecturer Name :     Mr Smith";
    String didmLect = "Lecturer Name :     Mr Ntsinga";
    String DISD = "Course Name :     Diploma in software development";
    String DIWD = "Course Name :     Diploma in web development";
    String DIDM = "Course Name :     Diploma in data metrics";
    int DISDnum = 35;
    int DIWDnum = 28;
    int DIDMnum = 39;

    //get and set methods
    public String getCourse_Name() {
        return course_Name;
    }

    public void setCourse_Name(String course_Name) {
        this.course_Name = course_Name;
    }

    public int getStudentNumbers() {
        return studentNumbers;
    }

    public void setStudentNumbers(int studentNumbers) {
        this.studentNumbers = studentNumbers;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerNamelecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public int getVenueNumber() {
        return venueNumber;
    }

    public void setVenueNumber(int venueNumber) {
        this.venueNumber = venueNumber;
    }

    public String getDisdLect() {
        return disdLect;

    }

    public void setDisdLect(String disdLect) {
        this.disdLect = disdLect;

        System.out.println(disdLect);

    }

    public String getDiwdLect() {
        return diwdLect;
    }

    public void setDiwdLect(String diwdLect) {
        this.diwdLect = diwdLect;
        System.out.println(diwdLect);
    }

    public String getDidmLect() {
        return didmLect;
    }

    public void setDidmLect(String didmLect) {
        this.didmLect = didmLect;
        System.out.println(didmLect);
    }

    public String getDISD() {
        return DISD;
    }

    public void setDISD(String DISD) {
        this.DISD = DISD;
        System.out.println(DISD);
    }

    public String getDIWD() {
        return DIWD;
    }

    public void setDIWD(String DIWD) {
        this.DIWD = DIWD;

    }

    public String getDIDM() {
        return DIDM;
    }

    public void setDIDM(String DIDM) {
        this.DIDM = DIDM;
    }

    public int getDISDnum() {
        return DISDnum;

    }

    public void setDISDnum(int DISDnum) {
        this.DISDnum = DISDnum;

        System.out.println(DISDnum);
    }
    //method for course
    public int getDIWDnum() {
        return DIWDnum;
    }
    //method for course
    public void setDIWDnum(int DIWDnum) {
        this.DIWDnum = DIWDnum;
        System.out.println(DIWDnum);
    }

    public int getDIDMnum() {
        return DIDMnum;
    }
//method for course
    public void setDIDMnum(int DIDMnum) {
        this.DIDMnum = DIDMnum;
        System.out.println(DIDMnum);
    }
//method to get the current date amd time
    public DateTimeFormatter getDtf() {
        return dtf;
    }

    public void setDtf(DateTimeFormatter dtf) {
        this.dtf = dtf;
        System.out.println(dtf);
    }

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");
//method to output the current date
    public static void dateclass() {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

    }
//method to assign a venue to the lecturer
    public static void assignVenue() {

        Random venueNum = new Random();


        int number = venueNum.nextInt(3);

        System.out.println( "the venue  is venue " +number);


    }


}