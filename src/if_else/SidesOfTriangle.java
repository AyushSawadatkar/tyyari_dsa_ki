package if_else;

import java.util.Scanner;

public class SidesOfTriangle {
    static void main() { Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b>c || b+c>a || c+a>b)
            System.out.println("they can be sides of a triangle");
        else
            System.out.println("they can not be sides of a triangle");

    }
}
