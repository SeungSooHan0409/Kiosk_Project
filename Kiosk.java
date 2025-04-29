package project.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 속성
     Menu menu;


    // 생성자
    Kiosk(){
        this.menu = new Menu();
    }


    // 기능
    Scanner scanner = new Scanner(System.in);
    public void start(){
        // 반복문 작성
        while(true) {

                int j = 1;
                for (String category : menu.category) {
                    System.out.printf("%-1d. %-18s \n", j, category);
                    j++;
                }
                System.out.println("0. 종료    |  종료");
                System.out.print("카테고리를 선택해주세요 : ");
                String selectCategory = scanner.nextLine();

                if (!selectCategory.equals("1") && !selectCategory.equals("0")) {
                    throw new IllegalArgumentException("잘못된 입력값입니다.");
                } else if(selectCategory.equals("1")){
                    while(true) {
                    System.out.println("[ SHAKESHAKE MENU ]");
                    // 출력을 가지런히 하기위해 포맷팅되는 printf 를 사용함.
                    int i = 1;
                    for (MenuItem menuList : menu.menuItems) {
                        System.out.printf("%-1d. %-18s | W %-5.1f | %s\n", i, menuList.name, menuList.price, menuList.explain);
                        i++;
                    }

                    System.out.println("0. 뒤로가기");
                    System.out.print("원하시는 메뉴를 선택하세요 : ");
                    String selectMenu = scanner.nextLine();
                    if(!selectMenu.equals("0") && !selectMenu.equals("1") && !selectMenu.equals("2") && !selectMenu.equals("3") && !selectMenu.equals("4") && !selectMenu.equals("5") && !selectMenu.equals("6")){
                        throw new IllegalArgumentException("잘못된 입력값입니다.");
                    }
                    switch (selectMenu) {
                        case "1": {
                            System.out.println("ShakeBurger 를 주문하시겠습니까? (Y/N)");
                            String confirm = scanner.nextLine();
                            if (confirm.equals("Y")) {
                                System.out.println("주문완료되었습니다.");
                                break;
                            } else {
                                break;
                            }
                        }
                        case "2": {
                            System.out.println("SmokeShack 을 주문하시겠습니까? (Y/N)");
                            String confirm = scanner.nextLine();
                            if (confirm.equals("Y")) {
                                System.out.println("주문완료되었습니다.");
                                break;
                            } else {
                                break;
                            }

                        }
                        case "3": {
                            System.out.println("CheeseBurger 를 주문하시겠습니까? (Y/N)");
                            String confirm = scanner.nextLine();
                            if (confirm.equals("Y")) {
                                System.out.println("주문완료되었습니다.");
                                break;
                            } else {
                                break;
                            }
                        }
                        case "4": {
                            System.out.println("HamBurger 를 주문하시겠습니까? (Y/N)");
                            String confirm = scanner.nextLine();
                            if (confirm.equals("Y")) {
                                System.out.println("주문완료되었습니다.");
                                break;
                            } else {
                                break;
                            }
                        }
                        case "5": {
                            System.out.println("MushroomBurger 를 주문하시겠습니까? (Y/N)");
                            String confirm = scanner.nextLine();
                            if (confirm.equals("Y")) {
                                System.out.println("주문완료되었습니다.");
                                break;
                            } else {
                                break;
                            }
                        }
                        case "6": {
                            System.out.println("ShirimpBurger 를 주문하시겠습니까? (Y/N)");
                            String confirm = scanner.nextLine();
                            if (confirm.equals("Y")) {
                                System.out.println("주문완료되었습니다.");
                                break;
                            }
                        }
                    } // switch  문
                        if (selectMenu.equals("0")){
                            break;
                        }
                } // 작은 while 문
            } // 1 입력시 작동되는 else if 문
            if (selectCategory.equals("0")) {
                break;
            }
        } // 큰 while 문
    }

    // 메뉴아이템을 수동으로 추가하는 기능
    public void addMenuItem(MenuItem menuItem) {
        menu.menuItems.add(menuItem);
    }

}

