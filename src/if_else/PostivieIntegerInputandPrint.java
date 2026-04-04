package if_else;

import java.util.Scanner;

public class PostivieIntegerInputandPrint {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0)
            System.out.println("Riya");
        else if(n%3==0)
            System.out.println("Banu");
        else if(n%5==0 )
            System.out.println("Apurva");
        else
            System.out.println("Isha");
    }
}
