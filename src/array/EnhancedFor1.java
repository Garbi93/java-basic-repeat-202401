package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문으로 탐색
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        System.out.println();

        // 향상된 for 문
        for (int number : numbers) {
            System.out.println(number);
        }

        // for-each를 사용할 수 없는경우 -> 증가하는 index값 필요할 때
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + " 번의 결과는 : "  + numbers[i]);
        }
    }
}
