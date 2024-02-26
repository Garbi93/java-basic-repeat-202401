package array.ex;

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요 : ");
        int count = sc.nextInt();

        System.out.println(count + "개의 정수를 입력하세요 : ");

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }
        int small = numbers[0];
        int large = numbers[0];
        for (int i = 1; i < count; i++) {
            if (small > numbers[i]) {
                small = numbers[i];
            }
            if (large < numbers[i]) {
                large = numbers[i];
            }
        }

        System.out.println("가장 큰 수 : " + large);
        System.out.println("가장 작은 수 : " + small);
    }
}
