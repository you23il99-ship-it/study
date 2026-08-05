package 날짜와시간관련클래스들;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeWebExample {
	//게시글 하나의 정보가 저장되는 역할을 하는 내부 클래스 선언
	static class Board{
		
		int boardNo;
		String title;
		String content;
		LocalDateTime createdAt;
		
		Board(int boardNo,String title,String content ){
			this.boardNo= boardNo;
			this.title=title;
			this.content=content;
			this.createdAt=LocalDateTime.now();
			
		}
		
		static class BoardService{
			
			boolean canEdit(Board board) {
				//현재 날짜밑 시간 정보가 저장된 LocalDateTime객체 얻기
				LocalDateTime now = LocalDateTime.now();
	
				
				LocalDateTime createdTime = LocalDateTime.createdAt;
				
				
				long hoursBeteen = createdTime.until(now, ChronoUnit.HOURS);
				
				return hoursBeteen<24;
				
			}
		}
	}
			

	public static void main(String[] args) {

			Board board = new Board(1, "LocalDateTime예제", "웹개발 응용");
			
			board.createdAt = board.createdAt.minusHours(23);
			
			BoardService service = new BoardService();
			
			boolean result = service.caEdit(board);
			
			if(result) {
				System.out.println("게시글 수정 가능");
			}else {
				System.out.println("게시글 수정 불가");
			}
			
			LocalDateTime now = LocalDateTime.now();
			LocalDateTime future = now.plusDays(1);
			LocalDateTime past = now.minusDays(1);
			
			System.out.println("futere가 now이후 인가?"+future.isAfter(now));
			System.out.println("past가 now이전 인가?"+past.isBefore(now));
			System.out.println("now가 no와 같은가?"+now.isEqual(now));
			
			now.until(future, ChronoUnit.DAYS);
			System.out.println("현재와 미래날짜 차이: "+daysBteen+"일");
			
			
			
				
	}

}










































































