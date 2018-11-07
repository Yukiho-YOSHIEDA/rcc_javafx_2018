import java.util.Scanner;

public class CheckMultiple{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("数字を入力してください : ");
        num = scanner.nextInt();

        if(num % 12 == 0){
            System.out.println("入力された数字は12の倍数です");
        } else if(num % 3 == 0) {
            System.out.println("入力された数字は3の倍数です");
        } else {
            System.out.println("入力された数字は12の倍数でも3の倍数でもありません");
        }

        scanner.close();
    }
}