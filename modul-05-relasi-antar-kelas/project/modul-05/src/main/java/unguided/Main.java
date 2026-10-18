package unguided;

public class Main {

    public static void main(String[] args) {
        // Membuat objek kasir
        Kasir kasir = new Kasir("Budi");

        // Membuat objek item pesanan secara independen
        ItemPesanan item1 = new ItemPesanan(
                "Iced Americano", 18000
        );

        ItemPesanan item2 = new ItemPesanan(
                "Beef Croissant", 25000
        );

        ItemPesanan item3 = new ItemPesanan(
                "Matcha Latte", 22000
        );

        // Membuat pesanan untuk meja 4 dengan kapasitas 5 item
        Pesanan pesanan = new Pesanan(4, 5);

        // Menambahkan item ke dalam pesanan
        pesanan.tambahItem(item1);
        pesanan.tambahItem(item2);
        pesanan.tambahItem(item3);

        // Menampilkan daftar pesanan
        pesanan.tampilkanPesanan();

        // Memproses pembayaran
        kasir.prosesPembayaran(pesanan);
    }
}
