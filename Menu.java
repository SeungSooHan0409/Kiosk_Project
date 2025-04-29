package project.kiosk;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    // 속성
     List<MenuItem> menuItems;
     List<String> category;

    // 생성자
    Menu(){
        this.menuItems = new ArrayList<>();
        this.category = new ArrayList<>();
    }

    // 기능
    //
    public void addCategory(String name){
        category.add(name);
    }

}
