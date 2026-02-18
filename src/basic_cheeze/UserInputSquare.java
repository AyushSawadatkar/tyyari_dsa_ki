package basic_cheeze;

import java.util.Scanner;

public class UserInputSquare {
    static void main() {
        Scanner sc = new Scanner(System.in);//input lene keliye
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int s = n * n;
        System.out.print("square is :");
        System.out.print(s);
    }
}
