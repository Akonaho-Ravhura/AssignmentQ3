package com.company;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //get and set methods
    public static String getEmployeeName() {
        return employeeName;
    }

    public static void setEmployeeName() {

        employeeName = JOptionPane.showInputDialog("Please enter the first employee name");

    }

    public static String getEmployeeName2() {
        return employeeName2;
    }

    public static void setEmployeeName2() {

        employeeName2 = JOptionPane.showInputDialog("Please enter the second employee name");
    }

    public static String getEmployeeName3() {
        return employeeName3;
    }

    public static void setEmployeeName3() {

        employeeName3 = JOptionPane.showInputDialog("Please enter the third employee name");
    }






//public declarations of varialbes
    public static String employeeName;
    public static String  employeeName2 ;
    public static String employeeName3;
    public static String cellProvider[] = {"MTN","VODACOM","CELLC"};
    public static int init = 0;
    public static int cellCode[] ={ 71,83,84};
    public static String input;
    public static int numbers[] = {101,222,343,445,765,676,537,587,798,860,123,113,344,145,156,157,687,678,467};
    public static int numbers2[] = {1253,1562,4225,4526,7954,1234,4321,9874,9632,6541,3214,5631,4523,5621,6541};


//method to pick random numbers from array lists above
    private static void randomProvider_And_randomNumbers() {
            //random variables
            int numberIndex = (int) (Math.random() * 19);
            int indexNumber = numbers[numberIndex];
            int numberIndex2 = (int) (Math.random() * 12);
            int indexNumber2 = numbers2[numberIndex2];
            int randomindex = (int) (Math.random() * 3);
            String index = cellProvider[randomindex];
            int indexCode = (int) (Math.random() * 3);
            int codeIndex = cellCode[indexCode];


//final output of the program
    JOptionPane.showMessageDialog(null, "CELLPHONE NUMBER GENERATOR" +
            "\n***************************************" +
            "\n" + getEmployeeName() + " will be on " + cellProvider[randomindex] + " network with phone numbers " + init + cellCode[indexCode] +
            numbers[numberIndex] + " (" + numbers2[numberIndex2] + ")" +
            "\n" + getEmployeeName2() + " will be on " + cellProvider[randomindex] + " network with phone numbers " + init + cellCode[indexCode] +
            numbers[numberIndex] + " (" + numbers2[numberIndex2] + ")"
            + "\n" + getEmployeeName3() + " will be on " +  cellProvider[randomindex] + " network with phone numbers " + init + cellCode[indexCode] +
            numbers[numberIndex] + " (" + numbers2[numberIndex2] + ")");
}


    public static void main(String[] args) {
        //creation of rabdom object and scanner object
        Random ray = new Random();
        Scanner scan = new Scanner(System.in);

        Main main = new Main();
        //calling of get and set, and other methods in the main ckasss in the main method
       getEmployeeName();
       setEmployeeName();
       getEmployeeName2();
        setEmployeeName2();
       getEmployeeName3();
        setEmployeeName3();
        randomProvider_And_randomNumbers();


    }


}
