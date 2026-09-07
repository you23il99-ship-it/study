// 변수 초기화와 지역변수

public class InitTest {

    // 객체 변수
    int x;       // 기본값 0
    int y = x;   // x가 0이므로 y도 0

    // 지역변수
    public void method1(int y) {
        int i;       // 초기화하지 않으면 사용할 수 없음
        // int j = i; // 컴파일 오류
    }

    // 클래스 변수
    static int[] arr = new int[10];

    // 클래스 초기화 블럭
    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10) + 1;
        }
    }

    public static void main(String[] args) {

        // 객체 생성 없이 클래스 변수 사용
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
    }
}
