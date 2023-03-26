import java.util.Scanner;

import java.util.ArrayList;
import java.util.Random;

public class App {

    static String petName;
    static String mySurvey;
    static int petAge;
    static int LuckyNum;
    static int jerseyNum;
    static int modelYear;
    static String actorName;
    static int randomNumber;
    // String name performSurvey;

    

    static int randNum1;
    static int randNum2;
    static int randNum3;

    static int MAX_BALL_NUM;
    static int MAX_LOTTERY_NUM;


    public static <Starting> void main(String[] args) throws Exception {
        Ascii.printNumbers();
        Ascii.printLowerCase();
        Ascii.printUpperCase();
    

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name ");
        String name = input.next();
        System.out.println("Hi " + name);

        System.out.println("Would you like to participate in a brief survey? (Enter y or yes to continue)");
       //String theanswer = input.nextLine();
       //if(theanswer.equalsIgnoreCase("y") || theanswer.equalsIgnoreCase("Yes")){

       // }

       // public static void performSurvey(Scanner in){

       // }
        
       String mySurvey = input.next();

       System.out.println("\nWould you like to answer questions to generate another set of numbers? {Enter y or yes to continue}");
       String response = input.next();

       
        // else{
        //     System.out.println("Thank you for participating in the survey.\n");
        //     quit = true;
        // }
    //}


        System.out.println(name + " would you like to continue? y/n");
        String contin = input.next();

        System.out.println("What is the name of your pet?");
        String petName = input.next();

        System.out.println("how old is your pet?");
        int petAge = input.nextInt();

        System.out.println("Do you have a red car?");
        String redCar = input.next();

        System.out.println("What is your lucky number?");
        String luckyNum = input.next();

        //Get your favorite quarterback's jersey number
       System.out.println("Do you have a favorite quarterback? (yes/no))");
        input.nextLine();
       String answer = input.nextLine();
        if(answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("Yes")){
        System.out.println("What is the jersey number?");
        jerseyNum = input.nextInt();
        }
        

        System.out.println("What is two-digit model year of their car?");
        int modelYear = input.nextInt();

        
        System.out.println("Where are you from?");
        String origin = input.next();

        System.out.println("What is the first name of your favorite actor or actress?");
        actorName = input.next();

        System.out.println("Enter a random number between 1 and 50.");
        int randomNumber = input.nextInt();

        //This function will return a random number between 0 and the number specified
        // by the input parameter range

        // Starting the survey
        boolean quit = false;
        while(quit == false){

            Random random = new Random(); 
            int number1 = 1 + (random.nextInt(65));
            System.out.println(number1);
            int number2 = 1 + (random.nextInt(65));
            int number3 = 1 + (random.nextInt(65));
            int number4 = 1 + (random.nextInt(65));
            int number5 = 1 + (random.nextInt(65));
            System.out.println("Your powerball numbers are " + number1 + " " + number2 + " " + number3 + " "
            + number4 + " " + number5);
            char charAt =  petName.charAt(2) ;
            int a = (charAt * number2)%75;
            System.out.println(a);


            System.out.println("Would you like to generate more numbers? True/False");
            quit = !input.nextBoolean();
        }

        // }
        // } else {
        //     System.out.println("please return later to complete the survey.");
        // }


    }


    public static int getRandomNum(int range){
        //create instance of Random class
        Random rand = new Random();
        int randNum = rand.nextInt(range);
        return randNum;
    }


    private static void generateTheMagicNumbers() {
    }
}
