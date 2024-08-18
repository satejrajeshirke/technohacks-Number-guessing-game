import java.util.Random;
import java.util.Scanner;

     public class  numberguessinggame{
    private static final int MAX_ATTEMPTS = 5;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
        private static int score = 0;
         public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        while (playAgain) {
            int numberToGuess = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
            int attempts = 0;
            boolean guessedCorrectly = false;
            System.out.println("Guess the number between " + MIN_NUMBER + " and " + MAX_NUMBER + ":");
            while (attempts < MAX_ATTEMPTS) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                if (userGuess < MIN_NUMBER || userGuess > MAX_NUMBER) {
                    System.out.println("Please guess a number within the specified range.");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                } else {
                    guessedCorrectly = true;
                    break;
                }
                }
            if (guessedCorrectly){
                System.out.println("Congratulations  You've guessed the number.");
                score++;
            } else {
                System.out.println("Sorry, you've used all your attempts. The number was " + numberToGuess + ".");
            }
            System.out.println(" your current score is: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
            }

        System.out.println("Thank you for playing Your final score is: " + score);
        scanner.close();
           }
          }
