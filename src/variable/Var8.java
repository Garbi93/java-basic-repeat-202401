package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b =127; // -128 ~127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -21억 ~ 21억 정도
        long l = 922337203L; // 엄청 긴 정수 가능 (이거의 범위 넘는 정도는 거의 없다.)
        // 큰 수 일수록 메모리 공간을 많이 차지한다. -> 대부분 int 사용한다.


        // 실수
        float f = 10.0f;
        double d = 10.0; // float 보다 큰 범위
    }
}
