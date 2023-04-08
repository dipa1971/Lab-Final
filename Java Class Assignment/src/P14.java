import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(char ch = 'a'; ch <= 'z'; ch++){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }
            else {
                String str1 = ch+"";
                str = str.replaceAll(str1, "");
            }
        }

        System.out.println(str);
    }
}
