package ref.ex;
import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int orderCnt = scanner.nextInt();

        ProductOrder[] orders = new ProductOrder[orderCnt];
        for(int i = 1; i <= orderCnt; i ++){
            System.out.println(i+"번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            scanner.nextLine();
            String productName = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            orders[i-1] = createOrder(productName, price, quantity);
        }

        printOrders(orders);

        int totalPrice = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalPrice);

    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }
    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명: "+order.productName+", 가격: "+order.price+", 수량: "+order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders){
        int totalPrice = 0;
        for(ProductOrder order : orders){
            totalPrice += order.price * order.quantity;
        }
        return totalPrice;
    }
}