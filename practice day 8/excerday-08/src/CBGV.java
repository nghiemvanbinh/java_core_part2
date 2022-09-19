import java.util.Scanner;

public class CBGV extends Nguoi{
    private int luongcung;
    private int luongthuong;
    private int tienphat;
    private int luongthuclinh;

    public CBGV() {
    }

    public CBGV(String fullname, int age, String home, String code, int luongcung, int luongthuong, int tienphat, int luongthuclinh) {
        super(fullname, age, home, code);
        this.luongcung = luongcung;
        this.luongthuong = luongthuong;
        this.tienphat = tienphat;
        this.luongthuclinh = luongthuclinh;
    }

    public int getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(int luongcung) {
        this.luongcung = luongcung;
    }

    public int getLuongthuong() {
        return luongthuong;
    }

    public void setLuongthuong(int luongthuong) {
        this.luongthuong = luongthuong;
    }

    public int getTienphat() {
        return tienphat;
    }

    public void setTienphat(int tienphat) {
        this.tienphat = tienphat;
    }

    public int getLuongthuclinh() {
        return luongthuclinh;
    }

    public void setLuongthuclinh(int luongthuclinh) {
        this.luongthuclinh = luongthuclinh;
    }


    @Override
    public String toString() {
        return "CBGV{" +
                "luongcung=" + luongcung +
                ", luongthuong=" + luongthuong +
                ", tienphat=" + tienphat +
                ", luongthuclinh=" + luongthuclinh +
                '}';
    }

    @Override
    public void inputInfo(Scanner sc) {
        super.inputInfo(sc);
        System.out.println("Nhập vào lương cứng");
        luongcung = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào lương thưởng");
        luongthuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào tiền phạt");
        tienphat = Integer.parseInt(sc.nextLine());

    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(toString());
    }
}
