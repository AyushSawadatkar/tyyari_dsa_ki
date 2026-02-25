package basic_cheeze;

public class IncrementDecrement {
    static void main() {
        int x = 3;
        System.out.println(x);
        x += 4;//x = x + 4
        System.out.println(x);
        x -= 5;
        System.out.println(x);
        x *= 8;
        System.out.println(x);
        x /= 4;
        System.out.println(x);

        int y = 7 ;
        System.out.println(y);
        y++; // y = y + 1
        // post increment
        // phle use karo then badhaoo
        System.out.println(y);
        y--;
        System.out.println(y);

        int z =7;
        System.out.println(z);
        ++z; // z = z + 1
        // pre increment
        // phle badhoo then use karo
        System.out.println(z);
        z--;
        System.out.println(z);

        int p = 10;
        int q = p++; //q = 11
        System.out.println(p+" "+q);

    }
}
