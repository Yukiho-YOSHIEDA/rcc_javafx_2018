import java.util.Scanner;

public class GetPokemon2{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int pokemonNum;

        printChooseGuide();

        pokemonNum = scanner.nextInt();

        choosePokemon(pokemonNum);

        scanner.close();
    }

    /**
     * ユーザがどうやってポケモンを選んだらいいか
     * ガイドを表示するメソッド
     */
    private static void printChooseGuide() {

    }

    /**
     * ポケモンの番号を引数として
     * 番号に該当するポケモンを表示するメソッド
     */
    private static void choosePokemon(int pokemonNum){

    }
}