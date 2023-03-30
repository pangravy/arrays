import java.util.Scanner;
public class sudoku {
    public static void main(String[] args){
        int[][] grid = readgrid();
        System.out.println(isvalidgrid(grid)?"is a valid grid":"is not a valid grid");
    }
    public static int[][] readgrid(){
        Scanner input = new Scanner(System.in);
        int[][] grid = new int[9][9];
        for(int i = 0 ; i < 9;i++){
            for(int j = 0; j <9;j++){
                grid[i][j]=input.nextInt();
            }
        }
        return grid;
    }
    public static boolean isvalidgrid(int[][] grid){
        for(int i = 0;i<9;i++){
            for(int j = 0; j< 9;j++){
                if(grid[i][j]<1 || grid[i][j]>9 || !(isvalid(i,j,grid))){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isvalid(int c,int b,int[][] a) {
        for (int column = 0; column < 9; column++) {
            if (column != b && a[c][column] == a[c][b]) {
                return false;
            }
        }
        for (int rows = 0; rows < 9; rows++) {
            if (rows != c && a[rows][b] == a[c][b]) {
                return false;
            }
        }
        for (int rows = (c/3)*3;rows< (c/3)*3+3;rows++){
            for(int columns = (b/3)*3;columns < (b/3)*3+3;columns++) {
                if (rows != c && columns != b && a[rows][columns] == a[c][b]) {
                    return false;
                }
            }
        }
        return true;
    }
}
