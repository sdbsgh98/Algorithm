import java.util.Scanner;

public class Main {
    public static void main(String[] rgs) {
        Scanner sc = new Scanner(System.in);

        int[][] paper = new int[100][100]; //가로 세로 크기가 각 100인 정사각형의 도화지
        int count = sc.nextInt(); //색종이의 수(색종이는 10*10 크기)

        //count 수 만큼 입력받기
        for(int i = 0; i < count; i++) {
            int x = sc.nextInt(); //x축
            int y = sc.nextInt(); //y축
            for(int j = x; j < x + 10; j++) {
                //사각형 부분에 1을 넣어주기
                for(int k = y; k < y + 10; k++) {
                    paper[k][j] = 1;
                }
            }
        }

        //2차원 배열 출력. 1인 숫자만 더하기
        int result = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] == 1) {
                    result += paper[i][j];
                }
            }
        }
        System.out.println(result);
    }
}