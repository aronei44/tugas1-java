package com.tugas1;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // 1 Buatlah sebuah deklarasi variabel dengan tipe data integer yang bernama ‘jumlahBaris’?
        int jumlahBaris = 1;

        System.out.println("==== Soal 1 ====");
        System.out.println(jumlahBaris);

        // 2 Buatlah sebuah deklarasi variabel dengan tipe data string yang bernama ‘kalimatBaru’ yang berisi kata ‘Deklarasi tipe data String’?
        String kalimatBaru = "Deklarasi tipe data String";

        System.out.println("==== Soal 2 ====");
        System.out.println(kalimatBaru);

        // 3 Buatlah pendeklarasian array satu dimensi dengan nama ‘empatAngka’, tipe data integer, yang berisi angka (07, 10, 20, 23)? Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java.
        int empatAngka[] = {7, 10, 20, 23};

        System.out.println("==== Soal 3 ====");
        for (int i = 0; i < empatAngka.length; i++) {
            System.out.println(empatAngka[i]);
        }

        // 4 Buatlah pendeklarasian array dua dimensi dengan nama ‘alfabet’, tipe data string, yang berisi huruf (p, s, n), (w, l, b), (f, r, e)? Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java.
        String[][] alfabet = new String[3][3];
        alfabet[0][0] = "p";
        alfabet[0][1] = "s";
        alfabet[0][2] = "n";
        alfabet[1][0] = "w";
        alfabet[1][1] = "l";
        alfabet[1][2] = "b";
        alfabet[2][0] = "f";
        alfabet[2][1] = "r";
        alfabet[2][2] = "e";

        System.out.println("==== Soal 4 ====");
        for (int i = 0; i < alfabet.length; i++) {
            for (int j = 0; j < alfabet[i].length; j++) {
                System.out.print(alfabet[i][j] + " ");
            }
            System.out.println();
        }

        // 5 Buatlah pendeklarasian linked list dengan nama ‘listAngka’, tipe data integer, yang berisi angka (26, 8, 23, 24, 16)? Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java.
        LinkedList<Integer> listAngka = new LinkedList<>();
        listAngka.add(26);
        listAngka.add(8);
        listAngka.add(23);
        listAngka.add(24);
        listAngka.add(16);

        System.out.println("==== Soal 5 ====");
        for (int i = 0; i < listAngka.size(); i++) {
            System.out.println(listAngka.get(i));
        }
    }
}