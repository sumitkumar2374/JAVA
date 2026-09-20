// import java.util.*;
// public class function {

//     public static void callName(String name){
//         System.out.println("Hello " + name + ", How are you?");
//         return;
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your name: ");
//         String name = sc.nextLine();
//         callName(name);
//         sc.close();
//     }
// }


// import java.util.*;

// public class function {
//     public static int calculateSum(int a, int b){
//         int sum = a + b;
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter second number: ");
//         int b = sc.nextInt();
//         int value = calculateSum(a, b);
//         System.out.println("The sum of " + a + " and " + b + " is: " + value);
//         sc.close();
//     }
// }

import java.util.*;

public class function {
    public static void calculateFact(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println("The factorial of " + n + " is: " + fact);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial: ");
        int n = sc.nextInt();
        calculateFact(n);
        sc.close();
    }
}
