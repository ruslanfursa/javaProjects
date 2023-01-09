import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
    public static void guessNumber() {
        int randomNum = (int)(Math.random() * 99 + 1);
        Scanner in = new Scanner(System.in);
        System.out.println("Hello friend!!! Input any number from 1 to 100 included");
        for (int i = 0; i < 7; i++) {
            int num;
            try {
                num = in.nextInt();
            } catch(InputMismatchException e){
                System.out.println("Input number");
                in.next();
                i--;
                continue;
            }
            if (num < 1 || num > 100) {
                System.out.println("Number should be between 1 and 100 included");
                i--;
                continue;
            }

            if (num == randomNum) {
                System.out.println("You win");
                in.close();
                return;

            } else if (num < randomNum) {
                System.out.println("Your number is less than our. Try again");
            } else {
                System.out.println("Your number is more than our. Try again");
            }

        }
        System.out.println("HA-HA-HA You lost Your game is over " + randomNum);

        in.close();
    }
}






