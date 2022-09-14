import java.util.Scanner;

public class GuesNumber {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Guess number.");
        for (int i = 10; i <= 30; i+= 10) playLevel(i);
        System.out.println("You have won");
        scan.close();
    }

    private static void playLevel(int range) {
        int number = (int)(Math.random() * range);
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
