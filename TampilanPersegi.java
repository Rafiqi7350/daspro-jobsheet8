import java.util.Scanner;

public class TampilanPersegi {
     public static void main(String[] args) {
        //Deklarasi
        Scanner sc = new Scanner(System.in);
        int N;

        //Syarat
        do {
            System.out.print("Masukkan Nilai N = ");
            N = sc.nextInt();
            if (N < 3) {
                System.out.println("Nilai Harus Minimal 3!");
            }
        } while (N < 3);
        //Outer loop
        for (int i = 1; i <= N; i++) {
            //Inner loop
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
     }
}
