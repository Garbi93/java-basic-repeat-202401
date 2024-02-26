package method.ex;

public class Solution1Ref {
    public static void main(String[] args) {
        int sum = sum(1, 2, 3);
        double average = average(sum);
        System.out.println("평균값: " + average);
        sum = sum(15, 25, 35);
        average = average(sum);
        System.out.println("평균값: " + average);
    }
    public static int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
    public static double average(double a) {
        return a / 3;
    }

}
