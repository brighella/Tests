package test1.sendbox;

public class Myprogramm {

  public static void main(String[] args)  {
    hello("world");
    Square s = new Square(5);
    System.out.println("площадь кв со стороной " + s.l + " = " + s.area());
    Rectangle r = new Rectangle(4,5);
    System.out.println("площадь прямоугольника со сторонами " + r.a +" и " + r.b + " = " + r.area());
    Point a = new Point(3, 4);
    Point b = new Point(8, 5);
    System.out.println("расстояние между точками " + "(" +a.x +"," +a.y +") и (" +b.x +"," +b.y +") ="  + a.distans(b));
  }



  public static void hello (String somebody)  {
    System.out.println("Hello," + somebody + "!");
  }
}
