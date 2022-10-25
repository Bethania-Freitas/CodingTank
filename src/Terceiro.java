public class Terceiro {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
         String parimpar = (num1 % 2 == 0) ? "PAR" : "IMPAR"   ;
        System.out.println(parimpar);
    }
}


