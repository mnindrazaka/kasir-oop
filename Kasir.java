import java.util.ArrayList;
import java.util.Scanner;

public class Kasir {
    Transaksi transaksi = new Transaksi();
    ArrayList<Barang> listBarang = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Kasir() {
        Barang barang1 = new Barang();
        barang1.nama = "Gitar";
        barang1.harga = 150000;

        Barang barang2 = new Barang();
        barang2.nama = "Piano";
        barang2.harga = 120000;

        Barang barang3 = new Barang();
        barang3.nama = "Drum";
        barang3.harga = 300000;

        ArrayList<Barang> listBarang = new ArrayList<>();
        listBarang.add(barang1);
        listBarang.add(barang2);
        listBarang.add(barang3);
    }

    public void printListBarang() {
        for (int i = 0; i < listBarang.size(); i++) {
            System.out.println(i + 1 + "." + listBarang.get(i).nama + " :" + " Harga " + listBarang.get(i).harga);
        }
    }

    public void tambahItem() {

        ItemTransaksi itemTransaksi = new ItemTransaksi();

        printListBarang();

        System.out.println("Pembelian melebihi 10000k akan mendapatkan Diskon 20%");

        System.out.print("Anda Mau Beli Yang mana Brok : ");
        itemTransaksi.barang = listBarang.get(scanner.nextInt() - 1);

        System.out.print("Mau beli berapa BROO???? : ");
        itemTransaksi.jumlah = scanner.nextInt();

        System.out.println();
        System.out.println("Anda Membeli " + itemTransaksi.barang.nama + " Sebanyak " + itemTransaksi.jumlah);

        System.out.println("Subtotalnya adalah RP." + itemTransaksi.hitungSubtotal());

        transaksi.listItemTransaksi.add(itemTransaksi);

        System.out.print("Apakah Ingin membeli lagi broow? ketik (y/n)");

        scanner.close();
    }

    public void tentukanJarak() {
        System.out.print("Masukkan Jarak pengiriman (km) : ");
        transaksi.jarak = scanner.nextInt();
    }

    public void printOngkir() {
        System.out.println("Total harga ongkir Rp." + transaksi.hitungOngkir());
        System.out.println();
    }
}
