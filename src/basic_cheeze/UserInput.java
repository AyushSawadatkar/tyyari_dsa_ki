package basic_cheeze;

import java.util.Scanner;

public class UserInput {
    static void main() {
        Scanner sc = new Scanner(System.in);// input lene keliye
        System.out.println("Enter the raduis:");
        double r = sc.nextDouble();
        double a = 3.1415 * r * r;
        System.out.println(a);

    }
}
