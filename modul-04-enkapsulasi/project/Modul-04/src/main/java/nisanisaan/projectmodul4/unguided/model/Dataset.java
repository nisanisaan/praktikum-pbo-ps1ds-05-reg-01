package nisanisaan.projectmodul4.unguided.model;

public class Dataset {

    // Atribut private untuk enkapsulasi
    private String nama;
    private int jumlahBaris;
    private int jumlahKolom;
    private int jumlahMissing;

    // Konstanta batas missing dalam persen
    public static final double BATAS_MISSING = 5.0;

    // Variabel class untuk menghitung jumlah objek
    private static int totalDataset = 0;

    // Constructor tanpa parameter
    public Dataset() {
        this.nama = "";
        this.jumlahBaris = 0;
        this.jumlahKolom = 0;
        this.jumlahMissing = 0;
        totalDataset++;
    }

    // Constructor dengan satu parameter
    public Dataset(String nama) {
        this.nama = nama;
        this.jumlahBaris = 0;
        this.jumlahKolom = 0;
        this.jumlahMissing = 0;
        totalDataset++;
    }

    // Constructor lengkap
    public Dataset(String nama, int jumlahBaris,
            int jumlahKolom, int jumlahMissing) {
        this.nama = nama;
        this.jumlahBaris = jumlahBaris;
        this.jumlahKolom = jumlahKolom;
        this.jumlahMissing = jumlahMissing;
        totalDataset++;
    }

    // Getter dan setter nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan setter jumlah baris
    public int getJumlahBaris() {
        return jumlahBaris;
    }

    public void setJumlahBaris(int jumlahBaris) {
        // Nilai tidak diubah sesuai ketentuan soal
    }

    // Getter dan setter jumlah kolom
    public int getJumlahKolom() {
        return jumlahKolom;
    }

    public void setJumlahKolom(int jumlahKolom) {
        // Nilai tidak diubah sesuai ketentuan soal
    }

    // Getter dan setter jumlah missing
    public int getJumlahMissing() {
        return jumlahMissing;
    }

    public void setJumlahMissing(int jumlahMissing) {
        // Nilai tidak diubah sesuai ketentuan soal
    }

    // Menghitung persentase missing value
    public double getPersentaseMissing() {
        long totalSel = (long) jumlahBaris * jumlahKolom;

        if (totalSel == 0) {
            return 0;
        }

        return (double) jumlahMissing / totalSel * 100;
    }

    // Menentukan apakah dataset perlu dibersihkan
    public boolean perluDibersihkan() {
        return getPersentaseMissing() > BATAS_MISSING;
    }

    // Mengambil jumlah objek tanpa membuat objek baru
    public static int getTotalDataset() {
        return totalDataset;
    }
}
