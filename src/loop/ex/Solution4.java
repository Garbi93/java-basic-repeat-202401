package loop.ex;

public class Solution4 {
    public static void main(String[] args) {
        int max = 10;
        int count = 1;
        int sum = 0;
        while (count <= max) {
            sum = sum + count;
            count++;
        }
        System.out.println(sum);
    }
}
