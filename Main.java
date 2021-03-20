import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        System.out.println("Hello World");
        System.out.println(1 + 1);
        Scanner scan = new Scanner(System.in);
        System.out.println("素数判定したい数字を入力してください。");
        int p = scan.nextInt();
        Main main = new Main();
        if(main.isPrime(p)) {
            System.out.println(p + "は素数");
        } else {
            System.out.println(p + "は素数でない");
        }
    }

    private boolean isPrime(int p) {
        int sqrtP = (int)Math.sqrt(p);
        for(int i = 2; i <= sqrtP; i++) {
            if(p % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}