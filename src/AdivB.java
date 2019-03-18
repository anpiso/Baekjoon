import java.util.Scanner;

public class AdivB {
    public static double div(int a, int b){
        return (double) a / b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        a = input.nextInt();
        b = input.nextInt();

        System.out.printf("%.9f", div(a,b));

    }
}
