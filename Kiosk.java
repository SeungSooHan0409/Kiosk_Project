package project.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 속성
    List<MenuItem> menuItems;


    // 생성자
    Kiosk(){
        this.menuItems = new ArrayList<>();
    }

    // 기능
    Scanner scanner = new Scanner(System.in);
    public void start(){
        // 반복문 작성
        while(true) {
            System.out.println("[ SHAKESHAKE MENU ]");
            // 출력을 가지런히 하기위해 포맷팅되는 printf 를 사용함.
            int i = 1;
            for (MenuItem menuList : menuItems) {
                System.out.printf("%-1d. %-18s | W %-5.1f | %s\n", i, menuList.name, menuList.price, menuList.explain);
                i++;
            }

            System.out.println("0. 종료    |  종료");
            System.out.print("종료하시려면 0을 입력하세요 : ");
            String exitTrigger = scanner.nextLine();
            System.out.println("입력확인 : " + exitTrigger);
            if (exitTrigger.equals("0")) {
                break;
            }
        }
    }

    // 메뉴아이템을 수동으로 추가하는 기능
    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

}
