import java.util.Random;

class HiddenGrid {

    private Integer[][] hiddenGrid; //declares the 2d array, named 'hiddenGrid'

    HiddenGrid(int userGridRequest) { //hiddenGrid will be size that user determines
        hiddenGrid = new Integer[userGridRequest][userGridRequest];
    }


    void initializeGrid() {
        int maxBombs = GridHelper.getMaxBombs(hiddenGrid.length * hiddenGrid.length); //max bombs, as determined by other method
        int bombsPlaced = 0; //num of bombs placed

        Random bombRandGen = new Random();
        int cycleCap = bombRandGen.nextInt(5)
                + bombRandGen.nextInt(5)
                + bombRandGen.nextInt(5); //creates 3 rand numbers, then adds
        int cycleCellCount = 0;

        for (int i = 0; i < hiddenGrid.length; i++) {
            for (int j = 0; j < hiddenGrid[i].length; j++) {
                if (hiddenGrid[i][j] == null) {
                    setCell(i, j, 0);
                }

                if ((cycleCellCount == cycleCap) && (bombsPlaced < maxBombs)) {
                    setCell(i, j, -1);
                    GridHelper.oneUpAll(i, j, hiddenGrid);
                    ++bombsPlaced;
                    cycleCellCount = 0;
                    cycleCap = bombRandGen.nextInt(5)
                            + bombRandGen.nextInt(5)
                            + bombRandGen.nextInt(5);

                } else {
                    ++cycleCellCount;
                }
            }
        }
    }


    int getCell(int x, int y) { //method to display cells
        return hiddenGrid[x][y];
    }

    void setCell(int x, int y, int newValue) { //method to set cells
        hiddenGrid[x][y] = newValue;
    }

    void printGrid() { //method to print answer grid
        GridHelper.printGrid(hiddenGrid);
    }

}










