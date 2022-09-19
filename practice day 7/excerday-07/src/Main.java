import java.util.*;

public class Main {
    public static void show(HashSet<String> hs){
        for (String i :hs){
            System.out.println("Phần tử của hashset là: "+ i);
        }
    }
    public static void countElement(HashSet<String> hs){
        System.out.println("Số phần tử của hashset là: "+ hs.size());
    }
    public static void deleteElement(HashSet<String> hs){
        hs.clear();
        System.out.println("Mảng đã xóa");
    }
    public static void cloneHashSet(HashSet<String> hs){
        HashSet<String> clone = new HashSet<>();
        clone = (HashSet<String>) hs.clone();
        System.out.println("HashSet trước nhân bản là: "+ hs);
        System.out.println("HasSet sau nhân bản là: "+ clone);
    }
    public static void checkEmtry(HashSet<String> hs){
        if(hs.isEmpty()) System.out.println("Mảng đã cho rỗng");
        else System.out.println("Mảng đã cho không phải mảng rỗng");
    }
    public static void convertArray(HashSet<String> hs){
        String arr[] = new String[hs.size()];
        int i=0;
        // iterating over the hashset
        for(String ele:hs){
            arr[i++] = ele;
        }
        System.out.println("Sau khi chuyển đổi thành mảng các phần tử là: ");
        for (String n : arr)
            System.out.println(n);
    }
    public static void convertTreeSet(HashSet<String> hs){
        Set<String> hashSetToTreeSet = new TreeSet<>(hs);
        System.out.println("TreeSet: " + hashSetToTreeSet);
    }
    public static void convertArrayList(HashSet<String> hs){
        ArrayList<String> flower_array = new ArrayList<>(hs);
        System.out.println("ArrayList: " + flower_array);
    }
    public static void compareHashSet(HashSet<String> hs1, HashSet<String> hs2){
        for (String i : hs1){
            for (String j: hs2){
                if(i.equalsIgnoreCase(j)) System.out.println("Phần tử này có ở 2 hashset: "+i);
            }
        }
    }
    public static void likeElement(HashSet<String> hs1,HashSet<String> hs2){
        HashSet<String > tg = new HashSet<>(hs1);
        tg.retainAll(hs2);
        hs1.removeAll(tg);
        hs2.removeAll(tg);
        System.out.println("Hash 1 sau khi xoa là: "+hs1);
        System.out.println("Hash 2 sau khi xóa là: "+hs2);
    }
    public static void main(String[] args) {
        HashSet<String> hashSet1 = new HashSet<String>();
        hashSet1.add("Red");
        //[Red, White, Pink, Yellow, Black, Green]
        hashSet1.add("White");
        hashSet1.add("Pink");
        hashSet1.add("Yellow");
        hashSet1.add("Black");
        hashSet1.add("Green");
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("Red");
        hashSet2.add("Pink");
        hashSet2.add("Green");
        int choose=0;
        Scanner sc = new Scanner(System.in);
         do{
             menu();
             choose = sc.nextInt();
             switch (choose){
                 case 1:
                     show(hashSet1);
                     show(hashSet2);
                     break;
                 case 2:
                     countElement(hashSet1);
                     countElement(hashSet2);
                     break;
                 case 3:
                     deleteElement(hashSet1);
                     deleteElement(hashSet2);
                     break;
                 case 4:
                    checkEmtry(hashSet1);
                    checkEmtry(hashSet2);
                     break;
                 case 5:
                     cloneHashSet(hashSet1);
                     break;
                 case 6:
                   convertArray(hashSet1);
                     break;
                 case 7:
                     convertTreeSet(hashSet1);
                     break;
                 case 8:
                     convertArrayList(hashSet1);
                     break;
                 case 9:
                     compareHashSet(hashSet1,hashSet2);
                     break;
                 case 10:
                      likeElement(hashSet1,hashSet2);
                     break;
                 case 11:
                     System.out.println("Thoát");
                     break;
             }

         }while (choose!=11);


    }
    public static void menu(){
        System.out.println("1: Lặp và in ra các phần tử của hashset");
        System.out.println("2: Tính tổng số các phần tử của hashset");
        System.out.println("3: Xóa các phần tử trong hashset");
        System.out.println("4: Check 1 hashset có phải là hashset rỗng hay không");
        System.out.println("5: Nhân bản hashset đang có");
        System.out.println("6: Chuyển đổi 1 hashset thành 1 mảng");
        System.out.println("7: Chuyển đổi 1 hashset thành 1 treeset");
        System.out.println("8: Chuyển đổi 1 hashset thành 1 arraylist");
        System.out.println("9: So sánh các phần tử của hashset đầu tiên với hashset thứ 2");
        System.out.println("10: So sánh 2 hashset và giữ lại các phần tử giống nhau giữa 2 hashset");
        System.out.println("11: Thoát");
    }

}