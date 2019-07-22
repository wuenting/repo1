package cn.itheima;

public class Black_MyColor implements MyColor {

    @Override
    public void paint(String shape) {
        System.out.println("黑色的："+shape);
    }
}
