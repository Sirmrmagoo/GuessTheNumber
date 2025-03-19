import java.util.InputMismatchException;
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


        try {

            System.out.println("\nWelcome To Guess The Number!\n\nYou Have To Guess The Number That I Think of.\n\nChose Your Difficulty\n1. Easy (Guess 1-100, 5 Guesses) \n2. Medium (Guess 1-150, 4 Guesses)\n3. Hard (Guess 1-300, 2 Guesses)");

            int difficulty = playerInput.nextInt();


            if (difficulty == 1) {
                guesses += 5;

                System.out.println("You Chose Easy\nLet's Start!\n1");

                int number = random.nextInt(100 + 1);


                for (int i = 0; i < guesses; i++) {

                    System.out.print("Your Guess? : ");

                    int guess = playerInput.nextInt();


                    if (guess > number) {
                        System.out.println("Smaller Than That\n");


                    } else if (guess < number) {
                        System.out.println("Bigger Than That\n");


                    } else if (number == guess) {
                        System.out.println("CORRECT!\n It Took You " + i + " Attempts!");
                        retry();
                    }

                }

                retry();
            }

            if (difficulty == 2) {
                guesses += 4;

                System.out.println("You Chose Easy\nLet's Start!\n1");

                int number = random.nextInt(150 + 1);


                for (int i = 0; i < guesses; i++) {

                    System.out.print("Your Guess? : ");

                    int guess = playerInput.nextInt();


                    if (guess > number) {
                        System.out.println("Smaller Than That\n");


                    } else if (guess < number) {
                        System.out.println("Bigger Than That\n");


                    } else if (number == guess) {
                        System.out.println("CORRECT!\n It Took You " + i + " Attempts!");
                        retry();
                    }

                }

                retry();
            }

            if (difficulty == 3) {
                guesses += 2;

                System.out.println("You Chose Easy\nLet's Start!\n1");

                int number = random.nextInt(300 + 1);


                for (int i = 0; i < guesses; i++) {

                    System.out.print("Your Guess? : ");

                    int guess = playerInput.nextInt();


                    if (guess > number) {
                        System.out.println("Smaller Than That\n");


                    } else if (guess < number) {
                        System.out.println("Bigger Than That\n");


                    } else if (number == guess) {
                        System.out.println("CORRECT!\n It Took You " + i + " Attempts!");
                        retry();
                    }

                }

                retry();
            }


        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
            retry();
        }
    }


    private static void retry(){
        Scanner playerInput = new Scanner(System.in);

        System.out.println("Retry?\n1. Yes\n2. No");

        int yN = playerInput.nextInt();

        try {
            if (yN == 1) {
                game();
            }
        }catch (InputMismatchException e ) {
            System.out.println("Invalid Input");
        }
    }
}