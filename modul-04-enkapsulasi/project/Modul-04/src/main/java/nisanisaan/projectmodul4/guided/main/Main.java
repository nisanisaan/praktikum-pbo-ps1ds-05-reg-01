package nisanisaan.projectmodul4.guided.main;

import nisanisaan.projectmodul4.unguided.model.Dataset;
import nisanisaan.projectmodul4.unguided.laporan.LaporanDataset;

public class Main {

    public static void main(String[] args) {

        // Objek 1: constructor tanpa parameter
        Dataset dataset1 = new Dataset();

        dataset1.setNama("Titanic");
        dataset1.setJumlahBaris(891);
        dataset1.setJumlahKolom(12);
        dataset1.setJumlahMissing(866);

        // Objek 2: constructor dengan satu parameter
        Dataset dataset2 = new Dataset("Wine Quality");

        // Objek 3: constructor lengkap
        Dataset dataset3 = new Dataset(
                "Iris", 150, 5, 0
        );

        // Menyimpan ketiga objek ke dalam array
        Dataset[] daftarDataset = {
            dataset1, dataset2, dataset3
        };

        // Membuat objek laporan
        LaporanDataset laporan = new LaporanDataset();

        // Mencetak laporan menggunakan perulangan
        for (Dataset dataset : daftarDataset) {
            laporan.cetak(dataset);
        }

        // Menampilkan jumlah dataset yang dibuat
        System.out.println("Total dataset dibuat : "
                + Dataset.getTotalDataset());
    }
}