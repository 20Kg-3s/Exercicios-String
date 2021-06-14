package com.company;

import java.util.Locale;
import java.util.Scanner;

public class exc4 {
    public static void main(String[] args) {
        System.out.println("Digite seu nome");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine().toUpperCase(Locale.ROOT);
        for (int i=0; i<nome.length();i++){
            System.out.println(nome.charAt(i));
        }
    }
}
