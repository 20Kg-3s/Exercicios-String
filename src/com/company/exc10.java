package com.company;

import java.util.Scanner;

public class exc10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro de 0 a 99");
        int numero = sc.nextInt();
        if (numero <= 10){
            System.out.println(unidade(numero));
        }else if (numero >= 11 && numero <=19){
            System.out.println(dezenas1(numero));
        }else if (numero >= 20 && numero <=99);{
            System.out.print(dezenas2(numero/10)+" e ");
            System.out.print(unidade(numero%10));
        }

    }
    public static String unidade (int numInput){
        String valUnidade;
        switch (numInput){
            case 1 -> {
                valUnidade = "Um";
            }
            case 2-> {
                valUnidade = "Dois";
            }
            case 3-> {
                valUnidade = "Três";
            }
            case 4-> {
                valUnidade = "Quatro";
            }
            case 5-> {
                valUnidade = "Cinco";
            }
            case 6-> {
                valUnidade = "Seis";
            }
            case 7-> {
                valUnidade = "Sete";
            }
            case 8-> {
                valUnidade = "Oito";
            }
            case 9-> {
                valUnidade = "Nove";
            }
            case 10-> {
                valUnidade = "Dez";
            }

            default->
                throw new IllegalStateException("Unexpected value: " + numInput);
        }
        return valUnidade;
    }
    public static String dezenas1 (int numInput){
        String valDezena1;
        switch(numInput){
            case 11->{
                valDezena1 = "Onze";
            }
            case 12->{
                valDezena1 = "Doze";
            }case 13->{
                valDezena1 = "Treze";
            }
            case 14->{
                valDezena1 = "Quatorze";
            }
            case 15->{
                valDezena1 = "Quinze";
            }
            case 16->{
                valDezena1 = "Dezeseis";
            }
            case 17->{
                valDezena1 = "Dezesete";
            }
            case 18->{
                valDezena1 = "Dezoito";
            }
            case 19->{
                valDezena1 = "Dezenove";
            }
            default -> throw new IllegalStateException("Unexpected value: " + numInput);

        }
        return valDezena1;
    }
    public static String dezenas2 (int numInput){
        String string;
        switch (numInput){
            case 2 -> {
                string = "Vinte";
            }
            case 3 -> {
                string = "Trinta";
            }
            case 4 -> {
                string = "Quarenta";
            }

            case 5 -> {
                string = "Cinquenta";
            }

            case 6 -> {
                string = "Sesenta";
            }

            case 7 -> {
                string = "Setenta";
            }
            case 8 -> {
                string = "Ointenta";
            }
            case 9 -> {
                string = "Noventa";
            }

            default -> throw new IllegalStateException("Unexpected value: " + numInput);
        }
        return string;
    }
}

