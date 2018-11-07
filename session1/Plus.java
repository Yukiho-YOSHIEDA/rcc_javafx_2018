import java.util.Scanner;

public class Plus{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("1つめの数字を入力してください : ");
        num1 = scanner.nextInt();
        System.out.print("2つめの数字を入力してください : ");
        num2 = scanner.nextInt();

        sum = num1 + num2;

        System.out.println("足し算の結果は" + sum + "です");

        scanner.close();
    }
}