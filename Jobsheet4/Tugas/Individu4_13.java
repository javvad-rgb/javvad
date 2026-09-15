import java.util.Scanner;

public class Individu4_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int usia;

        System.out.print("Masukkan usia: ");
        usia = sc.nextInt();

        if (usia < 0) {
            System.out.println("Usia tidak valid. Masukkan angka positif.");
        } else if (usia <= 12) {
            System.out.println("Kategori usia: Anak");
        } else if (usia <= 19) {
            System.out.println("Kategori usia: Remaja");
        } else if (usia <= 64) {
            System.out.println("Kategori usia: Dewasa");
        } else {
            System.out.println("Kategori usia: Lansia");
        }

        sc.close();
    }
}