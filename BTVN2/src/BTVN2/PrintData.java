package BTVN2;

public class PrintData {
    //Gán vào hàm main để in ra
    public static void main(String[] args) {
        int x = Calculator.Tong(10, 11);
        int y = Calculator.Tich(4, 8);
        int Tuoi = Calculator.Tuoi(1998);
        System.out.println("Tổng = "  + x);
        System.out.println("Tích = "  + y);
        System.out.println("Tuổi của bạn = "  + Tuoi);
    }
}
