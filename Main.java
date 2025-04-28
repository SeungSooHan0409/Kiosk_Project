package project.kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuItem ShackBurger = new MenuItem("ShackBurger", 6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem SmokeShack = new MenuItem("SmokeShack", 8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem Cheeseburger = new MenuItem("Cheeseburger", 6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem Hamburger = new MenuItem("ShackBurger", 5.4,"비프패티를 기반으로 야채가 들어간 기본버거");


        // List 없니는 MenuItem 클래스를 통해 메뉴출력이 힘들다고 판단함.
        // 때문에 Hamburger 의 메서드를 통해 만들어둔 메뉴를 출력했음.
        Hamburger.menuList();


    }
}
