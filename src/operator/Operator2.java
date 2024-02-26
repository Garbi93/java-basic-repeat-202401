package operator;

// 문자열 더하기
public class Operator2 {
    public static void main(String[] args) {
        // 문자열과 문자열 더하기1
        String res1 = "hello " + "world";
        System.out.println("res1 = " + res1);

        // 문자열 과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";

        String res2 = s1 + s2;
        System.out.println("res2 = " + res2);

        // 문자열과 숫자 더히기1
        String res3 = "a + b = " + 10;
        System.out.println("res3 = " + res3);

        // 문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String res4 = str + num;
        System.out.println("res4 = " + res4);

    }
}
