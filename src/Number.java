import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
    private final static int MIN_VAL = 1;
    private final static int MAX_VAL = 100;
    private final static int ATTEMPTS_AMOUNT = 7;

    public static void guessNumber() {
        int randomNum = (int)(Math.random() * (MAX_VAL - MIN_VAL) + MIN_VAL);
        Scanner in = new Scanner(System.in);
        System.out.format("Hello friend!!! Input any number from %d to %d included\n", MIN_VAL, MAX_VAL);
        for (int i = 0; i < ATTEMPTS_AMOUNT; i++) {
            int num;
            try {
                num = in.nextInt();
            } catch(InputMismatchException e){
                System.out.println("Input number");
                in.next();
                i--;
                continue;
            }
            if (num < MIN_VAL || num > MAX_VAL) {
                System.out.format("Number should be between %d and %d included\n", MIN_VAL, MAX_VAL);
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






