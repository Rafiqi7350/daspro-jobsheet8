import java.util.Scanner;

public class star09 {

    public static void main(String[] args) {
        //Deklarasi
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai N = ");
        int N = sc.nextInt();
        
        //Inner Loop
        for (int i = 1; i <= N; i++) {
            System.out.print("*");
        }
    }
}