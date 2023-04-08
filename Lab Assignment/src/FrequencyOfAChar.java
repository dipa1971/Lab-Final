import java.util.Scanner;

public class FrequencyOfAChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char ch = sc.next().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++){
            if(ch == str.charAt(i)){
                count++;
            }
        }
        System.out.println("Tha character '"+ch+"' repeat "+count+" times");
    }
}
