package test1.sendbox;

public class Point {
    public double x;
    public double y;

public Point (double x, double y){

    this.x=x;
    this.y=y;
}
    public double distans (Point b){
        return Math.sqrt ((b.x-this.x)*(b.x-this.x)+(b.y-this.y)*(b.y-this.y));

    }
}
