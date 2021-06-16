package com.company;

import java.util.Locale;
import java.util.Scanner;

public class novo_exc8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase para verificar se é ou não um palíndromo.");
        String frase = sc.nextLine();//atribuindo valor digitado pelo usuário a variavel.

        frase = frase.replaceAll("[ .]","");//removendo espaços caso haja algum.

        StringBuilder fraseInvertida = new StringBuilder();//Criando metodo string bilder.
        fraseInvertida.append(frase).reverse();// atribuindo valor de frase em fraseInvertida já invertendo a ordem.
        String fraseIvertidaParaComparar = String.valueOf(fraseInvertida).toUpperCase(Locale.ROOT);/*atribuindo o valor da frase invertida
        em outra variavel para comparar com a frase/palavra digitada pelo usuário.*/

        //mostrando a frase digitada e ela invertida.
        System.out.printf("%s Frase / Palavra Digitada", frase);
        System.out.printf("%s Frase / Palavra invertida", fraseIvertidaParaComparar);

        if (frase.equals(fraseIvertidaParaComparar)){
            System.out.println("É um palíndromo.");
        }else {
            System.out.println("Não é um palíndromo");
        }//metodo que compara se tem o mesmo conteúdo e retorna se é ou não um palíndromo.
    }
}
