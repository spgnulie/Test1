class Polygon {
   public void display() {
   }
}
public class AnonymousDemo {
   public void createClass() {
      // 匿名类实现一个接口
      Polygon p1 = new Polygon() {
         public void display() {
            System.out.println("在匿名类内部。");
         }
      };
      p1.display();
   }
   public static void main(String[] args) {
      AnonymousDemo an = new AnonymousDemo();
      an.createClass();
   }
}