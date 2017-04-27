import java.util.Random;
import java.util.Arrays;

public class TheGrids {

    public static void createAnswerGrid(int userChoice, int[][] answerGrid) {
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
    }

    public static void createUserGrid(int userChoice, String [][] userGrid) {
        for (int i = 0; i < userGrid.length; i++) {
            for (int j = 0; j < userGrid.length; j++) {
                userGrid[i][j] = " ? ";
            }
        }
    }


    public static void printUserGridwAxis(int userChoise, String [][] userGrid){
      for (int i = 0; i < userGrid.length; i++) { //THIS ALLOWS TO PRINT X AXIS.
            System.out.print("X" + i);
            System.out.println(Arrays.deepToString(userGrid[i]));
        }
      }

//        for (int y = 0; y < userGrid.length; y++) { //USE THIS TO PASS IN METHOD OF PRINT X AXIS + GRID
////            System.out.println();
////        }







}
