import java.util.Scanner;

public class AplusB {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();


        System.out.println(sum(a, b));

    }


}
