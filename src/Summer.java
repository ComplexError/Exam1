import java.util.Scanner;
public class Summer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double i = 1;
        double total = 0;

        System.out.println("Input a 0 to escape the loop");

        while (i != 0) {
            System.out.println("input a number");
            i = in.nextDouble();
            total += i;
        }
        System.out.println("The total is " + total);
    }
}
