package ntou.cs.java2022;
import java.util.Scanner;

public class BMICalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double height, weight, bmi;
        System.out.println("Welcome to the BMI (Body Mass Index) calculator");
        
        System.out.print("Please enter your weight (kilograms): ");
        weight = input.nextDouble();

        System.out.print("Please enter your height (centimeters: ");
        height = input.nextDouble();
        height = height/100.0;

        bmi = weight/height/height;

        System.out.printf("Your BMI is %.1f", bmi);

        if(bmi < 18.5)
            System.out.print(" (Underweight)");
        else if(bmi >= 18.5 && bmi <= 24.9)
            System.out.print(" (Normal)");
        else if(bmi >=25 && bmi <=29.9)
            System.out.print(" (Overweight)");
        else
            System.out.print(" (Obese)");
    }
}