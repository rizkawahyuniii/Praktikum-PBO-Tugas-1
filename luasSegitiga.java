import java.util.Scanner;

public class luasSegitiga {
    public static void main(String[] args) {
        
        Scanner segitiga = new Scanner(System.in);
        float a = segitiga.nextFloat();
        float t = segitiga.nextFloat();

        float luas = a*t/2;

        System.out.printf("%.2f",luas);
        segitiga.close();
    }
}

