import service.*;
import entity.*;
import java.util.*;


public class Aplikasi {
    
    private static ServiceSmartphone service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new ServiceSmartphone();
        scanner = new Scanner(System.in);

        int opsi = 5;
        do {
            showMenu();
            try {
                scanner = new Scanner(System.in);
                opsi = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.err.println("Inputan salah, ulangi isi kembali!");
                opsi = 0;
            } catch(NoSuchElementException nsee) {

            }
            prosesOpsi(opsi);
        } while(opsi != 5);
    }

    private static void prosesOpsi(int pilihan) {
        switch(pilihan) {
            case 1:
                showFormTambahData();
                break;
            case 2:
                showFormEditData();
                break;
            case 3:
                showDeleteData();
                break;
            case 4:
                service.showAllData();
                break;
            case 5:
                System.out.println("Terima kasih telah mengunjungi");
                System.out.println("toko kami.");
        }
    }

    private static void showDeleteData() {
        scanner = new Scanner(System.in);
        System.out.println("\n=--= Form Hapus Data =--=");
        System.out.print("NO : ");
        String no_produk= scanner.nextLine();
        service.deleteData(no_produk);
    }

    private static void showFormEditData() {
        scanner = new Scanner(System.in);
        String no_produk, nama_hp, tipe_hp;

        System.out.println("\n=--= Form Ubah Data =--=");
        System.out.print("NO : ");
        no_produk = scanner.nextLine();
        System.out.print("NAMA HP : ");
        nama_hp = scanner.nextLine();
        System.out.print("TIPE HP : ");
        tipe_hp = scanner.nextLine();
        service.updateData(new Smartphone(no_produk, nama_hp, tipe_hp));
    }

    private static void showFormTambahData() {
        scanner = new Scanner(System.in);
        String no_produk, nama_hp, tipe_hp;

        System.out.println("\n=--= Form Entry Data =--=");
        System.out.print("NO : ");
        no_produk = scanner.nextLine();
        System.out.print("NAMA HP : ");
        nama_hp= scanner.nextLine();
        System.out.print("TIPE HP: ");
        tipe_hp= scanner.nextLine();
        service.addData(new Smartphone(no_produk, nama_hp, tipe_hp));
    }

    private static void showMenu() {
        System.out.println("=---= Aplikasi Toko Smartphoner=---=");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. KELUAR");
        System.out.println("-------------------");
        System.out.print  ("pilihan > ");
    }
}
