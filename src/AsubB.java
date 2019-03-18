import java.util.Scanner;

public class AsubB {

    public static int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();



        System.out.println(sub(a,b));

    }

}