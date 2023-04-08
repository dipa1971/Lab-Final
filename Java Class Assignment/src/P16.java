import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean isDigit = true;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) <= '0' || str.charAt(i) >= '9'){
                isDigit = false;
                break;
            }
        }

        if(isDigit){
            System.out.println("YES! Digit");
        }
        else {
            System.out.println("Not only digit");
        }
    }
}
