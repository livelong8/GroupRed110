import java.util.Scanner;
public class Lab2c_StudentInfo {
    public static void main(String[] args) {
        /*
        Task 1: Student Information

        Instructions:

        Create a new Java class called "Lab2c_StudentInfo".
        In the main method of the class, create a new instance of the Scanner class to take input from the user.
        Use the nextLine() method to prompt the user for their name and store it in a variable called "name".
        Use the nextInt() method to prompt the user for their age and store it in a variable called "age".
        Use the nextDouble() method to prompt the user for their GPA and store it in a variable called "gpa".
        Print out the user's name, age, and GPA using the variables from step 3-5.
        Use the nextBoolean() method to prompt the user for whether they are currently enrolled in school and store it in a variable called "enrolled".
        Print out whether the user is currently enrolled using the variable from step 7.
        Submit your program with the source code and a screenshot of it running correctly.
         */
        //create scanner object
        Scanner input = new Scanner(System.in);

        //get name
        System.out.print("What is your name: ");
        String name = input.nextLine();

        //get age
        System.out.print("How old are you: ");
        int age = input.nextInt();

        //get gpa
        System.out.print("What is your gpa: ");
        double gpa = input.nextDouble();

        //output name+age+gpa
        System.out.println(name+" is "+age+" years old and have a gpa of "+gpa);

        //get enrolled
        System.out.print("Are you enrolled in school (enter true or false): ");
        boolean enrolled = input.nextBoolean();
        //print statment based on boolean
        if(enrolled = true){
            System.out.println(name+" is enrolled");
        }else{
            System.out.println(name+" is not enrolled");
        }






    }
}