import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long result = (a + b) * (a - b);

        System.out.println(result);

        sc.close();
    }
}