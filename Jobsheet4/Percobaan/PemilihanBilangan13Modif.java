import java.util.Scanner;
public class PemilihanBilangan13Modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka ");
        int angka = sc.nextInt();

        String jenisBilangan = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";

        System.out.println("Angka " + angka + " termasuk " + jenisBilangan);

        sc.close();
    }
}