package basic_cheeze;

import java.util.Scanner;

public class SumOf2or3Num {
    static void main() {
        Scanner sc = new Scanner(System.in);//input lene keliye
        System.out.print("enter the num1 :");
        int a = sc.nextInt();

        System.out.print("enter the num2 :");
        int b = sc.nextInt();

        System.out.print("Enter the num3 :");
        int c = sc.nextInt();

        int d = a * b * c;

        System.out.print("Answer is :");
        System.out.print(d);

    }
}
