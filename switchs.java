// switch (variableName) {

//     case 1:
//         // Code
//         break;

//     case 2:
//         // Code
//         break;

//     case 3:
//         // Code
//         break;

//     default:
//         // Code
// }




import java.util.Scanner;
public class  switchs { 



    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);



        System.out.print("Enter First Number: ");

        int a = sc.nextInt();



        System.out.print("Enter Second Number: ");

        int b = sc.nextInt();



        System.out.print("Enter Operator (+ - * /): ");

        char ch = sc.next().charAt(0);



        switch (ch) {



            case '+':

                System.out.println("Addition = " + (a + b));

                break;



            case '-':

                System.out.println("Subtraction = " + (a - b));

                break;



            case '*':

                System.out.println("Multiplication = " + (a * b));

                break;



            case '/':

                System.out.println("Division = " + (a / b));

                break;



            default:

                System.out.println("Invalid Operator");

        }



        sc.close();

    }

}

