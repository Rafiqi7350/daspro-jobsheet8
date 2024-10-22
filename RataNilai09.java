import java.util.Scanner;

public class RataNilai09 {

    public static void main(String[] args) {
        //Deklarasi
        Scanner sc = new Scanner(System.in);
        float totalNilai, rataNilai;
        int nilaiMhs;
        int i = 1; 
        totalNilai = 0;

        // Outer loop
        while (i <= 5) {
            System.out.println("Masukkan nilai untuk Mahasiswa ke-" + i);
            float totalNilaiMahasiswa = 0; 
            
            // Inner loop 
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = sc.nextInt();
                totalNilaiMahasiswa += nilaiMhs; 
            }
            
            // Hitung rata-rata tiap mahasiswa
            rataNilai = totalNilaiMahasiswa / 5; 
            System.out.println("Rata-rata Nilai Mahasiswa ke-" + i + " = " + rataNilai);
            totalNilai += totalNilaiMahasiswa; 
            i++; 
        }
       
    }
}
