package scanner.ex;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("하나의 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        if (num1 % 2 == 1) {
            System.out.println("입력한 숫자 : " + num1 + "는(은) 홀수 입니다.");
        } else  {
            System.out.println("입력한 숫자 : " + num1 + "는(은) 짤수 입니다.");
        }
    }
}
