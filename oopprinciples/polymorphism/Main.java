package oopprinciples.polymorphism;

public class Main {
    public static void main(String args[]) {
        Shape s;
        s = new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
        //Lớp Rectangle và Circle kế thừa từ lớp Shape và ghi đè phương thức draw() của Shape.
        // Chúng ta gọi phương thức draw bởi biến tham chiếu của lớp Shape. Khi nó tham chiếu tới đối tượng của lớp con (Rectangle, Circle) và phương thức lớp con ghi đè phương thức draw của lớp cha, phương thức draw của lớp con được gọi lúc runtime.

    }
}
