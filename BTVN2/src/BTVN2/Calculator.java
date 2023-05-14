package BTVN2;

public class Calculator {
    //Khai báo hàm Tính tổng
    static int Tong(int a, int b){

        return a + b;
    }
    //Khai báo hàm tính tích
    static int Tich(int a, int b){

        return a * b;
    }
    //Tính tuổi bằng cách nhập năm sinh
    static int Namhientai = 2023;
    static int Tuoi(int namsinh){

        return Namhientai - namsinh;
    }
}
