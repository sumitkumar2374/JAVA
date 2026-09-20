import java.util.*;
public class TwoDArray {

    public static void main(String args[]){

        // isme hum 2D array ka size user se input lenge aur fir usme values dalenge aur print karenge
        Scanner sc = new Scanner(System.in);

        //  isme hum user se 2D array ke rows aur columns ka size input lenge
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // isme hum user se 2D array ke columns ka size input lenge
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Creating a 2D array with the specified number of rows and columns
        int numbers[][] = new int[rows][cols];

        // Taking row-wise input from the user
        System.out.println("Enter the elements of the 2D array: ");
        for(int i = 0; i<rows; i++){
            // Taking column-wise input for each row
            for(int j = 0; j<cols; j++){
            numbers[i][j] = sc.nextInt();
            }
        }

        // output
        System.out.println("The elements of the 2D array are: ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }

        // Closing the scanner to prevent resource leaks
        sc.close();
    }
}