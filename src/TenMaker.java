//wasn't sure if it was meant to test various integers, so I made it user input dependent
import java.util.Scanner;

public class TenMaker {
    public static String makes10(int i, int j) {
        int k = i + j;
        String isTrue;
        if (k == 10) {
            isTrue = "The numbers add up to ten";
        }
        else {
            isTrue = "The numbers don't add up to ten";
        }
        return isTrue;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input first integer");
        int i = in.nextInt();
        System.out.println("input second integer");
        int j = in.nextInt();
        System.out.print(makes10(j, i));
    }
}
