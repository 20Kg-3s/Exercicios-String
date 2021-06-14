package com.company;

import java.util.Locale;
import java.util.Scanner;

public class exc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = sc.nextLine().toUpperCase(Locale.ROOT);
        char[] letrasDoNome = new char[nome.length()];
        nome.getChars(0,nome.length(),letrasDoNome,0);
        for (int i = letrasDoNome.length ; i > 0;i--){
            System.out.print(letrasDoNome[i - 1]);
        }
    }
}
