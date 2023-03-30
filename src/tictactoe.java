import java.util.Scanner;
public class tictactoe {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of tictactoe");
        int size = input.nextInt();
        String[][] a = get(size);
        String[] token = {"X","O"};
        int result;
        do{
            print(a);
        }while(result==2);
    }
    public static String[][] get(int size){
        String [][] a= new String[size][size];
        for(int i = 0 ; i < size ; i++){
            for(int j=0; j< size;j++) {
                a[i][j] = "   ";
            }
        }
        return a;
    }
    public static void print(String[][]a){
        System.out.println("\n______________");

    }
}
