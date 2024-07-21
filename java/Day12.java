import java.util.Scanner;

public class Day12 {    
    public static int[] CreateArr(int size){
        int[] arr = new int[size];
        Scanner s = new Scanner(System.in);
        for(int i=0; i<size; i++){
            System.out.println("Enter number for index"+i);
            arr[i] = s.nextInt();

        }
        return arr;
    }

    public static int[][] CreateMatrix(int rows, int columns){
        int[][] matrix = new int[rows][columns];
        Scanner s = new Scanner(System.in);
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.println("Enter number for index"+i+" "+j);
                matrix[i][j] = s.nextInt();
                }
                }
                return matrix;
    }
    public static void main(String[] args) {
        // int[] arr = CreateArr(5);
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        //     }
        int[][] arr2 = CreateMatrix(2,2);
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                System.out.println(arr2[i][j]);
                }
                }

    }
}