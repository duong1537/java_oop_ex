package oopprinciples.encapsulation;

public class Main {
    public static void main(String[] arg){
        // Tính đóng gói được thể hiện ở phạm vi truy cập của biến
        Encapsulation encapsulation = new Encapsulation();
        //System.out.println(encapsulation.processScore);
        // Lỗi do quyền truy cập của biến processScore là private chỉ có thể truy cập trong class Encapsulation
        encapsulation.setProcess(4);
        encapsulation.setMid(7);
        encapsulation.setEnd(4);
        //gán các biến process, mid, end thông qua hàm set
        System.out.println(encapsulation.evaluate);
        // kết quả trả về Unknown vì biến evaluate có quyền truy cập là public nên có thể truy cập được từ toàn bộ class
    }
}
