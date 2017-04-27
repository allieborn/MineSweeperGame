import java.util.Scanner;
import java.util.Arrays;

public class MainApp {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int userChoice;

        System.out.println("How big do you want grid to be?");
        userChoice = scan.nextInt();

        int[][] answerGrid = new int[userChoice][userChoice];
        String[][] userGrid = new String[userChoice][userChoice];

        //TheGrids grid = new TheGrids(); why am I still able to call, w/out doing this?
        TheGrids.createAnswerGrid(userChoice, answerGrid);
        TheGrids.createUserGrid(userChoice, userGrid);

        System.out.println(Arrays.deepToString(answerGrid).replace("], ", "\n")); //FOR PRINTING ANSWER GRID, no axis
        System.out.println(Arrays.deepToString(userGrid).replace("],", "\n")); //FOR PRINTING USER GRID, no axis


        int userXGuess;
        int userYGuess;
        boolean bombFound = false;
//
//        do {
//
//            System.out.println("Enter X axis to guess: ");
//            userXGuess = scan.nextInt();
//
//            System.out.println("Enter Y axis to guess: ");
//            userYGuess = scan.nextInt();
//
//            if ((answerGrid[userYGuess][userXGuess]) == -1) {
//                System.out.println("Oh no! That was a bomb! Game over. ");
//                System.out.println("Here's what you were playing on: ");
//                System.out.println();
//                System.out.println(Arrays.deepToString(answerGrid).replace("],", "\n").replace("-1", "B"));
//                bombFound = true;
//            } else {
//                for (int i = 0; i < userGrid.length; i++) {
//                    for (int j = 0; j < userGrid.length; j++) {
//                        userGrid[userYGuess][userXGuess] = String.valueOf(answerGrid[userYGuess][userXGuess]);
//                    }
//                }
//                System.out.println(Arrays.deepToString(userGrid).replace("],", "\n"));
//            }
//
//        } while (!bombFound);
//    }
//
//
//    //System.out.println(Arrays.deepToString(answerGrid).replace("], ", "\n"));
    }
}


