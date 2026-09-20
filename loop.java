// public class loop {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 10; i++) {
//             System.out.print(i+" "); // ye wala line print krega jisme ki smae line with space print hoga, agr wahi pr println use krte to new line pr print hoga
//         }
//     }
// }


import java.util.*;

public class loop { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to print its multiplication table: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
}
