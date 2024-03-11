/*
Nama : Nurani Syahidah
NIM : 2200462
Kelas : Pendidikan Ilmu Komputer A 2022

SOAL 3 GENAP
Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, menghitung 
Pembagi Bersama Terbesar dari dua buah bilangan a dan b yang diinput dari alat 
masukan.
*/
package tugaspertemuan5;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        // Membaca dua bilangan a dan b dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan a: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan bilangan b: ");
        int b = scanner.nextInt();

        // Memanggil method untuk menghitung Pembagi Bersama Terbesar
        int hasil = hitungPembagiBersamaTerbesar(a, b);

        // Menampilkan hasil
        System.out.println("Pembagi Bersama Terbesar dari " + a + " dan " + b + " adalah: " + hasil);
    }

    // Method fungsi untuk menghitung Pembagi Bersama Terbesar (GCD)
    public static int hitungPembagiBersamaTerbesar(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
