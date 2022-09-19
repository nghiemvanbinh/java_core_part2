import java.util.Scanner;

public class Nguoi {
    private String fullname;
    private  int age;
    private  String home;
    private String code;

    public Nguoi() {
    }

    public Nguoi(String fullname, int age, String home, String code) {
        this.fullname = fullname;
        this.age = age;
        this.home = home;
        this.code = code;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", home='" + home + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
    public void inputInfo(Scanner sc){
        System.out.println("Nhập vào họ tên giáo viên");
        fullname = sc.nextLine();
        System.out.println("Nhập vào tuổi của giaó viên");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào địa chỉ của giáo viên");
        home = sc.nextLine();
        System.out.println("Nhập vào mã giáo viên");
        code = sc.nextLine();

    }
    public void showInfo(){
        System.out.println("Nguoi{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", home='" + home + '\'' +
                ", code='" + code + '\'' +
                '}');
    }
}
