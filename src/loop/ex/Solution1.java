package loop.ex;

public class Solution1 {
    public static void main(String[] args) {
        int count1 = 1;
        while (count1 <= 10) {
            System.out.println("와일문으로 : " + count1);
            count1++;
        }

        System.out.println();

        int count2 = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("for문으로 : " + count2);
            count2++;
        }
    }
}
