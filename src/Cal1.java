import java.util.Scanner;

public class Cal1 {
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int mul(int a, int b){
        return a * b;
    }
    public static int div(int a, int b) {
        return a / b;
    }

    public static int mod(int a, int b){
        return a % b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        a = input.nextInt();
        b = input.nextInt();
        System.out.println(sum(a, b));
        System.out.println(sub(a, b));
        System.out.println(mul(a, b));
        System.out.println(div(a, b));
        System.out.println(mod(a, b));

    }
}
