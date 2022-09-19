import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    ArrayList <CBGV> cb = new ArrayList<>();
    public void addCBGV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cán bộ giáo viên");
        int n = Integer.parseInt(sc.nextLine());
        for(int i =0;i< n;i++){
            CBGV cbgv = new CBGV();
            cbgv.inputInfo(sc);
            cb.add(cbgv);
        }
    }
    public void deletegv(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã bạn muốn xóa");
        String str = sc.nextLine();
        for(CBGV i : cb){
            if(i.getCode().equalsIgnoreCase(str)){
                cb.remove(i);
            }
        }
        System.out.println("Số cán bộ giáo viên còn lại là" );
        for (int i =0;i< cb.size();i++){
            cb.get(i).showInfo();
        }
    }
    public void luongthuclinh(){
        System.out.println("lương thực lĩnh của các giáo viên là");
        for (CBGV i: cb
             ) {
            System.out.println(i.getLuongcung()+i.getLuongthuong()-i.getTienphat());
        }
    }
}
