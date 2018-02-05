package test1.sendbox;

public class Myprogramm {

  public static void main(String[] args)  {
    hello("world");

    Square s = new Square(5);
    System.out.println("площадь кв со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,5);
    System.out.println("площадь прямоугольника со сторонами " + r.a +" и " + r.b + " = " + r.area());

  }
  public static void hello (String somebody)  {
    System.out.println("Hello," + somebody + "!");
  }

}
