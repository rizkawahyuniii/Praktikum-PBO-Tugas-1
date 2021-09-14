import java.util.Scanner;

public class bebekUntukTeman {
    public static void main(String[] args) {

        Scanner bebekScanner = new Scanner(System.in);
        int A = bebekScanner.nextInt();
        int B = bebekScanner.nextInt();
       
        int pembagian = A/B;
        int sisa = A%B;

        System.out.println("masing-masing " +pembagian);
        System.out.println("bersisa " +sisa);
        bebekScanner.close();
    }
}
