package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        message("Hello World!", 3);
        System.out.println();
        message("Hello World!", 5);
        System.out.println();
        message("Hello World!", 7);

    }
    public static void message(String message, int timer) {
        for (int i = 0; i < timer; i++) {
            System.out.println(message);
        }
    }
}
