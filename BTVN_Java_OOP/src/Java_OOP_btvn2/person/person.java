package Java_OOP_btvn2.person;
public class person {
    public String name = "Alex";
    public int age = 20;
    public String gender = "Male";
    String address = "HN";
    double phone = 99988899;
    public void getInfor(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }
    void getInforPrivate(){
        System.out.println(phone);
        System.out.println(address);
    }
}
