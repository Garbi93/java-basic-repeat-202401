package operator;

public class Logical2 {
    public static void main(String[] args) {
        int a = 15;
        // a 는 10 보다 크고 20보다 작다
        boolean res = a > 10 && a < 20;
        System.out.println("res = " + res);
    }
}
