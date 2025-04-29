package project.kiosk;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    // 속성
    private List<MenuItem> menuItems;
    private List<String> category;

    // 생성자
    Menu(){
        this.menuItems = new ArrayList<>();
        this.category = new ArrayList<>();
    }

    // 기능

    // 세터 설정
    // 메뉴교체 기능
    public void setMenuItems(int a, MenuItem menuItem) {
        this.menuItems.set(a, menuItem);
    }

    // 메뉴추가 기능
    public void addMenuitems(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    // 메뉴제거 기능
    public void removeMenuItems(int a) {
        this.menuItems.remove(a);
    }

    // 카테고리교체 기능
    public void setCategory(int a, String name){
        this.category.set(a, name);
    }

    // 카테고리추가 기능
    public void addCategory(String name){
        this.category.add(name);
    }

    // 카테고리제거 기능
    public void removeCategory(int a) {
        this.category.remove(a);
    }

    // 게터 설정
    // 메뉴 1개 가져오기
    public MenuItem getMenuItem(int a) {
        return this.menuItems.get(a);
    }

    // 메뉴 전체 가져오기
    public List<MenuItem> getItemList() {
        return this.menuItems;
    }

    // 카테고리 1개 가져오기
    public String getCategory(int a){
        return this.category.get(a);
    }

    // 카테고리 전체 가져오기
    public List<String> getCategoryList() {
        return this.category;
    }

}
