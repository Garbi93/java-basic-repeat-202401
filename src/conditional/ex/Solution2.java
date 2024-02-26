package conditional.ex;

public class Solution2 {
    public static void main(String[] args) {
        int dis = 7;
        String vic;
        if(dis<= 1) {
            vic = "도보";
        } else if (dis <= 10) {
            vic = "자전거";
        } else if (dis <= 100) {
            vic = "자동차";
        } else {
            vic = "비행기";
        }
        System.out.println(vic + "을(를) 이용하세요");
    }
}
