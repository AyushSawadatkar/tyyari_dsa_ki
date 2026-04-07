package loops;

import java.util.Scanner;

public class AP {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        for (int i = 2; i <=3*n-1 ; i+=3)     {
            System.out.println(i);

        }

    }
}
