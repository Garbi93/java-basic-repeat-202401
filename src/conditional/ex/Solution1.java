package conditional.ex;

public class Solution1 {
    public static void main(String[] args) {
        int score = 40;
        String status;
        if (score >= 90) {
            status = "A";
        }else if (score >= 80) {
            status = "B";
        } else if (score >= 70) {
            status = "C";
        } else if (score >= 60) {
            status = "D";
        } else {
            status = "F";
        }
        System.out.println("학점은 " + status + " 입니다.");
    }
}
