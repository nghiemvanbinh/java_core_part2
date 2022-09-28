import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer,String> hash_map1= new HashMap<Integer,String>();
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        hash_map1.put(4, "White");
        hash_map1.put(5, "Blue");
        //------------ex1----------------//
        System.out.println("-----------ex1------------");
        System.out.println("Phần tử của hashmap trên là");
        System.out.println(hash_map1);
        System.out.println("-------------ex2----------");
        //-------------ex2---------------//
        System.out.println("So phan tu trong hashmap la: "+hash_map1.size());
        //-------------ex3---------------//
        System.out.println("----------ex3--------------");
        HashMap<Integer,String> hash_map2= new HashMap<Integer,String>();
        Set<Integer> keySet = hash_map1.keySet();
        for (int key : keySet) {
            hash_map2.put(key,hash_map1.get(key));
        }
        System.out.println("Map 2 sau khi copy la: "+ hash_map2);
        //------------ex4---------//
        System.out.println("-----------ex4---------");
        hash_map1.clear();
        System.out.println("hashmap 1 sau khi xoa la: "+ hash_map1);
        //------------ex5----------//
        System.out.println("-------------ex5---------");
        checkEmpty(hash_map1);
        checkEmpty(hash_map2);
        //-------------ex6----------//
        System.out.println("---------------ex6---------");
        HashMap<Integer,String> shallowCopy= new HashMap<Integer,String>();
        shallowCopy.putAll(hash_map2);
        System.out.println("shallcopy la"+shallowCopy);
        //--------------ex7---------//
        System.out.println("---------ex7--------------");
        System.out.println("Nhap vao key ban muon check trong hashmap 2");
        Scanner sc = new Scanner(System.in);
        //sc.nextLine();
        if(hash_map2.containsKey(sc.nextInt())) System.out.println("Co ton tai key");
        else System.out.println("khong ton tai key");
        //-------------ex8----------//
        System.out.println("---------ex8----------");
        System.out.println("Tap hop value cua hashmap2 la"+hash_map2.values());
        //--------------ex9---------//
        System.out.println("---------ex9-----------");
        System.out.println("Nhap vao key ban muon lay");
        int k = sc.nextInt();
        if(hash_map2.containsKey(k)){
            System.out.println("Gia tri tuong ung la: "+hash_map2.get(k));
        }else {
            System.out.println("key khong ton tai");
        }
        //----------------ex10------------------//
        System.out.println("-------------ex10----------");
        System.out.println("Tap hop key cua hashmap2 la"+hash_map2.keySet());
        //----------------ex11------------------//
        System.out.println("------------ex11-----------");
        System.out.println("Value cua hashmap2 la: "+hash_map2.values());
    }
    public static void checkEmpty(HashMap<Integer,String> hs){
        if(hs.isEmpty())
            System.out.println("Hashmap rong");
        else System.out.println("Hashmap khong rong");
    }
}