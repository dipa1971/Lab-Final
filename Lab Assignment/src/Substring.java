import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("Enter the start index: ");
        int st = sc.nextInt();

        System.out.println("Enter the end index: ");
        int en = sc.nextInt();

        String sub = str.substring(st, en);

        System.out.println("The substring is: " + sub);
    }
}
