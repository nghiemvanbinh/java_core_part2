import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //---------ex1---------------------//
        Scanner sc = new Scanner(System.in);
        Acount acount = new Acount();
        System.out.println("Nhập vào số lượng tài khoản");
        acount.recharge(sc.nextDouble());
        acount.displayInfo();

        //----------ex2--------------------//
        SginLogin sg = new SginLogin();
        int choose =0;
        do{
            menu();
            choose = sc.nextInt();
            switch (choose){
                case 1:
                    sg.sgin();
                    break;
                case 2:
                    sg.login();
                    break;
                case 3:
                    System.out.println("thoát");
                    break;
            }
        }while (choose!=3);

    }
    public static void menu(){
        System.out.println("1: Nhập để đăng kí");
        System.out.println("2: Nhập để đăng nhâp");
        System.out.println("3: Thoát");
    }
}