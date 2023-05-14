public class IF_Else_IF {
    static int number = 100;

    public static void main(String[] args) {
        int n = 50;
        if (n < IF_Else_IF.number){
            System.out.println("n < 100");
        }else if(n > IF_Else_IF.number) {
            System.out.println("n > 100");
        }else {
            System.out.println("n = 100");
        }
    }
}
