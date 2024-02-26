package loop.ex;

public class Solution5 {
    public static void main(String[] args) {
        int max = 10;
        int sum = 0;
        for (int i = 0; i < max; i++) {
            sum = sum + (i+1);
        }
        System.out.println(sum);
    }
}
