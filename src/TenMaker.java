//wasn't sure if it was meant to test various integers, so I made it user input dependent
import java.util.Scanner;

public class TenMaker {
    public static String makes10(int i, int j) {
        String isTrue;
        int k = i + j;

        if (k == 10) {
            isTrue = "The numbers add up to 10";
        }
        else {
            isTrue = "The numbers do not add up to 10";
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
