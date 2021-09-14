import java.util.Scanner;

public class ATambahB {
    public static void main(String[] args) {

        Scanner bebek = new Scanner(System.in);
        int A = bebek.nextInt();
        int B = bebek.nextInt();

        int total = A+B;
        
        System.out.println(total);
        bebek.close();
    }
    
}