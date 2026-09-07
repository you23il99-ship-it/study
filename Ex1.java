// 객체 변수와 클래스 변수

public class Ex1 {

    // 객체 변수: 객체마다 따로 생성
    int x;

    // 클래스 변수: 모든 객체가 하나의 변수 공유
    static int y;

    // 생성자
    public Ex1(int z) {
        x += z;
        y += z;
    }

    public static void main(String[] args) {

        Ex1 ex1 = new Ex1(10);
        System.out.println("ex1.x = " + ex1.x);
        System.out.println("Ex1.y = " + Ex1.y);

        Ex1 ex2 = new Ex1(10);
        System.out.println("ex2.x = " + ex2.x);
        System.out.println("Ex1.y = " + Ex1.y);

        Ex1 ex3 = new Ex1(10);
        System.out.println("ex3.x = " + ex3.x);
        System.out.println("Ex1.y = " + Ex1.y);
    }
}
