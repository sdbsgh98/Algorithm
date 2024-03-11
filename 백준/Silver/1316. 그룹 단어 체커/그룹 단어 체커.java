import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean[] flag = new boolean[26];
            String word = sc.next();
            flag[word.charAt(0) - 97] = true;

            for (int j = 1; j < word.length(); j++) {
                if (word.charAt(j) != word.charAt(j - 1)) {
                    if (flag[word.charAt(j) - 97] == false) {
                        flag[word.charAt(j) - 97] = true;
                    } else {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(n - count);
    }
}