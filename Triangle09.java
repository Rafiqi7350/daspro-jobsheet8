import java.util.Scanner;

public class Triangle09 {
    
    public static void main(String[] args) {
        //Deklarasi
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai N = ");
        int N = sc.nextInt();
        int i = 0;
        
        //Outer loop 
        while (i<= N) {
            int j = 0;
            //Inner Loop
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
