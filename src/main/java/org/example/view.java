package org.example;

import java.util.Scanner;

public class view {
    public static void view() {
        int primeiro_numero, segundo_numero, resultado = 0;
        model modelo = new model();
        String operacao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o primeiro numero");

        primeiro_numero = entrada.nextInt();
        System.out.println("digite sua açao: soma (+), sutracao(-), divisao(/), multiplicacao(*)");

        operacao = entrada.next();

        System.out.println("digite o segundo numero");
        segundo_numero = entrada.nextInt();
        resultado = modelo.numero(primeiro_numero,operacao,segundo_numero);

        System.out.println(" ");
        System.out.println(primeiro_numero +" " +operacao + " " + segundo_numero +" " + "=" + " " + resultado);

    }
}