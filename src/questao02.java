import java.sql.SQLOutput;
import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (args.length == 2) {
            System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
        } else {
            System.out.println("Digite 2 numeros para realizar a soma: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("A soma dos numeros é: " + (num1 + num2));
        }

        sc.close();
    }

}
