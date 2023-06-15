package Polymorphism;

public class Main {
    public static void main(String[] args) {
        drewUIControl(new TextBox());
        drewUIControl(new CheckBox());
    }

    public static void drewUIControl(UiControl control){
        control.draw();
    }
}
