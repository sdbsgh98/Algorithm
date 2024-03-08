import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        for(int i = 1; i <= N; i++) {
            String star = "";
            for(int j = N-i-1; j >= 0; j--) {
                star += " ";
            }
            for(int j = 1; j <= 2*i-1; j++) {
                star += "*";
            }
            System.out.println(star);
        }

        for(int i = N-1; i >= 1; i--) {
            String star = "";
            for(int j = 1; j <= N-i; j++) {
                star += " ";
            }
            for(int j = 1; j <= 2*i-1; j++) {
                star += "*";
            }
            System.out.println(star);
        }
    }
}