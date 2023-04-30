package BaiTap1;

public class SinhVien {
    //Biến Toàn Cục
    String Ten = "Nguyễn Hùng";
    String Lop = "KT24-03";
    //Biến Static
    static String Gioitinh = "Nam";
    static String Tongiao = "Không";

    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien();
        //Biến Cục bộ
        String Monhoc = "Giải tích I";
        Number Diemthi = 10;
        String Xeploai = "A+";
        // Print
        System.out.println("Ten: " + sinhVien.Ten);
        System.out.println("Lop: " + sinhVien.Lop);
        System.out.println("Gioitinh: " + Gioitinh);
        System.out.println("Tongiao: " + Tongiao);
        System.out.println("Quequan: " + ThongTin.Quequan);
        System.out.println("Sdt: " + ThongTin.SDT);
        System.out.println("Truong: " + ThongTin.TruongDaiHoc);
    }
}
