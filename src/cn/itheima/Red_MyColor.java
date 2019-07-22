package cn.itheima;

public class Red_MyColor implements MyColor {

    @Override
    public void paint(String shape) {
        System.out.println("红色的" + shape);
    }
}
