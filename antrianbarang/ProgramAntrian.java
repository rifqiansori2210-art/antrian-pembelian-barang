package antrianbarang;

import java.util.Scanner;

public class ProgramAntrian {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        AntrianPembelian antrian = new AntrianPembelian();

        int menu;

        do {
            System.out.println("\n===== MENU ANTRIAN PEMBELIAN =====");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Proses Barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu : ");

            menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Nama Barang : ");
                    String barang = input.nextLine();
                    antrian.tambah(barang);
                    break;

                case 2:
                    antrian.tampil();
                    break;

                case 3:
                    antrian.proses();
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (menu != 4);

        input.close();
    }
}