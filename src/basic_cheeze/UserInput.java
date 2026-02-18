package basic_cheeze;

import java.util.Scanner;

public class UserInput {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextInt();
        double a = 3.1415 * r * r;
        System.out.println(a);

    }
}
