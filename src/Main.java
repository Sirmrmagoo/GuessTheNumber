import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        game();
    }

    private static void game() {

        int guesses = 0;

        Scanner playerInput = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Welcome To Guess The Number!\nYou Have To Guess The Number I Think of.\nChose Your Difficulty\n1. Easy (Guess 1-100, 5 Guesses) \n2. Medium (Guess 1-150, 4 Guesses)\n3. Hard (Guess 1-300, 2 Guesses)");

        int difficulty = playerInput.nextInt();


        if (difficulty == 1) {
            guesses += 5;

            System.out.print("You Chose Easy");

            int number = random.nextInt(100 + 1);

            System.out.println("\nYour Guesses:" + guesses);


            for (int i = 0; i < guesses; i++) {
                int guess = playerInput.nextInt();

                if (guess > number) {
                    System.out.println("Smaller Than That");
                } else if (guess < number) {
                    System.out.println("Bigger Than That");
                }else if (guess == number) {
                    System.out.println("CORRECT!");

                    System.out.println("Try Again?\n 1. Y\n2. N");

                    int yN = playerInput.nextInt();

                    if (yN == 1){
                        game();
                    }
                }

            }

            System.out.println("You Ran Out Of Guesses Try Again?\n 1. Y\n2. N");

            int yN = playerInput.nextInt();

            if (yN == 1){
                game();
            }



        } else if (difficulty == 2) {

            System.out.print("You Chose Medium");

            guesses += 4;

            int number = random.nextInt(150 + 1);

            System.out.println("\nYour Guesses:" + guesses);

            for (int i = 0; i < guesses; i++) {
                int guess = playerInput.nextInt();

                if (guess > number) {
                    System.out.println("Smaller Than That");
                } else if (guess < number) {
                    System.out.println("Bigger Than That");
                }else if (guess == number) {
                    System.out.println("CORRECT!");

                    System.out.println("Try Again?\n1. Y\n2. N");

                    int yN = playerInput.nextInt();

                    if (yN == 1){
                        game();
                    }
                }

            }

            System.out.println("You Ran Out Of Guesses Try Again?\n1. Y\n2. N");

            int yN = playerInput.nextInt();

            if (yN == 1){
                game();
            }



        } else if (difficulty == 3) {

            System.out.print("You Chose Hard");
            guesses += 2;

            int number = random.nextInt(300 + 1);

            System.out.println("\nYour Guesses:" + guesses);

            for (int i = 0; i < guesses; i++) {
                int guess = playerInput.nextInt();

                if (guess > number) {
                    System.out.println("Smaller Than That");
                } else if (guess < number) {
                    System.out.println("Bigger Than That");
                }else if (guess == number) {
                    System.out.println("CORRECT!");

                    System.out.println("Try Again?\n1. Y\n2. N");

                    int yN = playerInput.nextInt();

                    if (yN == 1){
                        game();
                    }

                }

            }

            System.out.println("You Ran Out Of Guesses Try Again?\n1. Y\n2. N");

            int yN = playerInput.nextInt();

            if (yN == 1){
                game();
            }


        } else {
            System.out.println("Invalid Input, Try Again!\n\n\n\n\n\n\n\n\n\n");
            game();
        }
    }
}