import java.util.Scanner;
//Group Red.

public class CoffeeDescriptionFormatter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input
        final int MAX_DESCRIPTION_LENGTH = 200;

        System.out.print("How would you describe your favorite coffee in one sentence? ");
        String coffeeDescription = input.nextLine();

        System.out.print("What is your first name? ");
        String userFirstName = input.nextLine();

        System.out.print("What is your last name? ");
        String userLastName = input.nextLine();

        //process

        int coffeeDescriptionLength = coffeeDescription.length();
        char firstInitial = userFirstName.charAt(0);
        char lastInitial = userLastName.charAt(0);
        String uppercaseMaker = coffeeDescription.toUpperCase();
        if (coffeeDescriptionLength <= MAX_DESCRIPTION_LENGTH){
            System.out.println(""+firstInitial+lastInitial+"\n"
                    +"Coffee description: "+uppercaseMaker+".\n"
                    +"Your description was "+coffeeDescriptionLength+" characters.");

        }else{
            System.out.println("You input more than 200 characters");
        }
    }
}