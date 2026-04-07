package loops;

public class AllOddNumDivisibleByThree {
    static void main() {
        for (int i = 1; i <=100 ; i++) {
          if(i%2==1 && i%3==0)  System.out.println(i);

        }
    }
}
