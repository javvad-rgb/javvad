import java.util.Scanner;
public class SIAKAD13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan kelas : ");
        char kelas = sc.next().charAt(0);
        System.out.print("Masukkan nomor absen : ");
        int absen = sc.nextInt();
        System.out.print("Masukkan nilai kuis : ");
        double nilaikuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas : ");
        double nilaitugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian : ");
        double nilaiujian = sc.nextDouble();
        
        double nilaiakhir = (nilaikuis + nilaitugas + nilaiujian) / 3;        
        String nilaihuruf = "";
        double nilaisetara = 0;
        String kualifikasi = "";
        
        if (nilaiakhir > 80 && nilaiakhir <= 100) {
            nilaihuruf = "A";
            nilaisetara = 4;
            kualifikasi = "Sangat Baik";
        } else if (nilaiakhir > 73 && nilaiakhir <= 80) {
            nilaihuruf = "B+";
            nilaisetara = 3.5;
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiakhir > 65 && nilaiakhir <= 73) {
            nilaihuruf = "B";
            nilaisetara = 3;
            kualifikasi = "Baik";
        } else if (nilaiakhir > 60 && nilaiakhir <= 65) {
            nilaihuruf = "C+";
            nilaisetara = 2.5;
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiakhir > 50 && nilaiakhir <= 60) {
            nilaihuruf = "C";
            nilaisetara = 2;
            kualifikasi = "Cukup";
        } else if (nilaiakhir > 39 && nilaiakhir <= 50) {
            nilaihuruf = "D";
            nilaisetara = 1;
            kualifikasi = "Kurang";
        } else {
            nilaihuruf = "E";
            nilaisetara = 0;
            kualifikasi = "Gagal";
        }
        
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai akhir : " + nilaiakhir);
        System.out.println("Nilai setara : " + nilaisetara);
        System.out.println("Nilai akhir huruf : " + nilaihuruf);
        System.out.println("Kualifikasi : " + kualifikasi);
        
        sc.close();
    }
}