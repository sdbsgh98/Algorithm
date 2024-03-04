import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); //첫번째 주사위
        int B = sc.nextInt(); //두번째 주사위
        int C = sc.nextInt(); //세번째 주사위

        if(A == B && A == C) {                            // 3개다 같을 경우 10000 + (같은눈) * 1000
            System.out.println(10000 + A * 1000);
        } else if(A == B && A != C || A == C && A != B) { // 2개만 같은 경우 1000 + (같은눈) * 100
            System.out.println(1000 + A * 100);
        } else if(B == C && B != A) {                     // 2개만 같은 경우 1000 + (같은눈) * 100
            System.out.println(1000 + B * 100);
        } else {                                          // 모두 다른 눈이 나오는 경우
            int max = A;                                  // (그중 가장 큰눈) * 100
            if(max < B) max = B;
            if(max < C) max = C;
            System.out.println(max * 100);
        }
    }
}