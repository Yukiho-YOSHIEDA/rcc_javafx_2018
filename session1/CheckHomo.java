import java.util.Scanner;

public class CheckHomo{
    public static void main(String[] args) {
        boolean isHomo = false;
        Scanner scanner = new Scanner(System.in);
        int input;

        while(!isHomo){
            System.out.println("ホモですか？");
            System.out.println(" 0 -> はい");
            System.out.println(" 1 -> いいえ");

            input = scanner.nextInt();

            if(input == 0){
                isHomo = true;
            }

            System.out.println("ホモは嘘つき");
        }

        System.out.println("やっぱりホモじゃないか！");

        scanner.close();
    }
}