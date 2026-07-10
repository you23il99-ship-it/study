


//다양한 형태의 메소드 만들어 보기

public class Example4 {
	
	
	
	// 	printstudentinfo:학생명 하나를 문자열로 받고,학생나이 하나를 전달받아 
	 //	이름:홍길동,나이20 출력후 줄바꿈하는 기능
	 	public static void printstudentinfo(String name, int age) {
	 		System.out.println("이름:"+name+",나이:"+age);
	 	}
	// 	add:정수2개를 전달받아 합을 구해 반환하는기능
	 	public static int add(int num1,int num2) {
	 		return(num1+num2);
	 	}
	 	
	// 	add2:실수 2개를 매개변수로 전달받아 합을구해 반환한다
	 	public static double add2(double num1,double num2) {
	 		return(num1+num2);
	 	}
	 

	public static void main(String[] args) {
		
		
		
		printstudentinfo("홍길동",20);
		System.out.println(add(5,10));
		System.out.println(add2(5.5,10.5));
		//위 각각의 메서드를 출력받아 호출구문을 사용해 아래처럼 출력
        /*
          홍길동,나이20
          15
          16.0
          */		
		

	}

}
