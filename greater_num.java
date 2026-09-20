import java.util.*;
public class greater_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        int a = sc.nextInt();
        System.out.println("Enter a second number: ");
        int b = sc.nextInt();
        
        if(a == b){
            System.out.println("a is equal to b");
        } else if (a>b){
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }

        sc.close();
    }
}
