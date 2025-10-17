import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int guess;
        
        System.out.println("Guess a number between 1-100");
        
        do {
            System.out.print("Guess? ");
            guess = sc.nextInt();
            attempts++;
            
            if (guess < number) {
                System.out.println("Higher");
            } else if (guess > number) {
                System.out.println("Lower");
            }
        } while (guess != number);
        
        System.out.println("Correct! The number was " + number);
        System.out.println("Attempts: " + attempts);
        
        sc.close();
    }
}