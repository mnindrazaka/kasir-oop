import java.util.ArrayList;

public class Transaksi {
    ArrayList<ItemTransaksi> listItemTransaksi = new ArrayList<>();
    int jarak;

    public int hitungTotal() {
        int total = 0;
        for (int i = 0; i < listItemTransaksi.size(); i++) {
            total += listItemTransaksi.get(i).hitungSubtotal();
        }
        return total;
    }

    public int hitungOngkir() {
        return jarak * 1000;
    }

    public int hitungTotalAkhir() {
        return hitungTotal() + hitungOngkir();
    }

    public double hitungTotalBayar() {
        int totalAkhir = hitungTotalAkhir();
        double potongan = totalAkhir * 10.0 / 100.0;
        return dapatDiskon() ? totalAkhir - potongan : totalAkhir;
    }

    public boolean dapatDiskon() {
        return hitungTotalAkhir() >= 10000000;
    }

    public void printStruk() {
        System.out.println("Struk Pembayarnya:");
        for (int j = 0; j < listItemTransaksi.size(); j++) {
            ItemTransaksi itemTransaksi = listItemTransaksi.get(j);

            int jml = itemTransaksi.jumlah;
            String nama = itemTransaksi.barang.nama;
            int harga = itemTransaksi.barang.harga;
            int subtotal = itemTransaksi.hitungSubtotal();
            System.out.println(j + 1 + "." + " Nama barang " + nama + " " + harga + " x " + jml + " " + subtotal);
        }

        System.out.println("Ongkir : " + hitungOngkir());
        System.out.println("Total Adalah : Rp." + hitungTotalAkhir());

        if (dapatDiskon()) {
            System.out.println("Selamat anda mendapatkan Diskon sebesar 10% ");
        }

        System.out.println("Total ahirnya adalah : Rp." + hitungTotalBayar());
    }
}