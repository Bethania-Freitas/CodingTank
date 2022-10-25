import java.util.Scanner;

public class questao03 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite os 2 numeros que deseja calcular: ");
            String op1 = sc.next();
            String op2 = sc.next();

            if (op1.matches("[0-9]+") && op2.matches("[0-9]+")) {
                int num1 = Integer.parseInt(op1);
                int num2 = Integer.parseInt(op2);

                System.out.println("Agora digite a operação(+, -, *, /): ");
                String oper = sc.next();

                if(oper.contains("+")) {
                    System.out.printf(" A soma de %s + %s = %s", num1, num2, (num1 + num2) );
                } else if (oper.contains("-")){
                    System.out.printf(" A subtração de %s - %s = %s", num1, num2, (num1 - num2) );
                } else if (oper.contains("*")) {
                    System.out.printf(" A multiplicação de %s * %s = %s", num1, num2, (num1 * num2) );
                } else if (oper.contains("/")) {
                    System.out.printf(" A divisão de %s / %s = %s", num1, num2, (num1 / num2) );
                } else {
                    System.out.println("Operação Inválida!");
                }
            } else {
                System.out.println("Registro não reconhecido como numero");
            }

            sc.close();

        }
    }
