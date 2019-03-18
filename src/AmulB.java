import java.util.Scanner;

public class AmulB {
        public static int mul(int a, int b){
            return a * b;
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int a, b;

            a = input.nextInt();
            b = input.nextInt();

            System.out.println(mul(a,b));

        }
}
