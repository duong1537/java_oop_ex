package oopprinciples.abstraction;

public class Main {
    public static void main(String[] arg){
        Area area = new Area();
        System.out.println(area.getAreaCircle(4));
        System.out.println(area.getAreaSquare(7));
        // Class Abstract gồm 2 phương thức getAreaCircle và getAreaSquare chỉ cho biết giá trị đầu vào và không hiển thị hành động của nó, đây là thể hiện cho tính trừu tượng
        // Class Area kế thừa class Abstract gồm 2 phương thức getAreaCircle và getAreaSquare thực hiện tính diện tích hình tròn, hình vuông
    }
}
