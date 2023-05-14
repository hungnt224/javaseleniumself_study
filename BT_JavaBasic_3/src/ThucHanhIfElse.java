public class ThucHanhIfElse {
    public static void main(String[] args) {
        // Khai báo doanh thu trong tháng 4 năm 2023
        int Doanh_thu_du_kien = +(ToantuLogic.tien*ToantuLogic.So_luong);
        System.out.println("Doanh thu dự kiến = " + Doanh_thu_du_kien);
        int so_may_da_ban = 325;
        int Doanh_thu_thang_4 = +(so_may_da_ban*ToantuLogic.tien);
        System.out.println("Doanh thu tháng 4 = " +Doanh_thu_thang_4);
        if(Doanh_thu_thang_4 < Doanh_thu_du_kien){
            System.out.println("Thua lỗ");
        } else if (Doanh_thu_thang_4 == Doanh_thu_du_kien) {
            System.out.println("Hòa vốn");
        }else {
            System.out.println("Có lãi");
        }
    }
}