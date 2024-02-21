import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        int pact = 1;

        for(int i = 1; i <= n; i++) {
            pact *= i ;
        }

        System.out.println(pact);

        sc.close();
    }
}
