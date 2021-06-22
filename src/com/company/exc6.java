package com.company;

import java.util.Scanner;

public class exc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua data de nascimento: (DD/MM/AAAA)");
        String data = sc.nextLine();
        String[] dataDesmontada = data.split("/");
        System.out.printf("Você nasceu em %s de %s de %s.",dataDesmontada[0],definirMes(dataDesmontada[1]),dataDesmontada[2]);
    }
    public static String definirMes(String mes){
        switch (mes){
            case "01": return "Janeiro";
            case "02": return "Fevereiro";
            case "03": return "Março";
            case "04": return "Abril";
            case "05": return "Maio";
            case "06": return "Junho";
            case "07": return "Julho";
            case "08": return "Agosto";
            case "09": return "Setembro";
            case "10": return "Outubro";
            case "11": return "Novembro";
            case "12": return "Dezembro";
            default:
                throw new IllegalStateException("Unexpected value: " + mes);
        }
    }
}
