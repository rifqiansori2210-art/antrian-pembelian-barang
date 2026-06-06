package antrianbarang;

import java.util.LinkedList;
import java.util.Queue;

public class AntrianPembelian {

    private Queue<String> daftarBarang = new LinkedList<>();

    public void tambah(String barang) {
        daftarBarang.offer(barang);
        System.out.println("Barang berhasil masuk antrian.");
    }

    public void proses() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Barang diproses: " + daftarBarang.poll());
        }
    }

    public void tampil() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("\n=== DAFTAR ANTRIAN ===");
        int no = 1;
        for (String barang : daftarBarang) {
            System.out.println(no + ". " + barang);
            no++;
        }
    }
}