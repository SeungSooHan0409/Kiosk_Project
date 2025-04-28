package project.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuItem {

    // 속성

    String name;
    double price;
    String explain;

    // 생성자
    // 버거메뉴 생성시 키오스크에 메뉴가 등록되도록 수정
    MenuItem(String name, double price, String explain, Kiosk kiosk) {
        this.name = name;
        this.price = price;
        this.explain = explain;
        kiosk.menuItems.add(this);
    }

    // 기능


}


