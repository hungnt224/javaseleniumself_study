package Java_OOP_btvn1;

public class Thongtin {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien(01, "Nguyễn Tuấn Hùng", 25, "Hà Nội", "Trợ lý");
        nv1.printInfor();
        System.out.println("============================");
        NhanVien nv2 = new NhanVien(02, "Nguyễn VĂn A", 20, "Hà Nội", "Trợ lý");
        nv2.printInfor();
    }
}
