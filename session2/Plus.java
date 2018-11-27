public class Plus{
    public static void main(String[] args) {

        System.out.println("This is bad case. -----");
        // Bad case
        int sum = 1 + 1;
        System.out.println(sum);
        sum = 4 + 5;
        System.out.println(sum);
        sum = 1 + 4;
        System.out.println(sum);
        sum = 1 + 9;
        System.out.println(sum);
        sum = 1 + 9;
        System.out.println(sum);

        System.out.println();

        System.out.println("This is good case. -----");
        // Good case
        calcPlus(1, 1);
        calcPlus(4, 5);
        calcPlus(1, 4);
        calcPlus(1, 9);
        calcPlus(1, 9);

    }

    private static void calcPlus(int num1, int num2){
        int sum = num1 + num2;
        System.out.println(sum);
    }
}