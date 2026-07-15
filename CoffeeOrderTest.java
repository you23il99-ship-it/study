//카페에서 음료를 주문한다 사이즈에따라 가격이달라지고,결제후 영수증 출력

//메뉴(menu)사이즈(size)기본가격(baseprice)
//최종계산(calcPrice)영수증출력(printReceipt

public class CoffeeOrderTest {

	String menu;
	String size;
	int baseprice;

	int calcPrice() {
		if (size.equals("GRANDE")) {
			return baseprice + 500;

		} else {
			return baseprice;
		}
	}// ← 이 중괄호가 반드시 있어야 함

	void printReceipt() {
		int price = calcPrice();

		System.out.println("메뉴:" + menu + "사이즈:" + size + "가격:" + calcPrice());

	}

	public static void main(String[] args) {
		CoffeeOrderTest coffee = new CoffeeOrderTest();

		coffee.menu = "아메리카노";
		coffee.size = "GRANDE";
		coffee.baseprice = 4500;

		coffee.printReceipt();
	}

}
