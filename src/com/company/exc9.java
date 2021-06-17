package com.company;

import java.util.Scanner;

public class exc9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu CPF: (XXX.XXX.XXX-XX)");
        String cpf = sc.nextLine();
        String []cpfQuebrado = cpf.split("");
        boolean alavanca = true;


        while(alavanca){
            if (cpfQuebrado[3].equals(".")&&cpfQuebrado[7].equals(".")&&cpfQuebrado[11].equals("-")){
                System.out.println("CPF registrado com Sucesso!!");
                alavanca = false;
            }else {
                System.err.println("CPF inválido! Digite novamente");
                cpf = sc.nextLine();
                cpfQuebrado = cpf.split("");

            }

        }







    }
}
