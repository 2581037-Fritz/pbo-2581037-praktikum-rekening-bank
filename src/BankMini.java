import java.util.Scanner;

public class BankMini {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat satu object Rekening
        Rekening rekening = new Rekening("001", "Ani", 100000);

        System.out.println("=========== BANK MINI ===========");
        System.out.println("Rekening " + rekening.getNomor() + " a.n. " + rekening.getPemilik());

        int menu = -1;

        // Menjalankan menu sampai diketik 0
        while (menu != 0) {
            System.out.print("Menu (1 setor, 2 tarik, 3 info, 0 keluar): ");
            menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("Jumlah: ");
                int jumlah = scanner.nextInt();
                if (rekening.setor(jumlah)) System.out.println("  Berhasil");
                else System.out.println("  Ditolak");
            } else if (menu == 2) {
                System.out.print("Jumlah: ");
                int jumlah = scanner.nextInt();
                if (rekening.tarik(jumlah)) System.out.println("  Berhasil");
                else System.out.println("  Ditolak");
            } else if (menu == 3) {
                rekening.cetakInfo();
            } else if (menu == 0) {
                // Keluar
            } else {
                System.out.println("Menu tidak dikenal.");
            }
        }

        // Sesudah keluar dari menu, cetak info rekening sekali lagi sebagai saldo akhir
        System.out.println("\n=========== SALDO AKHIR ===========");
        rekening.cetakInfo();

        /*
         * TUGAS NO 7: Komentar Error dari IDE
         *
         * rekening.saldo = 1000000;
         *
         * Pesan error saat di-compile:
         * java: saldo has private access in Rekening
         */
    }
}