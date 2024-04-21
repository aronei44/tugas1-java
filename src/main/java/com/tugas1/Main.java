package com.tugas1;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // 1
        int jumlahBaris;
        String kalimatBaru;
        int empatAngka[] = {7, 10, 20, 23};
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
        LinkedList<Integer> listAngka = new LinkedList<>();
        listAngka.add(26);
        listAngka.add(8);
        listAngka.add(23);
        listAngka.add(24);
        listAngka.add(16);

        System.out.print(empatAngka[0] + " ");
    }
}