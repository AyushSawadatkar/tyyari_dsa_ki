package basic_cheeze;

import java.util.Scanner;

public class SimpleInterest {
    static void main() {
        Scanner sc = new Scanner(System.in); // input lene keliye


        System.out.println("principle =");
        int p = sc.nextInt();


        System.out.println("rate of intrest =");
        double r = sc.nextInt();


        System.out.println("time =");
        int t = sc.nextInt();

        double SI = p * r * t / 100;
        System.out.println("SI is =" );
        System.out.println(SI);


    }
}
