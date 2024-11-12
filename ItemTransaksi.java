public class ItemTransaksi {
    Barang barang;
    int jumlah;

    public int hitungSubtotal() {
        return barang.harga * jumlah;
    }
}