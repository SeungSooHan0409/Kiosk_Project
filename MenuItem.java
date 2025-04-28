package project.kiosk;

import java.util.Scanner;

public class MenuItem {

    // 속성
    String name;
    double price;
    String explain;

    // 생성자
    MenuItem(String name, double price, String explain){
        this.name = name;
        this.price = price;
        this.explain = explain;
    }

    MenuItem(){

    }

    // 기능

    Scanner scanner = new Scanner(System.in);

    public void menuList() {
        while (true) {
            System.out.println("[ SHAKESHAKE MENU ]");
            System.out.println("ShackBurger    | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("SmokeShack     | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("Cheeseburger   | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("Hamburger      | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("종료            |  종료");

            System.out.print("종료하시려면 0을 입력하세요 : ");
            String exitTrigger = scanner.nextLine();
            System.out.println("입력확인 : " + exitTrigger);
            if (exitTrigger.equals("0")) {
                break;
            }

            System.out.println("종료되었습니다.");

        }
    }
}
