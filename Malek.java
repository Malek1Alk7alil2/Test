
package test1;

import java.util.Scanner;

public class TestNumericalAnalysis {
public static void Rounding(float Number,int Kdigits){

  
    
}

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        double number = scanner.nextDouble();
        System.out.println("****************");
        System.out.println("Enter a number:");
        double number1 = scanner.nextDouble();
        System.out.println("****************");
        System.out.println("Original number: " + number);
        System.out.println("Chopped integer part: " + chopIntegerPart(number));
        System.out.println("Chopped decimal part: " + chopDecimalPart(number));
        System.out.println("*********************************");
        System.out.println("Original number: " + number);
        System.out.println("Rounded number to the nearest integer: " + roundToNearestInteger(number1));
        System.out.println("Rounded number to 2 decimal places: " + roundToDecimalPlaces(number1, 2));
        System.out.println("Rounded number to the nearest hundredth: " + roundToNearestHundredth(number1));
    }

    // Function to chop off the integer part of a number
    public static double chopIntegerPart(double number) {
        return number % 1;
    }

    // Function to chop off the decimal part of a number
    public static double chopDecimalPart(double number) {
        return (int) number;
      
        
    }
    
     // Function to round a number to the nearest integer
    public static double roundToNearestInteger(double number) {
        return Math.round(number);
    }

    // Function to round a number to specified decimal places
    public static double roundToDecimalPlaces(double number, int decimalPlaces) {
        double scale = Math.pow(10, decimalPlaces);
        return Math.round(number * scale) / scale;
    }

    // Function to round a number to the nearest hundredth
    public static double roundToNearestHundredth(double number) {
        return Math.round(number * 100.0) / 100.0;
    }
}