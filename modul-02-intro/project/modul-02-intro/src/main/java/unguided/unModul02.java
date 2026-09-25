/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author Admin
 */
public class unModul02 {

    public static void main(String[] args) {

        // Konstanta KKM
        final double KKM = 75.0;

        // Array 1 Dimensi untuk nama mahasiswa
        String[] nama = {
            "Andi",
            "Budi",
            "Citra"
        };

        // Array 2 Dimensi untuk nilai Modul 1 dan Modul 2
        double[][] nilai = {
            {80, 85},
            {70, 65},
            {75, 80}
        };

        // Judul
        System.out.println("=== SISTEM REKAP NILAI MAHASISWA ===");

        // Perulangan
        for (int i = 0; i < nama.length; i++) {

            // Menghitung rata-rata
            double rataRata = (nilai[i][0] + nilai[i][1]) / 2;

            // Menentukan status
            String status;

            if (rataRata >= KKM) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }

            // Menampilkan hasil
            System.out.println("Nama       : " + nama[i]);
            System.out.println("Modul 1    : " + nilai[i][0]);
            System.out.println("Modul 2    : " + nilai[i][1]);
            System.out.println("Rata-rata  : " + rataRata);
            System.out.println("Status     : " + status);
            System.out.println("-------------------------------");
        }
    }
}
