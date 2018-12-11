package edu.century.finalproject;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.*;
public class Driver {
	//Just making a separate method to keep it separate from the other types of user input for conversion
	private static void processUserInputVolume(Scanner scan) {	//why static?
		Volume converter = new Volume();
		DecimalFormat formatter = new DecimalFormat("####.00"); //can i create only one decimal input object to use if i combined these user input methods into one?
        System.out.println("Enter your current unit: ");
        String unitCurrent = scan.nextLine();
        System.out.println("Enter your current value: ");
        double value = scan.nextDouble();
        System.out.println("Enter the unit to convert to: ");
        scan.nextLine();
        String unitFinal = scan.nextLine();
        double finalValue = converter.convertToLiters(unitCurrent, unitFinal, value);
        System.out.println(value + " " + unitCurrent + " = " + formatter.format(unitFinal) + " " + unitFinal);
        
    
    }
	
    private static void processUserInputTemp (Scanner scan) {
    	
    	Temperature converter = new Temperature();
    	DecimalFormat formatter = new DecimalFormat();
        int choice = 1 ;
        System.out.println("Press 1 for C->F or 2 for F->C");
        choice = scan.nextInt();
        if (choice == 1) {
			System.out.println("Enter degrees C");
			double c = scan.nextDouble();
			double c2 = converter.convertCtoF(c);
			System.out.println(c + " degrees C is " + formatter.format(c2) + " degrees F");
        }
        else {
        		System.out.println("Enter degrees F");
        		double f = scan.nextDouble();
        		double f2 = converter.convertFtoC(f);
        		System.out.println(f + " degrees F is " + formatter.format(f2) + " degrees C");
        }
    
    }
    public static void main(String[]args) {
		Scanner scan = new Scanner (System.in);
		//processUserInputTemp (scan);
		processUserInputVolume (scan); //why does is only work when static?
		
		
		
}

	// 
	
}
