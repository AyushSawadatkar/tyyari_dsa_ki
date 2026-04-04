package if_else;

import java.util.Scanner;

public class OddEven {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        if (n % 2 == 0) { //Agar
            System.out.println("Even NUmber");
            System.out.println("meow mweo");
        } else { //magar
            System.out.println("Odd Number");
            System.out.println("shi shi");

        }
    }
}
