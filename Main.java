package project.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 버거 객체생성
        MenuItem shackBurger = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem smokeShack = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem cheeseBurger = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamburger = new MenuItem("ShackBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
        MenuItem mushroomBurger = new MenuItem("MushroomBurger", 7.5, "버섯이 들어간 맛있는 버거");
        MenuItem shirimpBurger = new MenuItem("ShirimpBurger", 6.4, "새우패티가 들어간 새우버거");

        // List 생성 및 커스터마이징한 버거 add 하기
        List<MenuItem> menuItems = new ArrayList<>(List.of(shackBurger, smokeShack, cheeseBurger, hamburger));
        menuItems.add(mushroomBurger);
        menuItems.add(shirimpBurger);

        Scanner scanner = new Scanner(System.in);

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
}
