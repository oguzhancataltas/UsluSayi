import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, r, total = 1;

        System.out.println("Üslü sayılar a^r şeklinde gösterilir.");
        System.out.print("a değerini giriniz : ");
        a = scanner.nextInt();

        System.out.print("r değerini giriniz : ");
        r = scanner.nextInt();

        for (int i = 1; i <= r; i++){
            total *= a;
        }
        System.out.println(a + "^" + r + " değeri : " + total);
    }
}
