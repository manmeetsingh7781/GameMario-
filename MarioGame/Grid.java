package MarioGame;

import java.lang.reflect.Array;

public class Grid implements  variables {
    public int[][] map;

    Grid(int row, int col){
        map = new int[row][col];
    }

    public void drawGrid(){
        // each row like 10 in height
        for(int r = 1; r < map.length; r++)
        {

            // like 30 in width with the offset of 1
            // means X will go 30 times and Y 10 times with the offset of 1

            for(int c = 1; c < map[1].length;c++)
            {
                map[r][c] = r + c ;
                //System.out.print(" " + map[r][c]);

            }
            //System.out.println();
        }

    }

    public Object getMap(){
        return map;
    }
}
