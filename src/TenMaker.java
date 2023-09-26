
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
        int i = 4;
        int j = 7;
        System.out.print(makes10(j, i));
    }
}
