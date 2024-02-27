import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int number = a * b * c;
        int[] count = new int[10];
        while(number > 0) {
            count[number % 10]++;
            number /= 10;
        }

        for(int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
    }
}