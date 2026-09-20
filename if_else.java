import java.util.*;

public class if_else {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age here: ");
        int n = sc.nextInt();

        if(n<18){
            System.out.println("Your age is less than 18 '_' ");
        } else if (n>=18){
            System.out.println("Now you can greater than 18 '-' ");

        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
