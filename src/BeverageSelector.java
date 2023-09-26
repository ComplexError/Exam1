import java.util.Scanner;
public class BeverageSelector {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please choose the number of the beverage you want");
        System.out.println("The available options are: (1) Water, (2) Coke, (3) Coffee");

        int beverage = in.nextInt();

        if (beverage == 1) {
            System.out.println("You chose Water");
        }
        else if (beverage == 2) {
            System.out.println("You chose Coke");
        }
        else if (beverage == 3) {
            System.out.println("You chose Coffee");
        }
        else {
            System.out.println("You chose an option not available");
        }
    }
}
