package ru.stqa.pft.sandbox;

import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;
    Point()
    {
        this.x=0;
        this.y=0;
    }
    public Point(int x, int y)
    {
      this.x=x;
      this.y=y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public static double distance(Point p1, Point p2){
        double distance=0;
        //25 9 16, 3 4, {9,9} {6,5)
        distance =sqrt( Math.pow((p2.getX()- p1.getX()),2)+Math.pow((p2.getY()-p1.getY()),2));
        return distance;
    }
}
