package com.nisanisaan.modul06.guided3;

public class Demo {
    public static void main(String[] args) {
        Lagu d,a;
        d = new Lagu();
        a = new Lagu();

        d.isiParam("Lagu 1");
        a.isiParam("Lagu 2", "aku");

        d.tampilkan();
        a.tampilkan();
    }
}