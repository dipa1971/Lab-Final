import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        int count = 0;

        System.out.print("Enter a string: ");
        str = input.nextLine();

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                count++;
            }
        }

        System.out.println("The number of consonants in the string is: " + count);
    }
}
