package project.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    // 속성
    private List<MenuItem> orderList;
    private double orderAmount;
    private int orderQuantity;

    // 생성자

    Cart(){
        this.orderList = new ArrayList<>();
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

    // 주문수량조회 기능
    public int getOrderQuantity() {
        return this.orderQuantity;
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

    // 주문수량설정 기능
    public void plusQuantity(int a){
        this.orderQuantity = a;
    }

    // 장바구니 출력조건 설정
    public boolean showOrderMenu(){
        boolean result = this.orderList.isEmpty();
        return result;
    }

}
