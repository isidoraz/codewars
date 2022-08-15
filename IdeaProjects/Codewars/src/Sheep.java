public class Sheep {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countSheep(n));
    }

    public static String countSheep(int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            result += i + " sheep...";
        }
        return result;
    }
}
