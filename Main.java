import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kasir kasir = new Kasir();
        Scanner scanner = new Scanner(System.in);
        boolean tambahMenu = true;
        while (tambahMenu) {
            kasir.tambahItem();
            String pilihUlang = scanner.next();
            tambahMenu = pilihUlang.equals("y");
        }
        kasir.tentukanJarak();
        kasir.printOngkir();
        kasir.transaksi.printStruk();
    }
}