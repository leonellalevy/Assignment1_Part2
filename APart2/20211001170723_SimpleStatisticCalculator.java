/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplestatisticcalculator;
import java.util.Scanner;
/**
 *
 * @Leonella Levy Martel
 */
public class SimpleStatisticCalculator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Create a new Scanner object
    Scanner keyboard= new Scanner(System.in); 
    //Ask 5 numbers to the user
    System.out.print("Please input 5 numbers separated by space: ");
    //Read the numbers input by user
    String numbers[] = keyboard.nextLine().split(" ");
    double n1 = Integer.parseInt(numbers[0]);
    double n2 = Integer.parseInt(numbers[1]);
    double n3 = Integer.parseInt(numbers[2]);
    double n4 = Integer.parseInt(numbers[3]);
    double n5 = Integer.parseInt(numbers[4]);
    //Calculate the mean between the numbers
    double mean = (n1+n2+n3+n4+n5)/5;
    //Determine the minimum 
    double minimum1 = Math.min(Math.min(n1,n2),Math.min(n3,n4));
    double minimum = Math.min(minimum1, n5);
    //Determine the maximum
    double maximum1 = Math.max(Math.max(n1,n2),Math.max(n3,n4));
    double maximum = Math.max(maximum1, n5);
    //Calculate the standard deviation
    double SD1 = Math.pow(n1-mean,2)+ Math.pow(n2-mean,2)+ Math.pow(n3-mean,2);
    double SD2 = Math.pow(n4-mean,2)+ Math.pow(n5-mean,2)+ SD1;
    double SD = Math.sqrt(SD2/5);
    //Output the numbers
    System.out.printf("Numbers\t\t\t: %.2f",n1);
    System.out.printf(", %.2f",n2);
    System.out.printf(", %.2f",n3);
    System.out.printf(", %.2f",n4);
    System.out.printf(", %.2f%n",n5);
    //Output the mean
    System.out.printf("Mean \t\t\t: %.2f %n",mean);
    //Output the minimum
    System.out.printf("Minimum\t\t\t: %.2f %n",minimum);
    //Output the maximum
    System.out.printf("Maximum \t\t: %.2f %n",maximum);
    //Output the standard deviation
    System.out.printf("Standard Deviation\t: %.2f %n",SD);
    }
    }
      

