import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Task 1: BMI Calculator
        Calculate and interpret the Body Mass Index (BMI) from user-provided weight and height.

        Input: Ask for weight in pounds and height in inches.
        Convert: Change weight to kilograms and height to meters (1 pound = 0.4535 kg, 1 inch = 0.0254 m).
        Calculate BMI: Use the formula

        Interpret:
        Underweight if BMI < 18.5
        Normal if 18.5 ≤ BMI < 25.0
        Overweight if 25.0 ≤ BMI < 30.0
        Obese if BMI ≥ 30.0
        Output: Display the BMI and its category.
         */
        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Define Vars and get inputs
        System.out.print("How much do you weigh in lbs: ");
        double weight = input.nextDouble()*.4535;
        System.out.print("What is your height in inches: ");
        double height = input.nextInt()*0.0254;
        double bmi = weight/(height*height);

        //Print out if underweight, normal, overweight, or obese
        System.out.println("Your BMI is "+bmi);
        if(bmi<18.5){
            System.out.println("You are underweight");
        }else if(bmi<25){
            System.out.println("You are normal");
        }else if(bmi<30){
            System.out.println("You are overweight");
        }else if(bmi>30){
            System.out.println("You are obese");
        }else{
            System.out.println("Invalid answer");
        }

    }
}