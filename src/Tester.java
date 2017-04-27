import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int userChoice;
        System.out.println("How big do you want grid to be?");
        userChoice = scan.nextInt();

        int[][] answerGrid = new int[userChoice][userChoice];

        System.out.println("Below is the answerGrid, with bombs placed (-1): "); //notes for me

        int x;
        Random ranGen = new Random();
        for (int i = 0; i < answerGrid.length; i++) {
            for (int j = 0; j < answerGrid.length; j++) {
                x = ranGen.nextInt(userChoice);
                if (x == 1) {
                    answerGrid[i][j] = -1;
                }
            }
        }

        System.out.println(); //just for spacing

        System.out.println(Arrays.deepToString(answerGrid).replace("], ", "\n"));

        System.out.println(); //just for spacing


        String [][] userGrid = new String [userChoice] [userChoice];

        for (int i = 0; i < userGrid.length; i++){
            for (int j = 0; j < userGrid.length; j++){
                userGrid[i][j] = " ? ";
            }
        }

        System.out.println("Below is the userGrid (all index hidden)"); //notes for me

        System.out.println(Arrays.deepToString(userGrid).replace("],", "\n"));


        int userXGuess;
        int userYGuess;

        System.out.println("Enter X axis to guess: ");
        userXGuess = scan.nextInt();

        System.out.println("Enter Y axis to guess: ");
        userYGuess = scan.nextInt();

        for (int i = 0; i < userGrid.length; i++){
            for (int j = 0; j < userGrid.length; j++){
                userGrid[userXGuess][userYGuess] = String.valueOf(answerGrid[userXGuess][userYGuess]);
            }
        }

        System.out.println(Arrays.deepToString(userGrid).replace("],", "\n"));





    }


}
