package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Nama Dan Usia Anda");
        String nama = scanner.nextLine();
        String usia = scanner.nextLine();
        System.out.println("Halo," + nama);
        System.out.println("Ternyata Usiamu Baru " + usia + " Tahun ya.");

    }
}
