package array.ex;

import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력하세요 : ");
        int studentCount = sc.nextInt();

        int[][] scores = new int[studentCount][3];
        int[] sum = new int[4];
        double[] avg = new double[4];
        String[] subject = {"국어", "영어", "수학"};

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "번 학생의 성절을 입력하세요.");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subject[j] + " 점수 : ");
                int score = sc.nextInt();
                scores[i][j] = score;
                sum[i] += scores[i][j];
            }
            avg[i] = (double) sum[i] / 3;
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "번 학생의 총점 : " + sum[i] + ", 평균 : " + avg[i]);
        }
    }
}
