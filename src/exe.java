import java.util.InputMismatchException;
import java.util.Scanner;

public class exe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = getNumber(scanner);


    }

    private static int getNumber(Scanner scanner) {
        try {
            System.out.println("Digite o valor desejado.");
            return scanner.nextInt();
        } catch (InputMismatchException e) {

            }
        }
        return getNumber(scanner);
    }


}
