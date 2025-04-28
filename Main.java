package project.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Kiosk kiosk = new Kiosk();
        // 버거 객체생성
        MenuItem shackBurger = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거", kiosk);
        MenuItem smokeShack = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", kiosk);
        MenuItem cheeseBurger = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", kiosk);
        MenuItem hamburger = new MenuItem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거", kiosk);
        MenuItem mushroomBurger = new MenuItem("MushroomBurger", 7.5, "버섯이 들어간 맛있는 버거", kiosk);
        MenuItem shirimpBurger = new MenuItem("ShirimpBurger", 6.4, "새우패티가 들어간 새우버거", kiosk);

        kiosk.start();


    }
}
