import java.util.Scanner;

public class GetPokemon{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int pokemonNum;

        System.out.println("ポケモンを選択してください");
        System.out.println("  0 -> 左のモンスターボール");
        System.out.println("  1 -> 真ん中のモンスターボール");
        System.out.println("  2 -> 右のモンスターボール");
        System.out.print("さぁ、どれを選ぶ？ : ");
        pokemonNum = scanner.nextInt();

        switch(pokemonNum){
            case 0:
                System.out.println("あなたはポッチャマを手に入れた！");
                break;
            case 1:
                System.out.println("あなたはヒコザルを手に入れた！");
                break;
            case 2:
                System.out.println("あなたは萎えとるを手に入れた！");
                break;
            default:
                System.out.println("そんな選択肢はないのじゃぞ");
        }

        scanner.close();
    }
}