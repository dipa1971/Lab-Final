import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();

        if(str.equals(str2)){
            System.out.println("Strings are same");
        }
        else {
            System.out.println("Not same");
        }
    }
}
