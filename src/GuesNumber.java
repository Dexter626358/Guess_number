import java.util.Scanner;

public class GuesNumber {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Guess number.");
        int range = 10;
        int number = (int)(Math.random() * range);
        playLevel(range, number);
        scan.close();
    }

    private static void playLevel(int range, int number) {
        while(true){
            System.out.println("Guess number from 1 to " + range);
            int guessNumber = scan.nextInt();
            if(guessNumber == number){
                System.out.println("That`s correct");
                break;
            } else if(guessNumber > number){
                System.out.println("The number is less");
            } else{
                System.out.println("The number is more");
            }

        }

    }
}
