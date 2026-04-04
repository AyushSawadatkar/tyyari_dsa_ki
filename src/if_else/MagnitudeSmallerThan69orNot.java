package if_else;

import java.util.Scanner;

public class MagnitudeSmallerThan69orNot {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
         n = Math.abs(n);
        if(n<69) System.out.println(" magnitude smaller than 69");
        else System.out.println(" magnitude not smaller than 69");
    }
}
