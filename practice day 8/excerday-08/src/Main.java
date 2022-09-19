import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static String Stringl(String i){
        return "add"+i;
    }
    public static void main(String[] args) {
          QLCB ql = new QLCB();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn chọn");
        int choose =0;
        do{
            menu();
            choose = sc.nextInt();
            switch (choose){
                case 1:
                    ql.addCBGV();
                    break;
                case 2:

                    ql.deletegv();
                    break;
                case 3:
                    ql.luongthuclinh();
                    break;
                case 4:
                    System.out.println("Thoát");
                    break;
            }

        }while (choose!=4);
    }
    static void menu(){
        System.out.println("1. Nhập vào cán bộ giáo viên");
        System.out.println("2. Xóa giáo viên theo mã code");
        System.out.println("3. Hiển thị danh sách lương thực lĩnh");
        System.out.println("4. Thoát");
    }
}