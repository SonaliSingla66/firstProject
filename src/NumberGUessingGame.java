import java.util.Scanner;

public class NumberGUessingGame {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess my number, its between 1-100: ");

        boolean tryGuess = true;
        while (tryGuess) {
            System.out.println("enter number: ");
            int guess = sc.nextInt();
            if (number == guess) {
                System.out.println("congrats you guessed right");
                tryGuess = false;
            }else if (guess>number){
                System.out.println("your number was greater than my number.., guess again: ");
            }else
            {
                System.out.println(" your number was smaller than my number.., guess again: ");
            }
        }
        System.out.println("my number was: "+number);
        System.out.println("play again ");
    }
}