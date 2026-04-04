package if_else;

import java.util.Scanner;

public class FourDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        if (n>999 && n<10000)
            System.out.println("4 digit number");
        else
            System.out.println(" not 4 digit number");
    }
}
