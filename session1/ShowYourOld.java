import java.util.Scanner;

public class ShowYourOld{
    public static void main(String[] args) throws Exception {
        System.out.println("あなたの年齢は？");

        Scanner scanner = new Scanner(System.in);

        // こ↑こ↓ 重要
        int old = scanner.nextInt();

        System.out.println("あなたの年齢は" + old + "歳ですね");

        scanner.close();
    }
}