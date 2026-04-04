package if_else;

import java.util.Scanner;

public class GreateatPositiveNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>=b && a>=c)
            System.out.println(a);
        else if(b>=a && b>=c)
            System.out.println(b);
        else if(c>=a && a>=b)
            System.out.println(c);

    }
}
