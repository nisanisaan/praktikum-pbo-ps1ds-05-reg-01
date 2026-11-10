package com.nisanisaan.modul09.unguided;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HasilEksperimen> daftar = new ArrayList<>();
        daftar.add(new HasilEksperimen("Logistic Regression", 0.82, 12));
        daftar.add(new HasilEksperimen("Random Forest", 0.91, 45));
        daftar.add(new HasilEksperimen("SVM", 0.87, 60));
        daftar.add(new HasilEksperimen("KNN", 0.79, 5));
        daftar.add(new HasilEksperimen("Decision Tree", 0.84, 8));

        System.out.println("Jumlah eksperimen: " + HasilEksperimen.getJumlahEksperimen());

        // Comparable
        Collections.sort(daftar);
        System.out.println("\nSorted by akurasi");
        for (HasilEksperimen h : daftar) System.out.println(h);

        // Comparator
        Collections.sort(daftar, new WaktuTrainingComparator());
        System.out.println("\nSorted by waktu training");
        for (HasilEksperimen h : daftar) System.out.println(h);

        // Filtering dengan lambda (urut akurasi agar sesuai contoh output)
        System.out.println("\nModel dengan akurasi minimal 0.85");
        daftar.stream()
              .filter(h -> h.getAkurasi() >= 0.85)
              .sorted()
              .forEach(System.out::println);

        // Pencarian dengan lambda
        System.out.println("\nPencarian model KNN");
        HasilEksperimen knn = daftar.stream()
                .filter(h -> h.getNamaModel().equals("KNN"))
                .findFirst()
                .orElse(null);
        System.out.println(knn);
    }
}