package org.example;

public class Point {
    private int x;
    private int y;
    public Point(int a,int b){
        this.x = a;
        this.y = b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance () {
        return  Math.sqrt((x-0)*(x-0)+(y-0)*(y-0));
    }
    public  double distance(Point p){
        return  Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }
    public  double distance(int a,int b){
        return  Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));
    }
}
