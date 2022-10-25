import java.util.Scanner;

public class funcao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro numero:");
        int numero2 = scanner.nextInt();
        System.out.println(getNumber(numero1, numero2));
    }

    private static int getNumber(int n1, int n2) {
        int soma = n1 + n2;
        return soma;
    }
}
