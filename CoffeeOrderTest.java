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
    }

    void printReceipt() {
        int price = calcPrice();

        System.out.println("메뉴:" + menu + " 사이즈:" + size + " 가격:" + price);
    }

    public static void main(String[] args) {

        CoffeeOrderTest coffee = new CoffeeOrderTest();

        coffee.menu = "아메리카노";
        coffee.size = "GRANDE";
        coffee.baseprice = 4500;

        coffee.printReceipt();
    }
}
