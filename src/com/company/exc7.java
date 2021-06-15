package com.company;

import java.util.Scanner;

public class exc7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase.");
        String frase = sc.nextLine();
        String[] espacos =  frase.split(" ");
        System.out.printf("Número de espaços: %d\n",(espacos.length - 1));
        char[] vogais = new char[frase.length()];
        frase.getChars(0,frase.length(),vogais,0);
        System.out.printf("Número de vogais: %d",contarVogais(vogais));
    }
    public static int contarVogais(char[] vogaisInput){
        int contador = 0;
        for (int i=0;i< vogaisInput.length;i++){
            switch (vogaisInput[i]){
                case 'a', 'A', 'á','Á', 'ã','Ã', 'â', 'Â','à', 'À':
                case 'e', 'E', 'é', 'É', 'ê', 'Ê', 'è', 'È':
                case 'i', 'I', 'í', 'Í', 'ì', 'Ì', 'î', 'Î':
                case 'o', 'O', 'ó', 'Ó', 'ò', 'Ò', 'ô', 'Ô', 'õ','Õ':
                case 'u', 'U', 'ú', 'Ú', 'ù', 'Ù', 'ü', 'Ü':
                    contador++;
                default:
            }
        }
        return contador;
    }
}

