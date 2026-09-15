import java.util.Scanner;

public class Kafe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu;
        char ukurancup;
        int jumlah;
        boolean keanggotaan;
        double hargamenu = 0;

        System.out.print("Masukkan Menu : ");
        menu = sc.nextLine();

        System.out.print("Masukkan ukuran cup : ");
        ukurancup = sc.next().charAt(0);

        System.out.print("Masukkan jumlah : ");
        jumlah = sc.nextInt();

        System.out.print("Masukkan keanggotaan (true/false) : ");
        keanggotaan = sc.nextBoolean();

        switch(menu.toLowerCase()){
            case "kopi":
                hargamenu = 12000;
                break;
            case "teh":
                hargamenu = 7000;
                break;
            case "coklat":
                hargamenu = 20000;
                break;
            default:
                System.out.println("Menu tidak tersedia.");
        }

        double totalharga = hargamenu * jumlah;

        switch (ukurancup) {
            case 'S':
                break;
            case 'M':
                totalharga += 0.25 * totalharga;
                break;
            case 'L':
                totalharga += 0.4 * totalharga;
                break;
        }

        double diskon = keanggotaan ? 0.1 : 0;
        double nominalbayar = totalharga - (diskon * totalharga);

        System.out.println("Item pembelian : " + jumlah + " " + menu + " dengan ukuran cup " + ukurancup);
        System.out.println("Nominal bayar : " + nominalbayar);
        
        sc.close();
    }
}