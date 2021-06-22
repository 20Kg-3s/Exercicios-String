package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class exc11 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem Vindo ao jogo da forca!\nVocê terá 6 chances para descobrir a palavra, Boa Sorte!");
        System.out.println("Digite uma Letra");
        int chances = 6;
        char letraInput = sc.next().charAt(0);
        System.out.println(letraInput);
        String invocarContrucao = randomizarPalavra();
        System.out.println(invocarContrucao);
        char[] invocarQuebra = palavraQuebrada(invocarContrucao);
        contruindoForca(letraInput,invocarQuebra);
        char[] invocarTestes = contruindoForca();
        testeLetras(invocarQuebra,letraInput);

    }
    public static String randomizarPalavra() throws IOException {
        Path caminho = Paths.get("D:\\Users\\Sick\\IdeaProjects\\Exercicios String\\src\\com\\company\\palavras.txt");
        List<String> palavras = Files.readAllLines(caminho);
        int random = (int)(Math.random()*palavras.size());
        return palavras.get(random);
    }
    public static char[] palavraQuebrada (String palavra){
        char[] letrasPalavra = new char[palavra.length()];//array guarda letras da palavra.
        palavra.getChars(0, palavra.length(),letrasPalavra,0);
        return letrasPalavra;
    }
    public static char[]  contruindoForca(char letra,char[]letrasPalavra) {
        char[] rodapeVolatil = new char[letrasPalavra.length];
        for (int i = 0; i < letrasPalavra.length; i++) {
            rodapeVolatil[i] = '_';
        }
        return rodapeVolatil;
    }
    public static void testeLetras(char[] letrasPalavra,char letra){
        boolean acerto = false;
        for (int i=0;i<letrasPalavra.length;i++){
            if (letra == letrasPalavra[i]){
                acerto = true;
                System.out.println("Você descobriu uma letra!");
                rodapeVolatil[i] = letrasPalavra[i];
            }
        }
        System.out.println(rodapeVolatil);
        if (!acerto){
            chances--;
            System.out.printf("Você ainda possui %d Chances", chances);
        }
    }
}
