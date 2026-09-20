// Method 1
// public class array {
    
//     public static void main(String args[]){
//         int marks[] = new int[3];
//         marks[0] = 90;
//         marks[1] = 80;
//         marks[2] = 70;
//         for(int i = 0; i<marks.length; i++){
//             System.out.println(marks[i]);
//         }
//     }
// }

// Method 2
import java.util.*;
public class array {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int numbers[] = new int [size];
        
        // Taking input from the user
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        // Printing the elements of the array
        System.out.println("The elements of the array are: ");
        for(int i = 0; i < size; i++){
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}
