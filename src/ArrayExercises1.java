// **********************************************************************
//  Programmer:         Ma Pauline Sadaya
//  Class:		CS30S
//
//  Assignment:         ArrayExercises1
//
//  Description:	program exercises for arrays
//
//
//  Input:		5 numbers read from keyboard into an array
//
//  Output:		5 numbers printed out in normal, and in reverse order
// ***********************************************************************

import javax.swing.*;
import java.text.DecimalFormat;

public class ArrayExercises1
{  // begin class
    public static void main(String args[])
    {  // begin main
    // ***** declaration of constants *****
        
        final int five = 5;             //max array size

    // ***** declaration of variables *****
        
        String string;                  //string
        String delim = "[ ]+";         // delimiter for parsing input strings
        
        
        int list[] = new int[five];      //declare max array size

    // ***** create objects *****

    // ***** create input stream *****

        //ConsoleReader console = new ConsoleReader(System.in);

    // ***** Print Banner *****

        System.out.println("**********************************");
        System.out.println("NAME:        Ma. Pauline Sadaya");
        System.out.println("Class:       CS30S");
        System.out.println("Assignment:  ArrayExercises1");
        System.out.println("**********************************");

    // ***** get input *****

        string = JOptionPane.showInputDialog("Enter " + five + " numbers");  //ask input
        String[] tokens = string.split(delim);          //split tokens

    // ***** processing *****
        
        for(int i = 0; i < five; i++){
            list[i] = Integer.parseInt(tokens[i]); //split tokens in input string and store in an array
        }//end for loop


    // ***** output *****

        System.out.println("Original Order: ");
        for(int i = 0; i < five; i++){ 
            System.out.println(list [i]);
        }//arrangement of numbers in original order
        
        System.out.println("Reversed Order: ");
        for(int i = five-1; i >= 0; i--){ 
            System.out.println(list [i]);
        }//arrangement of numbers in reverse order

    // ***** closing message *****

        System.out.println("end of processing");

	}  // end main	
}  // end class