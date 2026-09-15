import java.util.Scanner;
public class PemilihanHari13If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Angka ");
        int angka = sc.nextInt();

        if (angka >= 2 && angka >= 5){
            System.out.print("weekday");
        }
        else if (angka == 6 || angka == 7){
            System.out.print("weekend");
        }
        else {
            System.out.print("Invalid number");
        }

        sc.close();
    }
}
