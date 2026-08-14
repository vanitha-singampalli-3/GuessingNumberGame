import java.util.Scanner;
import java.util.Random;
public class GuessingGame {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int SecretNumber=random.nextInt(100)+1;
        int maxattempts=7;
        int attemptused=0;
        while (attemptused<maxattempts){
            System.out.println("Guess:");
            int guess=sc.nextInt();
            attemptused+=1;
            if (guess==SecretNumber) {
                System.out.println("You are win");
                break;
            }else if (guess< SecretNumber) {
                System.out.println("too low");
            }else{
                System.out.println("too high");
            }

        }

    }
}
