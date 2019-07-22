package cn.itheima;

public abstract class Shape {
    public MyColor color;

    public void setColor(MyColor send){
        this.color = send;
    }

    public abstract void draw();
}
