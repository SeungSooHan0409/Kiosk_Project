package project.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    // 속성
    private List<MenuItem> orderList;
    private double orderAmount;
    private List<Integer> orderQuantity;

    // 생성자

    Cart(){
        this.orderList = new ArrayList<>();
        this.orderQuantity = new ArrayList<>();
    }


    // 기능

    // 게터 설정
    // 장바구니조회 기능
    public List<MenuItem> getCartList() {
        return this.orderList;
    }

    // 주문금액조회 기능
    public double getOrderAmount() {
        return this.orderAmount;
    }

    // 메뉴1개 주문수량조회 기능
    public int getOrderQuantity(int a) {
        return this.orderQuantity.get(a);
    }

    // 반복문에 사용할 리스트 길이 반환
    public int orderListsize() {
        return orderList.size();
    }

    // 장바구니에 담긴 메뉴가격 출력
    public double getItemPrice(int a) {
        return orderList.get(a).getPrice();
    }

    // 장바구에 담긴 메뉴 1개만 출력
    public MenuItem getCartItem(int a) {
        return orderList.get(a);
    }

    // 수량 리스트 가져오기
    public List<Integer> getCartQuantity() {
        return orderQuantity;
    }

    // 세터 설정
    // 장바구니에 상품담기
    public void addCart(MenuItem menuItem) {
        this.orderList.add(menuItem);
    }

    // 장바구니에 상품빼기
    public void removeCart(int a) {
        this.orderList.remove(a);
    }

    // 주문수량추가 기능
    public void plusQuantity(int a){
        this.orderQuantity.add(a);
    }

    // 장바구니 출력조건 설정
    public boolean showOrderMenu() {
        boolean result = this.orderList.isEmpty();
        return result;
    }

    // 장바구니 상품리스트 교체
    public void changeOrderList(List<MenuItem> menuItems) {
        this.orderList = menuItems;
    }

    public void changeOrderQuantityList(List<Integer> quantity) {
        this.orderQuantity = quantity;
    }

}
