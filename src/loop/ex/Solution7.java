package loop.ex;

public class Solution7 {
    public static void main(String[] args) {
        int rows = 3;

        String star = "*";
        for (int i = 1; i <= rows ; i++) {
            System.out.println(star);
            star += "*";
        }
    }
}
