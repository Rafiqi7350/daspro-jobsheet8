import java.util.Scanner;

public class PorseniPOLINEMA {
    public static void main(String[] args) {
        // Deklarasi
        Scanner sc = new Scanner(System.in);
        int jumlahPoliteknik = 5;

        // Mendefinisikan cabang olahraga yang dipertandingkan
        String cabangOlahraga1 = "Badminton";
        String cabangOlahraga2 = "Tenis Meja";
        String cabangOlahraga3 = "Basket";
        String cabangOlahraga4 = "Bola Voli";

        // Mengumpulkan informasi nama atlet untuk setiap cabang olahraga
        for (int i = 1; i <= jumlahPoliteknik; i++) {
            System.out.println("\n--- Politeknik ke-" + i + " ---");
            System.out.println("\n--- Daftar Nama Atlet Politeknik ke-" + i + " ---");

            // Badminton
            System.out.println("Masukkan nama atlet untuk cabang olahraga " + cabangOlahraga1 + ":");
            String atlet1Badminton = sc.nextLine();
            String atlet2Badminton = sc.nextLine();
            String atlet3Badminton = sc.nextLine();
            String atlet4Badminton = sc.nextLine();
            String atlet5Badminton = sc.nextLine();

            // Tenis Meja
            System.out.println("Masukkan nama atlet untuk cabang olahraga " + cabangOlahraga2 + ":");
            String atlet1TenisMeja = sc.nextLine();
            String atlet2TenisMeja = sc.nextLine();
            String atlet3TenisMeja = sc.nextLine();
            String atlet4TenisMeja = sc.nextLine();
            String atlet5TenisMeja = sc.nextLine();

            // Basket
            System.out.println("Masukkan nama atlet untuk cabang olahraga " + cabangOlahraga3 + ":");
            String atlet1Basket = sc.nextLine();
            String atlet2Basket = sc.nextLine();
            String atlet3Basket = sc.nextLine();
            String atlet4Basket = sc.nextLine();
            String atlet5Basket = sc.nextLine();

            // Bola Voli
            System.out.println("Masukkan nama atlet untuk cabang olahraga " + cabangOlahraga4 + ":");
            String atlet1BolaVoli = sc.nextLine();
            String atlet2BolaVoli = sc.nextLine();
            String atlet3BolaVoli = sc.nextLine();
            String atlet4BolaVoli = sc.nextLine();
            String atlet5BolaVoli = sc.nextLine();

            // Menampilkan nama atlet
            System.out.println("Cabang Olahraga " + cabangOlahraga1 + ":");
            System.out.println("Atlet 1: " + atlet1Badminton);
            System.out.println("Atlet 2: " + atlet2Badminton);
            System.out.println("Atlet 3: " + atlet3Badminton);
            System.out.println("Atlet 4: " + atlet4Badminton);
            System.out.println("Atlet 5: " + atlet5Badminton);

            System.out.println("Cabang Olahraga " + cabangOlahraga2 + ":");
            System.out.println("Atlet 1: " + atlet1TenisMeja);
            System.out.println("Atlet 2: " + atlet2TenisMeja);
            System.out.println("Atlet 3: " + atlet3TenisMeja);
            System.out.println("Atlet 4: " + atlet4TenisMeja);
            System.out.println("Atlet 5: " + atlet5TenisMeja);

            System.out.println("Cabang Olahraga " + cabangOlahraga3 + ":");
            System.out.println("Atlet 1: " + atlet1Basket);
            System.out.println("Atlet 2: " + atlet2Basket);
            System.out.println("Atlet 3: " + atlet3Basket);
            System.out.println("Atlet 4: " + atlet4Basket);
            System.out.println("Atlet 5: " + atlet5Basket);

            System.out.println("Cabang Olahraga " + cabangOlahraga4 + ":");
            System.out.println("Atlet 1: " + atlet1BolaVoli);
            System.out.println("Atlet 2: " + atlet2BolaVoli);
            System.out.println("Atlet 3: " + atlet3BolaVoli);
            System.out.println("Atlet 4: " + atlet4BolaVoli);
            System.out.println("Atlet 5: " + atlet5BolaVoli);
        }
    }
}
