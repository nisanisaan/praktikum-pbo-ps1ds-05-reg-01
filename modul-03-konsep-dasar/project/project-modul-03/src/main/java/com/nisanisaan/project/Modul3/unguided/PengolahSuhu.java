public class PengolahSuhu {

    // Instance field
    private double[] suhuHarian;

    // Class field
    private static final double NILAI_KOSONG = -1.0;

    // Constructor
    public PengolahSuhu(double[] suhuHarian) {
        this.suhuHarian = suhuHarian;
    }

    // Menampilkan seluruh data suhu
    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {

            if (suhuHarian[i] == NILAI_KOSONG) {
                System.out.println(
                    "Hari " + (i + 1) + " : (kosong)"
                );
            } else {
                System.out.printf(
                    "Hari %d : %.1f\u00B0C%n",
                    (i + 1),
                    suhuHarian[i]
                );
            }
        }
    }

    // Mencari index data yang kosong
    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {

            if (suhuHarian[i] == NILAI_KOSONG) {
                return i;
            }
        }

        return -1;
    }

    // Mengisi data yang kosong
    public void isiDataKosong() {
        int indexKosong = cariIndexKosong();

        if (indexKosong != -1) {
            suhuHarian[indexKosong] =
                (suhuHarian[indexKosong - 1]
                + suhuHarian[indexKosong + 1]) / 2;
        }
    }

    // Menghitung rata-rata suhu
    public double hitungRataRata() {
        double total = 0;

        for (double suhu : suhuHarian) {
            total += suhu;
        }

        return total / suhuHarian.length;
    }
}