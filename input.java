// import java.util.Scanner;

// public class input {
//     public static void main(String[] args) {
//         try (Scanner inp = new Scanner(System.in)) {
//             //String name = inp.next();
//             String name = inp.nextLine();
//             System.out.println(name);

//         }

//     }
// }

// Method 2
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
            //String name = inp.next();
            
            String name = inp.nextLine();
            //nextInt();
            //nextFloat();
            System.out.println(name);

        inp.close();

    }
}

