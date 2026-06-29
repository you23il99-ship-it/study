[Opr08.java](https://github.com/user-attachments/files/29457865/Opr08.java)

  //증가연산자++ 감소연산자 --의 선행처리 후행처리

public class Opr08 {

	public static void main(String[] args) {
		
		int a=10, b=10;
		
		System.out.println(b++);
		System.out.println(b);
		
		
		
		System.out.println(++a);
		
		
		System.out.println(a);
		
		a=b=10;//<-연산순서 역순10->b->a
		
		int c;
		//변수 a값이 먼저1증가하고 c에 대입이 되어 11대입
		c= ++a;
		
		System.out.println(c+"=>"+a);
		
		
		c=b++;
		System.out.println(c+"=>"+b);
		
		

	}

}











