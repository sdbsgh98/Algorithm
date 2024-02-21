import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        int i = 1;

        while(i <= N) {
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}
