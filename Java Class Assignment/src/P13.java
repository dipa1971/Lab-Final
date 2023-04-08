import java.util.Scanner;
public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String str1 = str.replaceAll("a", "");
        str1 = str1.replaceAll("e", "");
        str1 = str1.replaceAll("i", "");
        str1 = str1.replaceAll("o", "");
        str1 = str1.replaceAll("u", "");

        System.out.println(str1);
    }
}
