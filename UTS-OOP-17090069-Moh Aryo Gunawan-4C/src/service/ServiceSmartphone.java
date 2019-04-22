package service;


import java.util.*;
import entity.*;

public class ServiceSmartphone {
    
    private static List<Smartphone> data = new LinkedList<Smartphone>();

    public void addData(Smartphone lp) {
        data.add(lp);
        System.out.println("Data telah tersimpan");
    }

    public void updateData(Smartphone lp) {
        int index = data.indexOf(lp);
        if(index >= 0) {
            data.set(index, lp);
            System.out.println("Data telah berubah");
        }
    }

    public void deleteData(String no_produk) {
        int no_produkx = data.indexOf(new Smartphone(no_produk, "", ""));
        if(no_produkx >= 0) {
            data.remove(no_produkx);
            System.out.println("Data telah terhapus");
        }
    }

    public void showAllData() {
        int i=1;
        System.out.println("\nData di List :");
        for(Smartphone lp : data) {
            System.out.println("data ke-" + i++);
            System.out.println("  NO : " + lp.getno_produk());
            System.out.println("  NAMA HP : " + lp.getnama_hp());
            System.out.println("  TIPE HP : " + lp.gettipe_hp());
        }
    }
}
