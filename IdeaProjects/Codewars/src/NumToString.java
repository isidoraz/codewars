import java.util.Scanner;

public class NumToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Broj: ");
        int number = sc.nextInt();

        System.out.println(numberToString(number));
    }

    public static String numberToString(int number) {
        return number + "";
//        return Integer.toString(number);
//        return String.valueOf(number);
    }
}
