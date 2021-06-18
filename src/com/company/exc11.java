package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class exc11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem Vindo ao jogo da forca!\nVocê terá 6 chances para descobrir a palavra, Boa Sorte!");
        System.out.println("Digite uma Letra");
        char letraInput = sc.next().charAt(0);
        System.out.println(letraInput);
        String invocarContrucao = randomizarPalavra();
        System.out.println(randomizarPalavra());
        contruindoForca(invocarContrucao,letraInput);


        for (int i=0;i<randomizarPalavra().length();i++){

        }


    }
    public static String randomizarPalavra(){
        String palavraRandom = null;
        try{
            Path caminho = Paths.get("D:/Users/Sick/Desktop/palavras.txt");
            List<String> palavras = Files.readAllLines(caminho);
            int random = (int)(Math.random()*palavras.size());
            palavraRandom = palavras.get(random);

        }catch (Exception erro) {
            erro.printStackTrace();
        }
        return palavraRandom;
    }
    public static String contruindoForca(String palavra, char letra){
        char[] letrasPalavra = new char[palavra.length()];//array guarda letras da palavra.
        palavra.getChars(0, palavra.length(),letrasPalavra,0);
        char[] rodape = new char[letrasPalavra.length];
        for (int i=0; i< letrasPalavra.length;i++) {
            rodape[i] = '_';
        }
        int tentativas = 6;
        for (int i=0;i<letrasPalavra.length;i++){
            if (letra == letrasPalavra[i]){
                System.out.println("Você descobriu uma letra!");
            }else{
                tentativas--;
                System.err.printf("Você errou 1 vez. Ainda te restam %d Chances. ", tentativas);
            }
        }


        return null;


    }
}
