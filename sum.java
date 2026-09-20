import java.util.*;

public class sum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your 1st Number: ");
        int a = sc.nextInt();

        System.out.print("Enter your 2nd Number: ");
        int b = sc.nextInt();

        int add = a+b;
        System.out.print("Sum is: " + add );

        sc.close();
    }

}


// 2nd input example
// import java.util.Scanner;

// public class sum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your name: ");
//         String name = sc.nextLine();

//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();

//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);

//         sc.close();
//     }
// }