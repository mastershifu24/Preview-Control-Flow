import java.util.Scanner;

public class Ascii {

    Scanner input = new Scanner(System.in);

    int userInput = input.nextInt();

    public static void printNumbers(){

        for(int i = 48; i <= 57; i++){
            char c = (char) i;
            System.out.println(c);
        }
    }

    public static void printLowerCase(){

        for(int i = 97; i <= 122; i++){
            char d = (char) i;
            System.out.println(d);
        }

    }

    public static void printUpperCase(){

        for(int i = 65; i <= 90; i++){
            char e = (char) i;
            System.out.println(e);
        }
    }

    public static void petName(){
        System.out.println("Name of your pet?");
    }

}  
