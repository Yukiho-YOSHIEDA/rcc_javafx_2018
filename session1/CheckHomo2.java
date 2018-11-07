import java.util.Scanner;

public class CheckHomo2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        do{
            System.out.println("ホモですか？");
            System.out.println(" 0 -> はい");
            System.out.println(" 1 -> いいえ");

            input = scanner.nextInt();

            if(input == 0){
                break;
            }

            System.out.println("ホモは嘘つき");
        }while(true);

        System.out.println("やっぱりホモじゃないか！");

        scanner.close();
    }
}