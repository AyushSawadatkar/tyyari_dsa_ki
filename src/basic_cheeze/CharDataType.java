package basic_cheeze;

public class CharDataType { //ASCII Value
    static void main() {
        // Typecasting - ek data type se doosra datatype converison
        char ch = 'A';
        int x = ch; // implicit typecasting
        System.out.println(x);

        char piyush = 'a';
        int y = (int)piyush; // explicit typecasting
        System.out.println(y);

        char h = '5';
        System.out.println(h+0);

        //Integer to Character
        int m = 90;
        char v = (char)m;
        System.out.println(v);
        //only follow explicit typecasting




    }
}
