/*
Nama : Nurani Syahidah
NIM : 2200462
Kelas : Pendidikan Ilmu Komputer A 2022

SOAL 1 GENAP
Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, mengulang 
menuliskan teks “Saya senang belajar bahasa Java” sebanyak N kali, dengan nilai 
N yang akan dibaca dengan perintah inputan menggunakan perulangan for.*/
package tugaspertemuan5;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        // Membaca nilai N dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();

        // Memanggil method untuk menuliskan teks sebanyak N kali
        tulisTeks(N);
    }

    // Method prosedur untuk menuliskan teks sebanyak N kali
    public static void tulisTeks(int N) {
        for (int i = 0; i < N; i++) {
            System.out.println("Saya senang belajar bahasa Java");
        }
    }
}
