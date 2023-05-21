package BTVN_5_arrayList;

import java.util.ArrayList;

public class Tao_thongtin_hocvien {
    public static void main(String[] args) {
        ArrayList<String> hocvien = new ArrayList<String>();
        hocvien.add(0, "Nguyễn Tuấn Hùng");
        hocvien.add(1,"25 tuổi");
        hocvien.add(2,"Kỹ sư Phân tích nghiệp vụ");
        hocvien.add(3, "Viettel");
        System.out.println("Thông tin học viên: ");
        for (int i = 0; i < hocvien.size(); i++) {
            System.out.println(hocvien.get(i));
        }
    }


}
