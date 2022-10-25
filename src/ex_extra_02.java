import java.util.Locale;
import java.util.Scanner;

public class ex_extra_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        double media = 0.0;
        double n1 = 0.0;

        System.out.println("Digite a nota do aluno entre 0 e 10: ");
        n1 = scanner.nextDouble();

        while (n1 != -1.0) {
            if (n1 > 10.0) {
                System.out.println("Valor Inválido");
                n1 = 0;
            } else {
                media += n1;
                contador++;
                n1 = 0;
                System.out.println("Digite a nota do aluno entre 0 e 10: ");
                n1 = scanner.nextDouble();
            }
        }
            media = media / contador;
            System.out.println("Você digitou: " + contador + " valores. ");
            System.out.println("Sua média final é de: " + media);

    }
}
