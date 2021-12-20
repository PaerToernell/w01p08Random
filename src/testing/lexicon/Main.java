package testing.lexicon;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int aGuess;
        int howMany=0;
        Random rand = new Random();
        Scanner sc= new Scanner(System.in);
        int upperbound = 500;
        int int_random = rand.nextInt(upperbound);
        boolean imDone = false;

        while(!imDone) {
            System.out.println("Enter a guess between 0 and 500");
            aGuess= sc.nextInt();
            if (aGuess==-1) {
                imDone=true;

            }
            if (int_random==aGuess) {
                System.out.println("You Did It on "+howMany+" tries");
                imDone=true;
            }

            if (int_random<aGuess) {
                System.out.println("To High");
                howMany=howMany+1;

            }

            if (int_random>aGuess) {
                System.out.println("To Low");
                howMany=howMany+1;
            }


        }
    }
}