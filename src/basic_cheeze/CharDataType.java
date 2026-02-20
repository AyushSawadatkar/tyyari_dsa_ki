package basic_cheeze;

public class CharDataType {
    static void main() {
        // Typecasting - ek data type se doosra datatype converison
        char ch = 'A';
        int x = ch; // implicit typecasting
        System.out.println(x);

        char piyush = 'a';
        int y = (int)piyush; // explicit typecasting
        System.out.println(y);
    }
}
