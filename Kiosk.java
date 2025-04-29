package project.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 속성
    private Menu menu;
    private Cart cart;


    // 생성자
    Kiosk(){
        this.menu = new Menu();
        this.cart = new Cart();
    }


    // 기능
    Scanner scanner = new Scanner(System.in);
    public void start(){
        // 키오스크 출력문 출력 로직
        while(true) {

                // 카테고리 출력
                int j = 1;
                for (String category : menu.getCategoryList()) {
                    System.out.printf("%-1d. %-18s \n", j, category);
                    j++;
                }

                // 장바구니 출력 및 조건설정
                if(!cart.showOrderMenu()){
                    System.out.println("[ ORDER MENU ]");
                    System.out.println("4. Orders");
                    System.out.println("5. Cancel");
                }

                System.out.println("0. 종료    |  종료");
                // 카테고리 입력 대기
                System.out.print("카테고리를 선택해주세요 : ");
                String selectCategory = scanner.nextLine();



                // category 값 잘못 입력시 예외처리문 출력
                if (!selectCategory.equals("1") && !selectCategory.equals("0") && !selectCategory.equals("4") && !selectCategory.equals("5")) {
                    if(cart.showOrderMenu()){
                        throw new IllegalArgumentException("잘못된 입력값입니다.");
                    }
                    throw new IllegalArgumentException("잘못된 입력값입니다.");
                }
                // 1번 선택시 버거메뉴 출력
                else if(selectCategory.equals("1")){
                    while(true) {
                    System.out.println("[ BURGERS MENU ]");
                    int i = 1;
                    for (MenuItem menuList : menu.getItemList()) {
                        System.out.printf("%-1d. %-18s | W %-5.1f | %s\n", i, menuList.getName(), menuList.getPrice(), menuList.getExplain());
                        i++;
                    }

                    System.out.println("0. 뒤로가기");
                    // 버거메뉴 입력대기
                    System.out.print("원하시는 메뉴를 선택하세요 : ");
                    String selectMenu = scanner.nextLine();

                    // 제시된 숫자외 다른값 입력시 출력되는 예외처리문
                    if(!selectMenu.equals("0") && !selectMenu.equals("1") && !selectMenu.equals("2") && !selectMenu.equals("3") && !selectMenu.equals("4") && !selectMenu.equals("5") && !selectMenu.equals("6")){
                        throw new IllegalArgumentException("잘못된 입력값입니다.");
                    }

                    // 버거선택시 출력, 장바구니에 메뉴 추가여부 묻는문장 출력
                    switch (selectMenu) {
                        case "1": {
                            System.out.println("ShakeBurger 를 장바구니에 담으시겠습니까? (Y/N)");
                            String confirm = scanner.nextLine();
                            if (confirm.equals("Y")) {
                                cart.addCart(menu.getMenuItem(0));
                                System.out.println("담기완료 되었습니다.");
                                break;
                            } else {
                                break;
                            }
                        }
                        case "2": {
                            System.out.println("SmokeShack 을 장바구니에 담으시겠습니까? (Y/N)");
                            String confirm = scanner.nextLine();
                            if (confirm.equals("Y")) {
                                cart.addCart(menu.getMenuItem(1));
                                System.out.println("담기완료 되었습니다.");
                                break;
                            } else {
                                break;
                            }

                        }
                        case "3": {
                            System.out.println("CheeseBurger 를 장바구니에 담으시겠습니까? (Y/N)");
                            String confirm = scanner.nextLine();
                            if (confirm.equals("Y")) {
                                cart.addCart(menu.getMenuItem(2));
                                System.out.println("담기완료 되었습니다.");
                                break;
                            } else {
                                break;
                            }
                        }
                        case "4": {
                            System.out.println("Hamburger 를 장바구니에 담으시겠습니까? (Y/N)");
                            String confirm = scanner.nextLine();
                            if (confirm.equals("Y")) {
                                cart.addCart(menu.getMenuItem(3));
                                System.out.println("담기완료 되었습니다.");
                                break;
                            } else {
                                break;
                            }
                        }
                        case "5": {
                            System.out.println("MushroomBurger 를 장바구니에 담으시겠습니까? (Y/N)");
                            String confirm = scanner.nextLine();
                            if (confirm.equals("Y")) {
                                cart.addCart(menu.getMenuItem(4));
                                System.out.println("담기완료 되었습니다.");
                                break;
                            } else {
                                break;
                            }
                        }
                        case "6": {
                            System.out.println("ShirimpBurger 를 장바구니에 담으시겠습니까? (Y/N)");
                            String confirm = scanner.nextLine();
                            if (confirm.equals("Y")) {
                                cart.addCart(menu.getMenuItem(5));
                                System.out.println("담기완료 되었습니다.");
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                        if (selectMenu.equals("0")){
                            break;
                        }
                } // 버거메뉴 while 문
            } // '1' 입력시 작동되는 else if 문

                // '4' 입력시 장바구니 상태를 출력
                else if (selectCategory.equals("4")) {
                    int k = 1;
                    for(MenuItem menuList : cart.getCartList()) {
                        System.out.printf("%-1d. %-18s | W %-5.1f | %s\n", k, menuList.getName(), menuList.getPrice(), menuList.getExplain());
                        k++;
                    }
                }
                // '5' 입력시 장바구니 메뉴삭제
                else if (selectCategory.equals("5")) {
                    while (true) {
                        int k = 1;
                        for (MenuItem menuList : cart.getCartList()) {
                            System.out.printf("%-1d. %-18s \n", k, menuList.getName());
                            k++;
                        }
                        System.out.println("0. 뒤로가기");
                        System.out.print("제거할 메뉴를 선택해주세요 : ");
                        int removeCart = scanner.nextInt();
                        scanner.nextLine();
                        if(removeCart >= 1) {
                            cart.removeCart((removeCart - 1));
                        } else if(removeCart == 0) {
                            break;
                        } else {
                            throw new IllegalArgumentException("잘못된 값이 입력되었습니다.");
                        }
                    }
                }

            if (selectCategory.equals("0")) {
                break;
            }
        } // 카테고리 while 문
    }


    // 세터 설정
    // Menu 의 메서드 사용을 위한 세터 만들기
    // 카테고리추가 기능
    public void setMenu(String name){
        this.menu.addCategory(name);
    }


    // 게터 설정
    // 메뉴에 접근가능하도록 게터 만들기
    public Menu getMenu() {
        return this.menu;
    }
}

