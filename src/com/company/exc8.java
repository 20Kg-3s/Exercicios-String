package com.company;


import java.util.Scanner;

public class exc8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = sc.nextLine();
        nome = nome.replaceAll("[ .]","");

        char[] letrasDoNome = new char[nome.length()];
        nome.getChars(0,nome.length(),letrasDoNome,0);
        char[] inverso = new char[letrasDoNome.length];

        for (int i = letrasDoNome.length - 1; i > 0;i--){
            for (int j=0;j< letrasDoNome.length - 1;j++){
                inverso[j] = letrasDoNome[i];
            }
            System.out.print(inverso[i - 1]);
        }

        String invertida = String.copyValueOf(inverso);
        String nome2 = String.copyValueOf(letrasDoNome);

        System.out.println(invertida);
        System.out.println(nome2);

        if (nome2.equals(invertida)){
            System.out.println("\nÉ um palíndromo!");
        }else{
            System.out.println("\nNão é um palíndromo!");
        }
    }
}
