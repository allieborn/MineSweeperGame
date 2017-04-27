class GridHelper {

    static void copyHiddenCellToMirror(int x, int y, HiddenGrid hiddenGrid, MirrorGrid mirrorGrid) {
        mirrorGrid.setCell(x, y, hiddenGrid.getCell(x, y));
    } //'reveals' grid to user using the previous 'set cell' and making reference of 'get cell' method


    static int getMaxBombs(int cellCount) { //ensuring that any size grid will have at least x bombs
        int maxBombs = cellCount / 7; //ex (4x4) = 16 cells. 16/7 = 2 bombs will be placed
        if (cellCount % 10 > 0) {
            maxBombs += 1;
        }
        return maxBombs;
    }


    private static void oneUp(int x, int y, Integer[][] hiddenObject) {
        try {
            if (hiddenObject[x][y] == null) {
                hiddenObject[x][y] = 1;
            } else if (hiddenObject[x][y] >= 0) {
                hiddenObject[x][y] += 1;
            }
        } catch (IndexOutOfBoundsException doesntExist) {
        }
    }

    static void oneUpAll(int x, int y, Integer[][] hiddenObject) {
        oneUp(x - 1, y - 1, hiddenObject);
        oneUp(x, y - 1, hiddenObject);
        oneUp(x + 1, y - 1, hiddenObject);
        oneUp(x - 1, y, hiddenObject);
        oneUp(x + 1, y, hiddenObject);
        oneUp(x - 1, y + 1, hiddenObject);
        oneUp(x, y + 1, hiddenObject);
        oneUp(x + 1, y + 1, hiddenObject);
    }


    static void printGrid(Object[][] printGrid) {
        System.out.print("\t|");
        for (int s = 0; s < printGrid.length; s++) {
            System.out.print("y" + s + "\t|");
        }
        horizontalBorder(printGrid);

        for (int i = 0; i < printGrid.length; i++) {
            System.out.print("x" + i + "\t|");
            for (int j = 0; j < printGrid[i].length; j++) {
                if (printGrid[i][j].equals(null)) {

                    System.out.print("This was it!");
                } else if (printGrid[i][j].equals(-3)) {
                    System.out.print("\t|");
                } else if (printGrid[i][j].equals(-2)) {
                    System.out.print("!\t|");
                } else if (printGrid[i][j].equals(-1)) {
                    System.out.print("*\t|");
                } else if (printGrid[i][j].equals(0)) {
                    System.out.print("X\t|");
                } else {
                    System.out.print(printGrid[i][j] + "\t|");
                }
            }
            horizontalBorder(printGrid);
        }
    }

    private static void horizontalBorder(Object[][] printGrid) {
        String border;

        System.out.println();
        // creates first border
        for (int s = 0; s <= printGrid.length; s++) {
            System.out.print(" __\t");
        }
        System.out.println();
    }
}




