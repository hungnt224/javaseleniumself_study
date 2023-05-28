package Java_OOP_btvn1;

public class NhanVien {
    //Hàm xây dựng
    int id;
    String name;
    String role;
    String address;
    int age;
    public NhanVien(int id, String name, int age, String address, String role) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.role = role;
    }

    public void printInfor(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(role);
    }
}
