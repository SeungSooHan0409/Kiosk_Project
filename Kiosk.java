package project.kiosk;

import chpater3.thread.runnable.MyNewClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kiosk {

    // 속성
    private Menu menu;
    private Cart cart;


    // 생성자
    Kiosk() {
        this.menu = new Menu();
        this.cart = new Cart();
    }


    // 기능
    // Enum 생성
    public enum Job {
        국가유공자, 군인, 학생, 일반
    }

    // Enum 반환형태 배열로 변환
    Job[] job = Job.values();

    Scanner scanner = new Scanner(System.in);


    // 키오스크 출력문 작성
    public void start() {
        while (true) {

            // 카테고리 출력 메서드 호출
            printCategory();

            String selectCategory = scanner.nextLine();

            // category 값 잘못 입력시 예외처리문 출력 (0, 1, 4, 5 만 값을 통과시킴)
            if (!selectCategory.equals("1") && !selectCategory.equals("0") && !selectCategory.equals("4") && !selectCategory.equals("5")) {
                // 장바구니가 비었는데 장바구니 메뉴 선택시 예외처리문 출력
                if (cart.showOrderMenu()) {
                    throw new IllegalArgumentException("잘못된 입력값입니다.");
                }
                throw new IllegalArgumentException("잘못된 입력값입니다.");
            }
            // 카테고리에서 '1' 입력시 작동
            else if (selectCategory.equals("1")) {
                // 버거메뉴 선택 및 선택시 나오는 메서드 호출
                selectBurgerMenu();
            }

            // 카테고리에서 '4' 입력시 작동
            else if (selectCategory.equals("4")) {
                // 장바구니의 Order Menu 를 출력하는 메서드 호출
                selectOrders();
            }
            // 카테고리에서 '5' 입력시 작동
            else if (selectCategory.equals("5")) {
                // 장바구니에서 상품을 제거하는 메서드 호출 (List.(remove(index)) 사용 )
                removeMenu2();
            }

            // 카테고리에서 '0' 입력시 작동
            else {
                break;
            }
        }
    }


    // 세터 설정
    // Menu 의 메서드 사용을 위한 세터 만들기
    // 카테고리추가 기능
    public void setMenu(String name) {
        this.menu.addCategory(name);
    }


    // 게터 설정
    // 메뉴에 접근가능하도록 게터 만들기
    public Menu getMenu() {
        return this.menu;
    }

    // 키오스크 기능별 메서드정리
    // 카테고리 출력문
    void printCategory() {
        int j = 1;
        for (String category : menu.getCategoryList()) {
            System.out.printf("%-1d. %-18s \n", j, category);
            j++;
        }

        // 장바구니 출력 및 조건설정
        if (!cart.showOrderMenu()) {
            System.out.println("[ ORDER MENU ]");
            System.out.println("4. Orders");
            System.out.println("5. Cancel");
        }

        System.out.println("0. 종료    |  종료");
        // 카테고리 입력 대기
        System.out.print("카테고리를 선택해주세요 : ");
    }

    // 버거메뉴 출력문
    void printBurgerMenu() {
        System.out.println("[ BURGERS MENU ]");

        IntStream.range(0, menu.getMenuItemsSize())
                .forEach(c -> {
                    System.out.printf("%-1d. %-18s | W %-5.1f | %s\n", (c + 1), menu.getMenuItem(c).getName(), menu.getMenuItem(c).getPrice(), menu.getMenuItem(c).getExplain());
                });

        System.out.println("0. 뒤로가기");

        // 버거메뉴 입력대기
        System.out.print("원하시는 메뉴를 선택하세요 : ");
    }

    // 버거메뉴내 선택지 입력, 입력시 나오는 출력문
    void selectBurgerMenu() {
        while (true) {
            // 버거메뉴 출력 메서드 호출
            printBurgerMenu();

            String selectMenu = scanner.nextLine();

            // 제시된 숫자외 다른값 입력시 출력되는 예외처리문
            if (!selectMenu.equals("0") && !selectMenu.equals("1") && !selectMenu.equals("2") && !selectMenu.equals("3") && !selectMenu.equals("4") && !selectMenu.equals("5") && !selectMenu.equals("6")) {
                throw new IllegalArgumentException("잘못된 입력값입니다.");
            }

            // 버거선택시 출력, 장바구니에 메뉴 추가여부 묻는문장 출력
            switch (selectMenu) {
                case "1": {
                    System.out.println("ShakeBurger 를 장바구니에 담으시겠습니까? (Y/N)");
                    String confirm = scanner.nextLine();
                    if (confirm.equals("Y")) {
                        cart.addCart(menu.getMenuItem(0));
                        System.out.print("담을 수량을 입력해주세요 : ");
                        int quantity = scanner.nextInt();
                        cart.plusQuantity(quantity);
                        scanner.nextLine();
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
                        System.out.print("담을 수량을 입력해주세요 : ");
                        int quantity = scanner.nextInt();
                        cart.plusQuantity(quantity);
                        scanner.nextLine();
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
                        System.out.print("담을 수량을 입력해주세요 : ");
                        int quantity = scanner.nextInt();
                        cart.plusQuantity(quantity);
                        scanner.nextLine();
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
                        System.out.print("담을 수량을 입력해주세요 : ");
                        int quantity = scanner.nextInt();
                        cart.plusQuantity(quantity);
                        scanner.nextLine();
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
                        System.out.print("담을 수량을 입력해주세요 : ");
                        int quantity = scanner.nextInt();
                        cart.plusQuantity(quantity);
                        scanner.nextLine();
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
                        System.out.print("담을 수량을 입력해주세요 : ");
                        int quantity = scanner.nextInt();
                        cart.plusQuantity(quantity);
                        scanner.nextLine();
                        System.out.println("담기완료 되었습니다.");
                        break;
                    } else {
                        break;
                    }
                }
            }
            if (selectMenu.equals("0")) {
                break;
            }
        }
    }

    // 장바구니 주문상품 출력문
    void printCartItems() {
        int k = 1;
        for (MenuItem menuList : cart.getCartList()) {
            System.out.printf("%-1d. %-18s | W %-5.1f | %s  |  수량 :  %-2d\n", k, menuList.getName(), menuList.getPrice(), menuList.getExplain(), cart.getOrderQuantity(k - 1));
            k++;
        }
    }

    // 장바구니 주품상품 제거메뉴 출력 및 로직
    void removeMenu1() {
        System.out.print("제거하실 메뉴를 입력해주세요. : ");
        int selectNumber = scanner.nextInt();
        scanner.nextLine();
        if (selectNumber >= 0 && selectNumber <= cart.orderListsize()) {

            // 게터로 삭제할 상품 및 수량조회
            MenuItem deleteItem = cart.getCartItem((selectNumber - 1));
            Integer deleteQuantity = cart.getOrderQuantity((selectNumber - 1));

            // 삭제할 상품 및 수량을 제외한 리스트를 다시 생성
            List<MenuItem> RemovedItem = cart.getCartList().stream().filter(item -> !(item == deleteItem)).collect(Collectors.toList());
            List<Integer> RemovedQuantity = cart.getCartQuantity().stream().filter(quantity -> !(quantity == deleteQuantity)).collect(Collectors.toList());

            // 세터로 생성한 리스트를 속성에 재할당
            cart.changeOrderList(RemovedItem);
            cart.changeOrderQuantityList(RemovedQuantity);

        } else {
            throw new IllegalArgumentException("올바른 값을 입력해주세요.");
        }
    }

    void removeMenu2() {
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
            if (removeCart >= 1) {
                cart.removeCart((removeCart - 1));
            } else if (removeCart == 0) {
                break;
            } else {
                throw new IllegalArgumentException("잘못된 값이 입력되었습니다.");
            }
        }
    }

    // 장바구니 메뉴 및 총계산금 출력문
    void sumOfPrice() {
        // 계산로직 작성
        double totalPayment = 0;
        int a = 0;
        for (; a < cart.orderListsize(); a++) {
            totalPayment += ((cart.getItemPrice(a))) * (cart.getOrderQuantity(a));
        }
        cart.setOrderAmount(totalPayment);
        System.out.println("총 계산금액 : " + cart.getOrderAmount() * 1000 + " 원");
        System.out.println("1. 주문            2. 메뉴제거            3. 뒤로가기");
        System.out.print("원하시는 메뉴를 입력하세요. : ");
    }

    // 할인적용 및 장바구니 초기화
    void applyDiscount() {
        // 할인율 배열생성
        String[] discount = {"10%", "5%", "3%", "0%"};
        System.out.println("할인 정보를 입력해주세요");
        // 할인내용 출력문 로직
        int b = 0;
        for (Job joblist : job) {
            System.out.println((b + 1) + ". " + joblist.name() + " : " + discount[b]);
            b++;
        }
        System.out.print("입력란 : ");
        String discountType = scanner.nextLine();
        // 할인적용
        if (discountType.equals("1")) {
            System.out.println("W " + (cart.getOrderAmount() * 1000 * 0.9) + "원이 결제되었습니다.");
            cart.setOrderAmount(0);
        } else if (discountType.equals("2")) {
            System.out.println("W " + (cart.getOrderAmount() * 1000 * 0.95) + "원이 결제되었습니다.");
            cart.setOrderAmount(0);
        } else if (discountType.equals("3")) {
            System.out.println("W " + (cart.getOrderAmount() * 1000 * 0.97) + "원이 결제되었습니다.");
            cart.setOrderAmount(0);
        } else if (discountType.equals("4")) {
            System.out.println("W " + (cart.getOrderAmount() * 1000) + "원이 결제되었습니다.");
            cart.setOrderAmount(0);
        } else {
            throw new IllegalArgumentException("올바른 값을 입력해주세요.");
        }


        // 장바구니 초기화
        for (int d = 0; d < cart.orderListsize(); ) {
            cart.removeCart(d);
        }
        System.out.println("장바구니가 초기화 되었습니다.");
    }

    // 장바구니의 주문기능 (4번 선택나오는 출력문)
    void selectOrders() {
        // 장바구니 상품을 조회하는 메서드 호출
        printCartItems();

        // 상품총액 및 장바구니 메뉴 출력 메서드 호출
        sumOfPrice();

        String decideCartMenu = scanner.nextLine();

        if (decideCartMenu.equals("1")) {
            // 할인적용 및 장바구니를 초기화하는 메서드 호출
            applyDiscount();
        } else if (decideCartMenu.equals("2")) {
            // 장바구니에서 상품을 제거하는 메서드 호출 (Stream 사용)
            removeMenu1();
        } else if (decideCartMenu.equals("3")) {
            System.out.println("초기화면으로 돌아갑니다.");
        } else {
            throw new IllegalArgumentException("올바른 값을 입력해주세요.");
        }
    }

    // 카테고리 메뉴선택에 따른 출력 로직
    void selectCategory() {

    }
}

