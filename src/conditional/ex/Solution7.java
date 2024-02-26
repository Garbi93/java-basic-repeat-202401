package conditional.ex;

public class Solution7 {
    public static void main(String[] args) {
        int x = 4;
        String state = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + state);
    }
}
