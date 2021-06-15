package com.company;

import java.util.Locale;
import java.util.Scanner;

public class exc5 {
    public static void main(String[] args) {
        System.out.println("Digite seu nome");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine().toUpperCase(Locale.ROOT);
        String[] letrasNome = nome.split("");

        for (int i= letrasNome.length; i>0;i--){
            for (int j=0; j<i;j++){
                System.out.print(letrasNome[j]);
            }
            System.out.println();
        }
    }
}
