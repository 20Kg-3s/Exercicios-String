package com.company;

import java.util.Scanner;

public class exc1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite duas Strings para comparação:");
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();
        formulador(string1,string2);
        testes(string1,string2);
    }

    public static void testes(String stringtest1, String stringtest2) {
        if (stringtest1.equals(stringtest2)) {
            System.out.println("As Strings tem o mesmo conteúdo");

        } else {
            System.out.println("As Strings tem conteudos diferentes");
        }
        if (stringtest1.length() == stringtest2.length()){
            System.out.println("As Strings tem o mesmo tamanho");
        }else{
            System.out.println("As Strings tem tamanhos diferentes");
        }
    }

    public static void formulador  (String stringInput1, String stringInput2){
        System.out.println("String 1: " + stringInput1);
        System.out.println("String 2: " + stringInput2);
        System.out.println("Tamanho de " + "'" + stringInput1 + "':" + stringInput1.length() + " caracteres");
        System.out.println("Tamanho de " + "'" + stringInput2 + "':" + stringInput2.length() + " caracteres");
    }
}
