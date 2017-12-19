// **********************************************************************
//  Programmer:         Ma Pauline Sadaya
//  Class:		CS30S
//
//  Assignment:         ArrayExercises1
//
//  Description:	program exercises for arrays
//
//
//  Input:		random number of numbers read from keyboard into an array, position of the number
//                      that wants to be changed, and the number that will change the chosen number
//                      
//  Output:		random number of numbers printed out in normal, and in reverse order,
//                      position of the number that wants to be changed, and the new number that will
//                      replace the second number, largest and smallest number in the array
// ***********************************************************************

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

public class ArrayExercises1
{  // begin class
    public static void main(String args[])
    {  // begin main
    // ***** declaration of constants *****
        
    // ***** declaration of variables *****
        
        int rnd;        //random value
        
        String string;                  //string
        String string2;                 //second string
        String string3;                 //third string
        String delim = "[ ]+";         // delimiter for parsing input strings
        
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        
    // ***** create objects *****
        
        Random random = new Random();       //random variable generator

    // ***** create input stream *****

        //ConsoleReader console = new ConsoleReader(System.in);

    // ***** Print Banner *****

        System.out.println("**********************************");
        System.out.println("NAME:        Ma. Pauline Sadaya");
        System.out.println("Class:       CS30S");
        System.out.println("Assignment:  ArrayExercises1");
        System.out.println("**********************************");

    // ***** get input *****
        
        rnd = random.nextInt(10)+1;    //process a random variable
        int list[] = new int[rnd];      //declare max array size

        string = JOptionPane.showInputDialog("Enter " + rnd + " numbers");  //ask input
        String[] tokens = string.split(delim);          //split tokens
        
        string2 = JOptionPane.showInputDialog("Select the position of the number you want to be printed");    //ask input
        int n = Integer.parseInt(string2);          //parse string to int

    // ***** processing *****
        
        for(int i = 0; i < rnd; i++){
            list[i] = Integer.parseInt(tokens[i]); //split tokens in input string and store in an array
        }//end for loop
        
        
    // ***** output *****

        System.out.println("Original Order: ");
        for(int i = 0; i < rnd; i++){ 
            System.out.println(list [i]);
        }//arrangement of numbers in original order
        
        System.out.println("Reversed Order: ");
        for(int i = rnd-1; i >= 0; i--){ 
            System.out.println(list [i]);
        }//arrangement of numbers in reverse order
        
        while(n!=-1){
            System.out.println("Number chosen: " + list[n]);
            
            string3 = JOptionPane.showInputDialog("Change it to what?");        //ask for new number
            String[] split = string3.split(delim);                          //split string
            list[n] = Integer.parseInt(split[0]);                                //parse string to int
            System.out.println("New number: " + list[n]);
            
            n = Integer.parseInt(JOptionPane.showInputDialog("Pick a number from the list"));
        }//end while loop
        
        for(int i = 0; i < rnd; i++) {
            if(smallest > list[i]) {
            smallest = list[i];
            }
        }//end for loop
        System.out.println("Smallest Value: " + smallest);
        
        for(int i = 0; i < rnd; i++) {
            if(list[i] > largest) {
            largest = list[i];
            }
        }//for loop        
        System.out.println("Largest Value: " + largest);

    // ***** closing message *****

        System.out.println("end of processing");

	}  // end main	
}  // end class