/*
	주제 : 컬렉션 + 제네릭 응용 - 게시판 글 목록 만들기 (JSP 웹개발 핵심 패턴 미리보기)

	

	

import java.util.ArrayList;
import java.util.List;

class BoardDTO {
	// 멤버변수 : DB 컬럼 하나가 변수 하나에 대응된다.
	// private : 외부에서 변수에 직접 접근 하지 못하게 막고 (정보은닉)
	// 아래의 getter 역할을 하는 메소드를 통해서만 값을 꺼내게 한다.(DTO 작성 표준)
	private int no; // 글 번호
	private String title; // 글 제목
	private String writer; // 작성자
	private int hit; // 조회수

	// 생성자 : 글 1건의 데이터 4개를 전달받아 멤버 변수에 저장하며 객체를 만든다.
	public BoardDTO(int no, String title, String writer, int hit) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.hit = hit;
	}

	// getter 메소드들 : private 멤버 변수의 값을 외부( .jsp 화면 등)에서 꺼낼때 사용
	public int getNo() {
		return no;
	}

	public String getTitle() {
		return title;
	}

	public String getWriter() {
		return writer;
	}

	public int getHit() {
		return hit;
	}

	// 글조회수를 1올리는 메소드 (상세보기를 할 때마다 호출된다)
	public void increaseHit() {
		hit = hit + 1;
	}
}

public class BoardListExample {

	public static void main(String[] args) {
		// =============================================================
		// 1. 글 목록을 담을 가변 배열 생성 : 제네릭에 "내가 만든 클래스명을 지정"
		// =============================================================

		// BoardDTO 객체만 저장할 수 있는 ArrayList 가변 배열 생성 (업캐스팅)
		// - <BoardDTO> 지정으로 add는 BoardDTO만 받고, get은 BoardDTO로 반환한다
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();

		// ============================================================================================
		// 2. 글 3건을 BoardDTO 객체로 만들어 ArrayList 배열에 추가해서 각각 저장 (DB에서 3행을 조회해 온 상황을 흉내)
		// ============================================================================================

		// 글 1건의 데이터가 저장된 class BoardDTO 의 객체를 생성해서 ArrayList배열에 저장
		boardList.add(new BoardDTO(1, "가입 인사드립니다", "kim", 5));
		boardList.add(new BoardDTO(2, "자바 질문 있어요", "lee", 3));
		boardList.add(new BoardDTO(3, "스터디 모집합니다", "park", 3));
		
		//============================================================
		//글목록 전체 출력(JSP에서 <table>에 반복 출력처리)
		
		System.out.println("번호\t제목\t\t작성자\t조회수");
		System.out.println("-------------------------------------");

		for(BoardDTO dto : boardList ) {
			System.out.println(dto.getNo()+"\t"
								+dto.getTitle()+"\t"			
								+dto.getWriter()+"\t"			
								+dto.getHit());
			
		
		
		}
		int targetNo = 2;
		
		System.out.println("====="+targetNo+"번 글 상세보기====");
		for(BoardDTO dto:boardList) {
			
			if(dto.getNo()==targetNo) {
				
				dto.increaseHit();
				
				System.out.println("제목: "+dto.getTitle());
				System.out.println("작성자: "+dto.getWriter());
				System.out.println("조회수: "+dto.getHit());
				
			}
		}//for
		
		System.out.println("상세보기후 목록 다시출력");
		for(BoardDTO dto : boardList) {
		System.out.println(dto.getNo()+"\t"
							+dto.getTitle()+"\t"			
							+dto.getWriter()+"\t"			
							+dto.getHit());
		}
		
		
	}

}
















































