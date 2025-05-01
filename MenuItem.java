package project.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuItem {

    // 속성

    private String name;
    private double price;
    private String explain;

    // 생성자
    // 버거메뉴 생성시 키오스크에 메뉴가 등록되도록 수정
    MenuItem(String name, double price, String explain, Menu menu) {
        this.name = name;
        this.price = price;
        this.explain = explain;
        menu.addMenuitems(this);
    }


    // 기능
    // 세터 설정
    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setExplain(String explain){
        this.explain = explain;
    }

    // 게터 설정
    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public String getExplain(){
        return this.explain;
    }

}


