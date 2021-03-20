# TheGame


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;
        String willPlay;
        int age;

        Scanner scan = new Scanner(System.in);

        //Asking for the user name
        System.out.println("Enter your name: ");
        name = scan.nextLine();

        //Asking for the user age
        System.out.println("Enter your age: ");
        age = scan.nextInt();

        Scanner scan1 = new Scanner(System.in);

        //Asking to play the game
        System.out.println("Do you want to play the game?");
        willPlay = scan1.nextLine();

        if (willPlay.equalsIgnoreCase("YES")){

            Random rand = new Random();

            int userGuess;
            int computerGuess= rand.nextInt(100);
//Computer will guess a number between 0 and100.


            System.out.println("Please enter a number between 1 and 100: ");
            userGuess = scan.nextInt();

            System.out.println("Your guess: "+userGuess);
            System.out.println("Computer's guess: "+computerGuess);

            if(Math.abs(userGuess-100) < Math.abs(computerGuess-100)){
                System.out.println("-------You are the winner-------");
            }else{
                System.out.println("-------Computer is the winner-------");
            }

        }else if(willPlay.equalsIgnoreCase("NO")){
            System.out.println("Thank you "+name+"...");
        }

    }
}


 
 
