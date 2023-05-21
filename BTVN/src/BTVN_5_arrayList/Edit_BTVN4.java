package BTVN_5_arrayList;

import java.util.ArrayList;

public class Edit_BTVN4 {
    public static void main(String[] args) {
        ArrayList<Integer> sochan = new ArrayList<>(26);
        for (int i=0; i <= 50; i +=2){
            sochan.add(i);
        }
        System.out.println("Số chẵn: " );
        System.out.println(sochan);
    }
}
