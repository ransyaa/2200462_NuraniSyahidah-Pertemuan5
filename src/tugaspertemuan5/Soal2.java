/*
Nama : Nurani Syahidah
NIM : 2200462
Kelas : Pendidikan Ilmu Komputer A 2022

SOAL 2 GENAP
Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, menampilkan
jumlah deret bilangan genap dari batasAwal dan batasAkhir yang diinput dari alat
masukan.
*/
package tugaspertemuan5;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        // Membaca batasAwal dan batasAkhir dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();

        // Memanggil method untuk menampilkan jumlah deret bilangan genap
        tampilkanDeretGenap(batasAwal, batasAkhir);
    }

    // Method prosedur untuk menampilkan jumlah deret bilangan genap
    public static void tampilkanDeretGenap(int batasAwal, int batasAkhir) {
        int sum = 0;

        // Loop untuk menjumlahkan bilangan genap dalam range
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }

        // Menampilkan hasil jumlah deret bilangan genap
        System.out.println("Jumlah deret bilangan genap: " + sum);
    }
}
