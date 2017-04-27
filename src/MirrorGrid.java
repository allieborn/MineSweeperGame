class MirrorGrid {


    private Integer[][] mirrorGrid;

    MirrorGrid(int userGridRequest) {
        mirrorGrid = new Integer[userGridRequest][userGridRequest];
    }


    public void initializeGrid(Integer defaultValue) {
        for (int i = 0; i < mirrorGrid.length; i++) {
            for (int j = 0; j < mirrorGrid.length; j++) {
                setCell(i, j, defaultValue);
            }
        }
    }


    Integer getCell(int x, int y) {
        return mirrorGrid[x][y];
    }


    void setCell(int x, int y, Integer newCellValue) {
        mirrorGrid[x][y] = newCellValue;
    }


    void printGrid() {
        GridHelper.printGrid(mirrorGrid);
    }


}




