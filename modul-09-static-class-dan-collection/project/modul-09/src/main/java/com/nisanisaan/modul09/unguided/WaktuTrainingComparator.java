package com.nisanisaan.modul09.unguided;

import java.util.Comparator;

public class WaktuTrainingComparator implements Comparator<HasilEksperimen> {
    // Waktu training tercepat ke terlama
    @Override
    public int compare(HasilEksperimen a, HasilEksperimen b) {
        return Integer.compare(a.getWaktuTraining(), b.getWaktuTraining());
    }
}