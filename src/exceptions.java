import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptions {

    public static void main(String[] args) {


    }

    private static int getNumber(Scanner input) {
        try {
            System.out.println("Digite o valor desejado.");
            return input.nextInt();
        } catch (InputMismatchException e) {
            input.nextInt();
            System.out.println("Tipo de valor digitado inválido.");
            return getNumber(input);
        } catch (Exception e) {
            input.nextInt();
            System.out.println("Não foi possivel obter o numero.");
            return getNumber(input);
        }
    }



}
