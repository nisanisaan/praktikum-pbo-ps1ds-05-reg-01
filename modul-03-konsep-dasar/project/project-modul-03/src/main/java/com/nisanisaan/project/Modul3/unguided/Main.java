import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
         * Mengatur output console menggunakan UTF-8 agar
         * simbol derajat (°) dapat ditampilkan dengan benar.
         */
        System.setOut(new java.io.PrintStream(
            new java.io.FileOutputStream(
                java.io.FileDescriptor.out
            ),
            true,
            java.nio.charset.StandardCharsets.UTF_8
        ));

        // Data suhu 7 hari
        double[] suhuHarian = {
            30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9
        };

        // Membuat object PengolahSuhu
        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        // Menampilkan data awal
        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();

        // Mencari index hari yang kosong
        int indexKosong = pengolah.cariIndexKosong();

        System.out.println();
        System.out.println(
            "Index hari kosong (dimulai dari 0): "
            + indexKosong
        );

        // Mengisi data yang kosong
        pengolah.isiDataKosong();

        // Menampilkan data setelah pengisian
        System.out.println();
        System.out.println("=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();

        // Menampilkan rata-rata suhu
        System.out.printf(
            "%nRata-rata : %.2f\u00B0C%n",
            pengolah.hitungRataRata()
        );

        // Menampilkan kembali array dari main
        System.out.println();
        System.out.println(
            "Isi array suhuHarian di main setelah "
            + "isiDataKosong() dijalankan:"
        );
        System.out.println(Arrays.toString(suhuHarian));

    }
}