import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int primeiro_numero, segundo_numero,resultado = 0;
        String operacao;
        Scanner entrada = new Scanner(System.in);

            System.out.println("digite o primeiro numero");

            primeiro_numero = entrada.nextInt();
            System.out.println("digite sua açao: soma (+), sutracao(-), divisao(/), multiplicacao(*)");

            operacao = entrada.next();

            System.out.println("digite o segundo numero");
            segundo_numero = entrada.nextInt();


            if (operacao.equals("+")) {
                resultado = primeiro_numero + segundo_numero;
            } else if (operacao.equals("-")) {
                resultado = primeiro_numero - segundo_numero;
            } else if (operacao.equals("*")) {
                resultado = primeiro_numero * segundo_numero;
            } else if (operacao.equals("/")) {
                resultado = primeiro_numero / segundo_numero;
            }


            System.out.println(" ");
            System.out.println(primeiro_numero +" " +operacao + " " + segundo_numero +" " + "=" + " " + resultado);

        }

}