import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class SginLogin {
    private String user;
    private String pass;

    public SginLogin() {
    }

    public SginLogin(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
     HashMap<String,String> hm = new HashMap<>();
    public void sgin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào username: ");
        user = sc.nextLine();
        System.out.println("Nhập vào pass ");
        pass = sc.nextLine();
        boolean check = true;
        for (String i : hm.keySet()){
            if(i.equals(user)){
                check = false;
                System.out.println("Tài khoản đã có người dùng");
                break;
            }
        }
     if(check) hm.put(user,pass);
    }
    public void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn đăng nhập: ");
        String user = sc.nextLine();
        System.out.println("Nhập vào pass ");
        String pass = sc.nextLine();
        boolean check = true;
        for (String i : hm.keySet()){
            if(i.equals(user)== false|| hm.get(i).equals(pass)==false){
                System.out.println("Login Failed");
                check = false;
                break;
            }
        }
        if(check) System.out.println("Login Success");
    }
}
