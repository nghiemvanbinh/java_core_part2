import java.util.Scanner;

public class Main {
    static void inputNumber(){
        Scanner sc = new Scanner(System.in);

        boolean check = true;
        while (check){
            try {
                System.out.println("Nhập vào 2 số thực");
                System.out.println("Số thứ nhất: ");
                float num1 = Float.parseFloat(sc.nextLine());
                System.out.println("Nhập vào số thứ hai: ");
                float num2 = Float.parseFloat(sc.nextLine());
                chia((int) num1, (int) num2);
               check = false;
            }catch (NumberFormatException e){
                System.out.println("Nhập sai,mời bạn nhập lại");
            }
        }
    }
     static void chia(int a, int b){
        try {
            int c = a/b;
        }catch (ArithmeticException e){
            System.out.println("không có phép chia cho 0");
        }
     }
     static void inputArray() throws MyException{

         Scanner sc = new Scanner(System.in);
         int n =0 ;
         do{
             System.out.println("Nhập vào số phần tử của mảng: ");
             try {
                 n = Integer.parseInt(sc.nextLine());
             }catch (NumberFormatException e){
                 System.out.println("Nhập sai rồi:");
             }

         }while (n<=0);
         int a[]= new int[n];
         for (int i =0;i< n ;i++ ){
             System.out.println("Mời nhập phần tử thứ: "+i);
             a[i] = sc.nextInt();
            if(a[i] == 100)throw new MyException(a,i);
         }
     }
    public static class MyException extends Exception {
        int a[];
        int n;

        public MyException(int[] a, int n) {
            this.a = a;
            this.n = n;
        }
        public void showMessage()
        {
          for (int i =0;i<n;i++){
              System.out.println("Phần tử vừa nhập trước khi có sự kiện 100: "+ a[i]);
          }
        }
    }
    public static void main(String[] args) throws MyException {
        //---------------ex1--------------------//
       inputNumber();
       //----------------ex2--------------------//
        try {
            inputArray();
        }catch (MyException e){
            e.showMessage();
        }

    }
}