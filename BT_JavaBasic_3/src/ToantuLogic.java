public class ToantuLogic {
    static int tien = 30000000;
    static String mat_hang = "Iphone";
    static int So_luong = 500;

    public static void main(String[] args) {
        int a = 100000000;
        int b = 400;
        String c = "Samsung";
        System.out.println((a >= ToantuLogic.tien) && (b <= ToantuLogic.So_luong));
        System.out.println((b != ToantuLogic.So_luong)||(a != ToantuLogic.tien));
        System.out.println(!((c == ToantuLogic.mat_hang)&&(a == ToantuLogic.tien)));
    }
}
