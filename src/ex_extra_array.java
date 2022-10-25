// Digite um começo e um fim para uma contagem de numeros primos e armazene em array.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex_extra_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para começar a contagem: ");
        int inicio = scanner.nextInt();
        System.out.print("Digite o numero onde quer encerrar a contagem: ");
        int fim = scanner.nextInt();
        contagem(inicio, fim);
    }
    public static void contagem(int inicio, int fim) {
        List<Integer> testList = new ArrayList<Integer>();

        for (int i = inicio + 1; i <= fim; i++) {
            testList.add(i);
        }
        System.out.println(testList);

    }

}
