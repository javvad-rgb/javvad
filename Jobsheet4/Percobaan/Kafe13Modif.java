import java.util.Scanner;

public class Kafe13Modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ukuranCup;
        int harga = 0;

        System.out.print("Pilih ukuran cup (S/M/L): ");
        ukuranCup = sc.next().charAt(0);

        switch (ukuranCup) {
            case 'S':
                harga = 10000;
                System.out.println("Anda memilih ukuran Small, harga Rp" + harga);
                break;
            case 'M':
                harga = 15000;
                System.out.println("Anda memilih ukuran Medium, harga Rp" + harga);
                break;
            case 'L':
                harga = 20000;
                System.out.println("Anda memilih ukuran Large, harga Rp" + harga);
                break;
            default:
                System.out.println("Maaf, size yang Anda pilih tidak tersedia.");
                System.out.println("Silakan pilih ukuran S, M, atau L.");
                break;
        }

        sc.close();
    }
}